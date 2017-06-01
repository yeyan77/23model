package com.crystal.main.Builder.product;

/**
 * 抽象建造者类
 * Created by hp on 2017-06-01.
 */
public interface Builder {
    void buildPart1();

    void buildPart2();

    Product retrieveResult();
}
