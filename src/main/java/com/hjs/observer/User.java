package com.hjs.observer;

/**
 * 定义具体的观察者，微信公众号的具体观察者为User
 *
 */
public class User implements Observer {

    private String name;
    private String message;

    public User(String name){
        this.name = name;
    }

    public void read(){
        System.out.println(name + " 收到推送消息：" + message );
    }

    public void update(String msg) {

        this.message = msg;
        read();

    }
}
