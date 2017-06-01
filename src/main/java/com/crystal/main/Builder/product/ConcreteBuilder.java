package com.crystal.main.Builder.product;

/**
 * Created by hp on 2017-06-01.
 */
public class ConcreteBuilder implements  Builder {

    private Product product = new Product();

    /**
     * 产品零件建造方法1
     */
    public void buildPart1() {
        product.setPart1("编号：9888");

    }
    /**
     * 产品零件建造方法2
     */
    public void buildPart2() {
        product.setPart2("名称：XXX");
    }

    /**
     * 产品返还方法
     */
    public Product retrieveResult() {
        return product;
    }
}
