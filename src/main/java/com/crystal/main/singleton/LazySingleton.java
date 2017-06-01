package com.crystal.main.singleton;

/**
 * 懒汉式单例类
 *
 * 懒汉式是典型的时间换空间,
 * 就是每次获取实例都会进行判断，看是否需要创建实例，浪费判断的时间。
 * 当然，如果一直没有人使用的话，那就不会创建实例，则节约内存空间
 * Created by hp on 2017-06-01.
 */
public class LazySingleton {
    private static LazySingleton instance = null;

    private LazySingleton(){}

    public  static synchronized LazySingleton getInstance(){
        if(instance == null){
            instance = new LazySingleton();
        }

        return instance;
    }

}
