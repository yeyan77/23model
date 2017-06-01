package com.crystal.main.factory;

/**
 * Created by hp on 2017-05-31.
 */
public class IntelCpu implements Cpu {

    private int pins = 0;

    public IntelCpu(int pins){
        this.pins = pins;
    }

    public void calculate() {
        System.out.println("IntelCpu pins:"+pins);
    }
}
