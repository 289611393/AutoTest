package com.course.testng.groups;

import org.testng.annotations.AfterGroups;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.Test;

public class GroupsOnMethod {


    @Test(groups = "server")
    public void test1() {
        System.out.println("这是服务端测试方法1111");
    }


    @Test(groups = "server")
    public void test2() {
        System.out.println("这是服务端测试方法22222");
    }


    @Test(groups = "client") //方法标记,分类要执行的方法组
    public void test3() {
        System.out.println("这是客户端测试方法3333");
    }

    @Test(groups = "client")
    public void test4() {
        System.out.println("这是客户端测试方法4444");
    }


    @BeforeGroups("client")
    public void beforeGroupsOnClient() {
        System.out.println("beforeGroups这是客户端组运行之前运行的");
    }

    @AfterGroups("client")
    public void afterGroupsOnClient() {
        System.out.println("afterGroups这是客户端组运行之前运行的");
    }

    @BeforeGroups("server")
    public void beforeGroupsOnServer() {
        System.out.println("beforeGroups这是服务端组运行之前运行的");
    }

    @AfterGroups("server")
    public void afterGroupsOnServer() {
        System.out.println("afterGroups这是服务端组运行之后运行的");
    }
}
