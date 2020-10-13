package com.practice.decorator;

import lombok.Data;

/**
 * @version 1.0
 * @ClassName ClothingSuper
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/13 17:34
 **/
@Data
public class ClothingSuper extends Super {

    protected Super aSuper;

    public void decorate(Super aSuper) {
        this.aSuper = aSuper;
    }

    @Override
    public void show() {
        if (aSuper != null) {
            aSuper.show();
        }
    }
}
