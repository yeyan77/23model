package com.crystal.main.singleton;

/**
 *
 * 单例和枚举
 * 按照《高效Java 第二版》中的说法：
 * 单元素的枚举类型已经成为实现Singleton的最佳方法。用枚举来实现单例非常简单，只需要编写一个包含单个元素的枚举类型即可
 *
 *
 *  通过enum关键字来实现枚举，在枚举中需要注意的有：

 1. 枚举中的属性必须放在最前面，一般使用大写字母表示

 2. 枚举中可以和java类一样定义方法

 3. 枚举中的构造方法必须是私有的

    通过一个java类来模拟枚举的功能：
 * Created by hp on 2017-06-01.
 */
public class EnumSingleton {

    public  static void main(String[] arg){
//        System.out.println(WeekDay.SUN.nextDay());
//        System.out.println(WeekDay.MON.nextDay());

//        System.out.println(TrafficLamp.GREEN);

        MyDataBaseSource.DATASOURCE.getConnection();
        MyDataBaseSource.DATASOURCE.getConnection();
        MyDataBaseSource.DATASOURCE.getConnection();

    }

}
