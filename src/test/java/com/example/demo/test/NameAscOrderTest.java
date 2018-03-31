package com.example.demo.test;

import org.junit.FixMethodOrder;
import org.junit.Test;
import org.junit.runners.MethodSorters;

/**
 * @Author zhouguanya
 * @Date 2018/3/31
 * @Description
 */
@FixMethodOrder(MethodSorters.NAME_ASCENDING)
public class NameAscOrderTest {
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
     * 无论执行多少次，都是按照方法名字的字典序执行：
     4
     1
     3
     2
     */
}
