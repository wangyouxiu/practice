package com.practice.simplefactory.pizzas;

/**
 * @version 1.0
 * @ClassName PizzaFactory
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/12 20:35
 **/
public abstract class PizzaFactory {

    public static Pizza createPizza(String pizzaName) {
        Pizza pizza = null;
        switch (pizzaName) {
            case "Greek":
                pizza = new GreekPizza();
                break;
            case "Cheese":
                pizza = new CheesePizza();
                break;
        }

        return pizza;
    }
}
