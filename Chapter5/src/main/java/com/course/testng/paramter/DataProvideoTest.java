package com.course.testng.paramter;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import java.lang.reflect.Method;

public class DataProvideoTest {

    @Test(dataProvider = "name")
    public void dataProvideoTest(String name, int age) {
        System.out.println("name=" + name + " ;age=" + age);
    }

    @DataProvider(name = "name") //DataProvider 数据供应者
    public Object[][] provideoTest() {
        Object[][] object = new Object[][]{
                {"zhangsan", 30},
                {"lisi", 20},
                {"wangwu", 10}
        };
        return object;
    }

    @Test(dataProvider = "methodData")
    private void test1(String name, int age) {
        System.out.println("name=" + name + " ;age=" + age);
    }

    @Test(dataProvider = "methodData")
    private void test2(String name, int age) {
        System.out.println("name=" + name + " ;age=" + age);
    }

    @DataProvider(name = "methodData") //DataProvider 数据供应者
    public Object[][] provideoTest2(Method method) {
        Object[][] result = null;
        if (method.getName().equals("test1")) {
            result = new Object[][]{
                    {"张三",30},
                    {"张三",20}
            };
        } else if (method.getName().equals("test2")) {
            result = new Object[][]{
                    {"lisi",2},
                    {"lisi",5}
            };
        }
        return result;
    }

}
