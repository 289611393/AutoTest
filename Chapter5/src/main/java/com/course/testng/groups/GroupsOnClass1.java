package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")//在xml中通过group组来删选要执行的类 // 类标记
public class GroupsOnClass1 {

    public void teacher1(){
        System.out.println("GroupsOnClass1中的teacher1");
    }

    public void teacher2(){
        System.out.println("GroupsOnClass1中的teacher2");
    }
}
