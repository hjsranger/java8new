package com.hjs.newcharter;


import java.util.ArrayList;
import java.util.List;

/**
 * lambda表达式
 * java8新特性
 */
public class Lambda1 {


    public static void main(String[] args) {

        Lambda1 tester = new Lambda1();

        MathOperation addition = (int a, int b) -> a+b;
        MathOperation subtraction = (a,b) -> a-b;
        MathOperation multip = (int a, int b) -> {return a*b;};
        MathOperation division = (a,b) -> a/b;

        System.out.println("10+5=" + tester.operate(10,5,addition));

        GreetingService service = message ->
                System.out.println("Hello "+message);

        GreetingService service1 = (message) -> {
            System.out.println("Hello "+message);
        };

        service.sayMessage("HJS");



    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService{
        void sayMessage(String message);
    }


    /**
     * 处理a和b
     * @param a
     * @param b
     * @param mathOperation
     * @return
     */
    private int operate(int a, int b, MathOperation mathOperation){
        return mathOperation.operation(a,b);
    }


}
