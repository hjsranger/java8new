package com.hjs.observer;

/**
 * 抽象被观察者
 * 声明了添加、删除、通知观察者方法
 */
public interface Observerable {

    public void registerObserver(Observer o);
    public void removeObserver(Observer o);
    public void notifyObserver();
}
