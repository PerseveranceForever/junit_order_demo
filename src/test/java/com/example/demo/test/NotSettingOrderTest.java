package com.example.demo.test;

import org.junit.Test;

/**
 * @Author zhouguanya
 * @Date 2018/3/31
 * @Description 从4.11版本开始,JUnit将默认使用一个确定的,但不可预测的顺序。执行顺序同DefaultOrderTest
 */
public class NotSettingOrderTest {

    @Test
    public void one() {
        System.out.println("1");
    }
    @Test
    public void two() {
        System.out.println("2");
    }
    @Test
    public void three() {
        System.out.println("3");
    }
    @Test
    public void four() {
        System.out.println("4");
    }

    /**
     * 无论执行多少次，结果始终为：
     1
     2
     4
     3
     */
}
