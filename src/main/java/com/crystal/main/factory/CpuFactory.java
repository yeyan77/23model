package com.crystal.main.factory;

/**
 * CPU与主板工厂类
 * Created by hp on 2017-05-31.
 */
public class CpuFactory {
    public static Cpu create(int type){
        Cpu cpu = null;
        if(type == 1){
            cpu = new IntelCpu(755);
        }else if(type == 2){
            cpu = new AmdCpu(938);
        }
        return cpu;
    }
}
