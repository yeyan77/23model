package com.crystal.main.Bridge;

import com.crystal.main.Builder.product.Product;

/**
 * 桥接模式（Bridge）
 * Created by hp on 2017-06-01.
 */
public class Bridge {
    public static void main(String[] args){
        AbstractRoad speedWay = new SpeedWay();
        speedWay.aCar = new Car();
        speedWay.run();

        AbstractRoad street = new Street();
        street.aCar = new Bus();
        street.run();

        People man = new Man();
        man.road = speedWay;
        man.run();

    }
}

abstract class AbstractCar{
    void run(){}
}
abstract class AbstractRoad{
    AbstractCar aCar;
    void run(){}
}

class Street extends AbstractRoad{

    @Override
    void run(){
        super.run();
        aCar.run();
        System.out.println("在市区街道行驶");
    }
}

class SpeedWay extends AbstractRoad{
    @Override
    void run() {
        super.run();
        aCar.run();
        System.out.println("在高速公路行驶");
    }
}

class Car extends AbstractCar{
    @Override
    void run() {
        super.run();
        System.out.println("小汽车");
    }
}

class Bus extends AbstractCar{
    @Override
    void run() {
        super.run();
        System.out.println("公交车");
    }
}


abstract class People{
    AbstractRoad road;
    void run(){}
}

class Man extends People{
    @Override
    void run() {
        super.run();
        System.out.println("男人开着");
        road.run();
    }
}

class Woman extends People{
    @Override
    void run() {
        super.run();
        System.out.println("女人开着");
        road.run();
    }
}