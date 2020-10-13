package com.practice.strategy;

/**
 * @version 1.0
 * @ClassName Test
 * @Description TODO描述
 * @Author wangyue
 * @Date 2020/10/13 14:14
 **/
public class Test {
    public static void main(String[] args) {
        //7折销售
        Content content = new Content("rebate");
        Double result = content.getResult(100D);
        System.out.println(result);

        //满300返10
        Content content1 = new Content("return");
        Double result1 = content1.getResult(300D);
        System.out.println(result1);

        //原件
        Content content2 = new Content("");
        Double result2 = content2.getResult(100D);
        System.out.println(result2);
    }
}
