package com.crystal.main.singleton;

/**
 * 可以在枚举属性后面添加()来调用指定参数的构造方法，添加{}来实现其对应的匿名内部类
 *
 * Created by hp on 2017-06-01.
 */
public enum  TrafficLamp {
    RED(30){
        public TrafficLamp nextLamp(){
            return GREEN;
        }
    },
    GREEN(20){
        public TrafficLamp nextLamp(){
            return YELLOW;
        }
    },
    YELLOW(10){
        public  TrafficLamp nextLamp(){
            return RED;
        }
    };

    private int time;
    TrafficLamp(int time){
        this.time = time;
        System.out.println(time);
    }

    public abstract TrafficLamp nextLamp();
}
