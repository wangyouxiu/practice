package com.practice.strategy;

/**
 * @version 1.0
 * @ClassName content
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/13 14:08
 **/
public class Content {
    private CashSuper cashSuper;

    public Content(String type) {
        switch (type) {
            case "rebate":
                this.cashSuper = new CashRebate(0.7);
                break;
            case "return":
                this.cashSuper = new CashReturn(300D, 10D);
                break;
            default:
                this.cashSuper = new CashNormal();
        }
    }

    public Double getResult(Double price) {
        return cashSuper.getResult(price);
    }
}

