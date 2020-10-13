package com.practice.simplefactory.pizzas;

import lombok.Data;

/**
 * @version 1.0
 * @ClassName Pizza
 * @Description 抽象的pizza类
 * @Author wangyue
 * @Date 2020/10/12 20:29
 **/
@Data
public abstract class Pizza {
    protected String name;

    /**
     * 不同的披萨材料不同，做成抽象方法
     */
    public abstract void prepare();

    public void bake() {
        System.out.println(name + " baking ");
    }

    public void cut() {
        System.out.println(name + " cutting ");
    }

    public void box() {
        System.out.println(name + " boxing ");
    }
}
