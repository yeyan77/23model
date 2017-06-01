package com.crystal.main.Builder.message;

/**
 * 具体建造者
 * Created by hp on 2017-06-01.
 */
public class GoodbyeBuilder extends Builder{

    public GoodbyeBuilder(){
        msg = new GoodbyeMessage();
    }

    public void buildSubject() {
        msg.setSubject("欢送标题");

    }

    public void buildBody() {
        msg.setBody("欢送内容");
    }
}
