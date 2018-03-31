package com.example.demo.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @Author zhouguanya
 * @Date 2018/3/31
 * @Description 默认的顺序执行 执行顺序同NotSettingOrderTest
 */
@FixMethodOrder(MethodSorters.DEFAULT)
public class DefaultOrderTest {
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
     * 每次执行结果都是：
     1
     2
     4
     3
     */
}
