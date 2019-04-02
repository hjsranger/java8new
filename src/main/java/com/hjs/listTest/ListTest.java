package com.hjs.listTest;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * @Auther: jianshuang_huang
 * @Date: 2019/4/2 10:52
 * @Description:
 */
public class ListTest {

    public static void main(String[] args) {

        Long t1 = System.currentTimeMillis();

        List<String> list1 = new ArrayList<>();

        for(int i= 0; i<1000;i++){
            list1.add("HJS"+i);
        }

        List<String> list2 = new ArrayList<>();
        for(int i= 5; i<1005;i++){
            list2.add("HJS"+i);
        }

        test3(list1,list2);


        System.out.println(System.currentTimeMillis()-t1);

    }



    public static void test2(List<String> list1 , List<String> list2){
        for(int i = 0;i<list1.size();i++){
            String str1 = list1.get(i);

            for(int j = 0;j<list2.size();j++){
                String str2 = list2.get(j);

                if(str1.equals(str2)){
                    list1.remove(str1);
                    i -- ;
                    list2.remove(str2);
                    j -- ;
                }

            }

        }

        //打印出
        for(String str1 : list1){
            System.out.println("需要删除的"+str1);
        }
        //打印出
        for(String str2 : list2){
            System.out.println("需要增加的的"+str2);
        }
    }

    public static void test3(List<String> list1 , List<String> list2){

        List<String> needADDList = new ArrayList<>();
        Map<String,String> map1 = new HashMap<>(list1.size());

        for(String str : list1){
            map1.put(str,str);
        }

        for(String str : list2){

            if(map1.get(str) == null){
                needADDList.add(str);
            }

        }

        List<String> needDeleteList = new ArrayList<>();

        Map<String,String> map2 = new HashMap<>(list2.size());
        for(String str : list2){
            map2.put(str,str);
        }

        for(String str : list1){
            if(map2.get(str) == null){
                needDeleteList.add(str);
            }
        }


        //打印出
        for(String str1 : needADDList){
            System.out.println("需要增加的"+str1);
        }
        //打印出
        for(String str1 : needDeleteList){
            System.out.println("需要删除的"+str1);
        }

    }

}
