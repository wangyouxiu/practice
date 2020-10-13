package com.practice.simplefactory.pizzas;

/**
 * @version 1.0
 * @ClassName Test
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/12 20:38
 **/
public class Test {
    public static void main(String[] args) {
        String name = "Greek";
        Pizza greek = PizzaFactory.createPizza(name);
        greek.setName(name);
        greek.prepare();
        greek.bake();
        greek.cut();
        greek.box();

        name = "Cheese";
        Pizza greek1 = PizzaFactory.createPizza(name);
        greek1.setName(name);
        greek1.prepare();
        greek1.bake();
        greek1.cut();
        greek1.box();
    }
}
