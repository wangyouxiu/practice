package com.practice.strategy;

/**
 * @version 1.0
 * @ClassName CashRebate
 * @Description 打折销售
 * @Author wangyue
 * @Date 2020/10/13 13:51
 **/
public class CashRebate extends CashSuper {

    private double moneyRebate;

    @Override
    public double getResult(Double price) {
        return price * moneyRebate;
    }

    public CashRebate(double moneyRebate) {
        this.moneyRebate = moneyRebate;
    }
}
