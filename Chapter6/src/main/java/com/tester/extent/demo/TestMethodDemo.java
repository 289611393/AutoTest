package com.tester.extent.demo;

import org.testng.Assert;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class TestMethodDemo {
    @Test
    public void test1() {
        Assert.assertEquals(1, 2);
    }

    @Test
    public void test2() {
        Assert.assertEquals("aaaa", "aaaa");

    }
    @Test
    public void test3() {
        Assert.assertEquals("aaaa", "aaaa");

    }

    @Test
    public void logDemo() {
        Reporter.log("日志日志日志日志日志");
        throw new RuntimeException("自己抛的异常");

    }
}