package com.hjs.newcharter;


import java.util.Optional;

/**
 * Optional 类是一个可以为null的容器对象。如果值存在则isPresent()方法会返回true，调用get()方法会返回该对象。
 * Optional 是个容器：它可以保存类型T的值，或者仅仅保存null。Optional提供很多有用的方法，这样我们就不用显式进行空值检测。
 * Optional 类的引入很好的解决空指针异常。
 */
public class OptionalTest {


    public static void main(String[] args) {

        Integer n1 = new Integer(4);
        Integer n2 = new Integer(2);

        Optional<Integer> o1 = Optional.ofNullable(n1);
        Optional<Integer> o2 = Optional.of(n2);

        OptionalTest test = new OptionalTest();
        System.out.println(test.sum(o1,o2));




    }


    public Integer sum(Optional<Integer> o1, Optional<Integer> o2){

        //判断参数是否存在
        System.out.println("第1个参数是否存在：" + o1.isPresent());
        System.out.println("第2个参数是否存在：" + o2.isPresent());

        //orElse如果存在返回，如果不存在返回默认值
        Integer n1 = o1.orElse(new Integer(0));

        Integer n2 = o2.get();

        return n1 + n2;

    }

}
