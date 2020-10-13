package com.practice.decorator;

/**
 * @version 1.0
 * @ClassName TShirts
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/13 17:32
 **/
public class TShirts extends ClothingSuper {

    @Override
    public void show() {
        System.out.print(" T恤");
        super.show();
    }
}
