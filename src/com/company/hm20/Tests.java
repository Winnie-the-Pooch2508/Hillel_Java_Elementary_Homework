package com.company.hm20;
public class Tests {

    @BeforeSuite
    public void methodBefore() {
        System.out.println("Method Before!");
    }
    @AfterSuite
    public void methodAfter() {
        System.out.println("Method After");
    }
    @Test(value = 1)
    public void methodTest1() {
        System.out.println("Method priority 1!");
    }
    @Test(value = 5)
    public void methodTest2() {
        System.out.println("Method priority 5!");
    }
    @Test(value = 2)
    public void methodTest3() {
        System.out.println("Method priority 2!");
    }
}
