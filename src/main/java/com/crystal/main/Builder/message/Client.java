package com.crystal.main.Builder.message;

/**
 * Created by hp on 2017-06-01.
 */
public class Client {
    public static void main(String[] args){
        Builder builder = new GoodbyeBuilder();
        Director director = new Director(builder);
        director.construct("to@123","from@123");
    }
}
