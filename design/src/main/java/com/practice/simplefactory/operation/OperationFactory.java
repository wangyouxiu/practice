package com.practice.simplefactory.operation;

/**
 * @version 1.0
 * @ClassName OperationFactory
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/12 16:42
 **/
public abstract class OperationFactory{

    /**
     * 简单的创建工厂
     * @param operate
     * @return
     */
    public static Operation createOperation(String operate) {
        Operation operation = null;
        switch (operate) {
            case "+":
                operation = new OperationAdd();
                break;
            case "-":
                operation = new OperationSub();
                break;
            case "*":
                operation = new OperationMul();
                break;
        }
        return operation;
    }
}
