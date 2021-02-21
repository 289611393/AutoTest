package com.course.testng;

import org.testng.annotations.*;

public class BasicAnnotaation {
//    表示测试方法
    @Test
    public void testCase1(){
        System.out.println("这是测试用例1");
    }
    @Test
    public void testCase2(){
        System.out.println("Thread Id : "+Thread.currentThread().getId());
        System.out.println("这是测试用例2");
    }
    @BeforeMethod
    public void beforeMethod(){
        System.out.println("beforeMethod这是测试方法之前执行");
    }
    @AfterMethod
    public void afterMethod(){
        System.out.println("afterMethod这是测试方法之后执行");
    }
    @BeforeClass
    public void beforeClass(){
        System.out.println("beforeClass类之前运行");
    }
    @AfterClass
    public void afterClass(){
        System.out.println("afterClass类之后运行");
    }
    @BeforeSuite
    public void beforeSuite(){
        System.out.println("befreSuite套件");
    }
    @AfterSuite
    public void afterSuite(){
        System.out.println("afterSuite套件");
    }
}
