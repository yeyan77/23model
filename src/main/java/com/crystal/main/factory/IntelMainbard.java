package com.crystal.main.factory;

/**
 * Created by hp on 2017-05-31.
 */
public class IntelMainbard implements Mainboard{


    private int cpuHoles = 0;

    public IntelMainbard(int cpuHoles){

         this.cpuHoles = cpuHoles;
    }
    public void installCPU() {
        System.out.println("Intel 主板的CPU插槽孔数："+cpuHoles);
    }
}
