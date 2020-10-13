package com.practice.simplefactory.pizzas;

/**
 * @version 1.0
 * @ClassName GreekPizza
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/12 20:34
 **/
public class GreekPizza extends Pizza {

    @Override
    public void prepare() {
        System.out.println("给制作希腊披萨准备材料");
    }
}
