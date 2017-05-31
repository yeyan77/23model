package com.crystal.main.factory;

/**
 * Created by hp on 2017-05-31.
 */
public class AmdFactory implements AbstractFactory {
    public Cpu createCpu() {
        return new AmdCpu(938);
    }

    public Mainboard createMainboard() {
        return new AmdMainboard(938);
    }
}
