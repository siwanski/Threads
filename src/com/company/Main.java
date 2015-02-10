package com.company;

public class Main {

    public static void main(String[] args) {
        TestThread T1 = new TestThread("1");
        T1.start();

        TestThread T2 = new TestThread("2");
        T2.start();

        TestThread T3 = new TestThread("3");
        T3.start();
    }
}
