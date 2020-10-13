package com.practice.strategy;

/**
 * @version 1.0
 * @ClassName CashReturn
 * @Description 满多少返多少的促销活动
 * @Author wangyue
 * @Date 2020/10/13 13:41
 **/
public class CashReturn extends CashSuper {

    private Double moneyCondition;
    private Double moneyReturn;

    @Override
    public double getResult(Double price) {
        if (price >= moneyCondition) {
            return price - moneyReturn;
        }
        return price;
    }

    public CashReturn(Double moneyCondition, Double moneyReturn) {
        this.moneyCondition = moneyCondition;
        this.moneyReturn = moneyReturn;
    }
}
