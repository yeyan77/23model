package com.crystal.main.singleton;

import sun.misc.SignalHandler;

/**
 * Lazy initialization holder class模式
 *
 * 类级内部类指的是，有static修饰的成员式内部类。如果没有static修饰的成员式内部类被称为对象级内部类。
 *
 * 在多线程开发中，为了解决并发问题，主要是通过使用synchronized来加互斥锁进行同步控制。
 * 但是在某些情况中，JVM已经隐含地为您执行了同步，这些情况下就不用自己再来进行同步控制了。这些情况包括：

 　　1.由静态初始化器（在静态字段上或static{}块中的初始化器）初始化数据时

 　　2.访问final字段时

 　　3.在创建线程之前创建对象时

 　　4.线程可以看见它将要处理的对象时

 *
 *
 * 当getInstance方法第一次被调用的时候，它第一次读取SingletonHolder.instance，
 * 导致SingletonHolder类得到初始化；而这个类在装载并被初始化的时候，会初始化它的静态域，从而创建Singleton的实例，
 * 由于是静态的域，因此只会在虚拟机装载类的时候初始化一次，并由虚拟机来保证它的线程安全性。

 　这个模式的优势在于，getInstance方法并没有被同步，并且只是执行一个域的访问，因此延迟初始化并没有增加任何访问成本
 */
public class Singleton2 {

    private Singleton2(){}
    /**
     *    类级的内部类，也就是静态的成员式内部类，该内部类的实例与外部类的实例
     *    没有绑定关系，而且只有被调用到时才会装载，从而实现了延迟加载。
     */
    private static class SingletonHolder{
        /**
         * 静态初始化器，由JVM来保证线程安全
         */
        private static Singleton2 instance = new Singleton2();
    }

    public static Singleton2 getInstance(){
        return SingletonHolder.instance;
    }
}
