package com.practice.strategy;

import lombok.Data;

/**
 * @version 1.0
 * @ClassName CashSuper
 * @Description 支付的抽象父类
 * @Author wangyue
 * @Date 2020/10/13 13:36
 **/
@Data
public abstract class CashSuper {

    /**
     * 根据原价获取最终需要支付的价格
     * @param price
     * @return
     */
    public abstract double getResult(Double price);
}
