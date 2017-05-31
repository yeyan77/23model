package com.crystal.main.factory;

/**
 * Created by hp on 2017-05-31.
 */
public interface AbstractFactory {
    /**
     * 创建CPU对象
     * @return
     */
    public Cpu createCpu();

    /**
     * 创建主板对象
     * @return
     */
    public Mainboard createMainboard();
}
