package com.practice.simplefactory.operation;

import lombok.Data;

/**
 * @version 1.0
 * @ClassName Operation
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/12 16:27
 **/
@Data
public abstract class Operation {
    private Double numA;
    private Double numB;

    /**
     * 获取计算结果
     * @param numA
     * @param numB
     * @return
     */
    public abstract Double getResult(Double numA,Double numB);

}
