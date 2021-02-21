package com.course.testng;

import org.testng.annotations.Test;

public class TimeOutTest {

    @Test(timeOut = 3000)//单位是毫秒 3秒=3000毫秒
    public void testFailed() throws InterruptedException {
        Thread.sleep(4000);
    }

    @Test(timeOut = 2000)//单位是毫秒 3秒=3000毫秒
    public void testSuccess() throws InterruptedException {
        Thread.sleep(1000);
    }
}
