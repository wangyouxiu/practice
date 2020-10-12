package com.practice.simplefactory.operation;

/**
 * @version 1.0
 * @ClassName OperationMul
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/12 16:49
 **/
public class OperationMul extends Operation {

    @Override
    public Double getResult(Double numA, Double numB) {
        return numA * numB;
    }
}
