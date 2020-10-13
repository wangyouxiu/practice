package com.practice.decorator;

/**
 * @version 1.0
 * @ClassName Person
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/13 17:26
 **/
public class Person extends Super {

    private String name;

    public Person(String name) {
        this.name = name;
    }

    @Override
    public void show() {
        System.out.println(" 装扮的 " + name);
    }
}
