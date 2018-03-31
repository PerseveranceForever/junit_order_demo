package com.example.demo.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @Author zhouguanya
 * @Date 2018/3/31
 * @Description 保留测试方法的执行顺序为JVM返回的顺序。每次测试的执行顺序有可能会所不同。
 */
@FixMethodOrder(MethodSorters.JVM)
public class JVMOrderTest {
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
     * 每次执行结果都有可能不一样
     */
}
