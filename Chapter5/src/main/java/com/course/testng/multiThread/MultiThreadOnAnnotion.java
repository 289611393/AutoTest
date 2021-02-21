package com.course.testng.multiThread;

import org.testng.annotations.Test;

public class MultiThreadOnAnnotion {
    @Test(invocationCount = 10,threadPoolSize = 3) //调用,启用的次数为10,threadPoolSize线程池数
    public void test() {
        System.out.println("1");
        System.out.println("Thread Id : "+Thread.currentThread().getId());
    }
}
