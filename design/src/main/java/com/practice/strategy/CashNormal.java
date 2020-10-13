package com.practice.strategy;

/**
 * @version 1.0
 * @ClassName CashNormal
 * @Description 正常的销售活动，原价卖出
 * @Author wangyue
 * @Date 2020/10/13 13:40
 **/
public class CashNormal extends CashSuper {

    @Override
    public double getResult(Double price) {
        return price;
    }
}
