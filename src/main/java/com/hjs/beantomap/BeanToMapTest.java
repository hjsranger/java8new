package com.hjs.beantomap;


import java.beans.BeanInfo;
import java.beans.IntrospectionException;
import java.beans.Introspector;
import java.beans.PropertyDescriptor;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

/**
 *
 */
public class BeanToMapTest {


    public static void main(String[] args) {

        Person person = new Person();
        person.setId("HJS");
        person.setName("黄建爽");

        Map<String,Object> map = transBean2Map(person);
        System.out.println(map.toString());

    }


    /**
     * Bean转成Map
     * @param object
     * @return
     */
    private static Map<String,Object> transBean2Map(Object object){

        Map<String,Object> map = new HashMap<>();

        try {
            BeanInfo beanInfo = Introspector.getBeanInfo(object.getClass());

            PropertyDescriptor[] propertyDescriptors = beanInfo.getPropertyDescriptors();

            for(PropertyDescriptor property : propertyDescriptors){

                String key = property.getName();

                if(!key.equals("class")){

                    Method getter = property.getReadMethod();
                    Object value = getter.invoke(object);

                    map.put(key,value);
                }
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        return map;

    }

}
