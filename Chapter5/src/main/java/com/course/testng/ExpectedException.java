package com.course.testng;

import org.testng.annotations.Test;

public class ExpectedException {
    /**
     * 比如我们传入一个异常参数，程序抛出了异常
     *
     */
    //这是一个测试结果失败的异常测试
    @Test(expectedExceptions = RuntimeException.class)
    public void runTimeExceptionFailed(){
        System.out.println("这是一个失败的异常测试");
        throw new RuntimeException();
    }
    //这是一个成功的异常测试
    @Test(expectedExceptions = RuntimeException.class )
    public void runTimeExceptionSuccess(){
        System.out.println("这是一个成功的异常测试");
        throw new RuntimeException();
    }
}
