package com.crystal.main;

import com.crystal.main.factory.AbstractFactory;
import com.crystal.main.factory.AmdFactory;
import com.crystal.main.factory.ComputerEngineer;

/**
 * Created by hp on 2017-05-31.
 */
public class main {
    public static void main(String[] args){
        ComputerEngineer cf = new ComputerEngineer();
       // cf.makeComputer(1,1);

        //客户选择并创建需要使用的产品对象
        AbstractFactory af = new AmdFactory();
        //告诉装机工程师自己选择的产品，让装机工程师组装电脑
        cf.makeComputer(af);

    }
}
