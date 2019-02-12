package com.hjs.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 定义被观察者，实现了Observerable接口
 * 对Observerable接口的三个方法进行了具体实现
 * 同时有个List结合，用于保存注册的观察者，等需要通知观察者时，遍历该集合即可
 */
public class WechartServer implements Observerable {

    private List<Observer> list;
    private String message;

    public WechartServer(){
        list = new ArrayList<Observer>();
    }


    public void registerObserver(Observer o) {

        list.add(o);

    }

    public void removeObserver(Observer o) {

        if(!list.isEmpty()){
            list.remove(o);
        }

    }

    public void notifyObserver() {

        for(Observer o: list){
            o.update(message);
        }
    }

    public void setMessage(String msg){
        this.message = msg;
        System.out.println("微信服务更新消息："+msg);
        notifyObserver();
    }
}
