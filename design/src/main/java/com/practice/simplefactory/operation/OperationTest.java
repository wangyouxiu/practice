package com.practice.simplefactory.operation;

/**
 * @version 1.0
 * @ClassName OperationTest
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/12 16:47
 **/
public class OperationTest {
    public static void main(String[] args) {
        Operation operation1 = OperationFactory.createOperation("+");
        Double result1 = operation1.getResult(1D, 2D);
        System.out.println(result1);

        Operation operation2 = OperationFactory.createOperation("-");
        Double result2 = operation2.getResult(2D, 2D);
        System.out.println(result2);

        Operation operation3 = OperationFactory.createOperation("*");
        Double result3 = operation3.getResult(2D, 2D);
        System.out.println(result3);
    }
}
