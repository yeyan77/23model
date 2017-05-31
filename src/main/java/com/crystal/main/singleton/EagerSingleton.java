package com.crystal.main.singleton;

/**
 * 饿汉式单例类
 * Created by hp on 2017-05-31.
 */
public class EagerSingleton {
    private static EagerSingleton instance = new EagerSingleton();

    /**
     * 私有默认构造
     */
    private EagerSingleton(){}

    private static EagerSingleton getInstance(){
        return instance;
    }
}
