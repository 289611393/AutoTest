package com.course.testng.groups;

import org.testng.annotations.Test;

@Test(groups = "stu")
public class GroupsOnClass2 {

    public void teacher1() {
        System.out.println("GroupsOnClass2中的teacher1");
    }

    public void teacher2() {
        System.out.println("GroupsOnClass2中的teacher2");
    }
}
