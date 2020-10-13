package com.practice.decorator;

/**
 * @version 1.0
 * @ClassName BigTrouser
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/13 17:35
 **/
public class BigTrouser extends ClothingSuper {

    @Override
    public void show() {
        System.out.print(" 短裤");
        super.show();
    }
}
