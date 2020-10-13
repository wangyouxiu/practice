package com.practice.decorator;

/**
 * @version 1.0
 * @ClassName Test
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/13 17:36
 **/
public class Test {
    public static void main(String[] args) {
        Person person = new Person("mayue");
        TShirts tShirts = new TShirts();
        BigTrouser bigTrouser = new BigTrouser();

        bigTrouser.decorate(person);
        tShirts.decorate(bigTrouser);

        tShirts.show();

    }
}
