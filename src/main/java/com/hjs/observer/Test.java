package com.hjs.observer;

public class Test {

    public static void main(String[] args) {

        WechartServer server = new WechartServer();

        Observer userZhang = new User("张三");
        Observer userWang = new User("王五");
        Observer userLi = new User("李四");

        server.registerObserver(userZhang);
        server.registerObserver(userLi);
        server.registerObserver(userWang);

        server.setMessage("今天是周二");

        System.out.println("-----------分割线-------------");

        server.removeObserver(userLi);

        server.setMessage("不对，今天不是周二");

    }

}
