package com.crystal.main.Builder.message;

/**
 * 具体建造者
 * Created by hp on 2017-06-01.
 */
public class WelcomBuilder extends Builder{

    public WelcomBuilder(){
        msg = new WelcomMessage();
    }

    public void buildSubject() {
        msg.setSubject("欢迎标题");
    }

    public void buildBody() {
        msg.setBody("欢迎内容");
    }
}
