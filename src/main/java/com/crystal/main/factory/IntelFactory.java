package com.crystal.main.factory;

/**
 * Created by hp on 2017-05-31.
 */
public class IntelFactory implements  AbstractFactory{

    public Cpu createCpu() {
        return new IntelCpu(755);
    }

    public Mainboard createMainboard() {
        return new IntelMainbard(755);
    }
}
