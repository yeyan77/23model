package com.crystal.main.Builder.contract;

/**
 * ●　　由于是用Builder模式来创建某个对象，因此就没有必要再定义一个Builder接口，直接提供一个具体的建造者类就可以了。

 　●　　对于创建一个复杂的对象，可能会有很多种不同的选择和步骤，干脆去掉“导演者”，把导演者的功能和Client的功能合并起来，
        也就是说,Client这个时候就相当于导演者，它来指导构建器类去构建需要的复杂对象。


 * Created by hp on 2017-06-01.
 */
public class Client {
    public static void main(String[] args){
        InsuranceContract.ConcreateBuilder builder = new InsuranceContract.ConcreateBuilder("9656",123L,456L);

        InsuranceContract contract =
                builder.setPersonName("小米").setOtherData("test").build();

        contract.someOperation();
    }
}
