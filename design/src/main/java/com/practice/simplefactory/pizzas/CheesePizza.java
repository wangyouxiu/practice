package com.practice.simplefactory.pizzas;

import javax.sound.midi.Soundbank;

/**
 * @version 1.0
 * @ClassName CheesePizza
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/12 20:33
 **/
public class CheesePizza extends Pizza {
    @Override
    public void prepare() {
        System.out.println("给制作奶酪披萨准备材料");
    }
}
