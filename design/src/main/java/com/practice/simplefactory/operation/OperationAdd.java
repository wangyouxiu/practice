package com.practice.simplefactory.operation;

/**
 * @version 1.0
 * @ClassName OperationAdd
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/12 16:36
 **/
public class OperationAdd extends Operation {

    @Override
    public Double getResult(Double numA, Double numB) {
        return numA + numB;
    }
}
