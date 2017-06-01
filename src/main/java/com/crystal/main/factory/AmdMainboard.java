package com.crystal.main.factory;

/**
 * Created by hp on 2017-05-31.
 */
public class AmdMainboard implements Mainboard {

    private int cpuholes = 0;

    public AmdMainboard(int cpuholes){
        this.cpuholes = cpuholes;
    }
    public void installCPU() {
        System.out.println("AMD主板的CPU插槽孔数是："+cpuholes);
    }
}
