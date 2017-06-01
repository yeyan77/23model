package com.crystal.main.Builder.product;

/**
 *
 * 　客户端类
 * Created by hp on 2017-06-01.
 */
public class Client {

    public static void main(String[] args){
        Builder builder = new ConcreteBuilder();
        Director director = new Director(builder);
        director.construct();

        Product product = builder.retrieveResult();
        System.out.println(product.getPart1());
        System.out.println(product.getPart2());
    }
}
