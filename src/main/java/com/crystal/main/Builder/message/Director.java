package com.crystal.main.Builder.message;

/**
 * 导演者Director，这个类提供一个construct()方法，此方法调用建造者的建造方法，
 * 包括buildTo()、buildFrom()、buildSubject()、buildBody()、buildSendDate()等，
 * 从而一部分一部分地建造出产品对象，既AutoMessage对象。
 * Created by hp on 2017-06-01.
 */
public class Director {
    Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    public  void construct(String toAddress,String fromAddress){
        this.builder.buildTo(toAddress);
        this.builder.buildFrom(fromAddress);
        this.builder.buildBody();
        this.builder.buildSubject();
        this.builder.buildSendDate();
        this.builder.sendMessage();
    }
}
