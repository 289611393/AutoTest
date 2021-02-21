package com.course.testng;

import org.testng.annotations.Test;

public class IngnoreTest {
    @Test
    public void ingnore1(){
        System.out.println("ingnore1执行");
    }
    @Test(enabled = false) //enabled 忽略执行
    public void ingnore2(){
        System.out.println("ingnore2执行");
    }
    @Test(enabled = true)
    public void ingnore3(){
        System.out.println("ingnore3执行");
    }
}
