package com.askar.gc;

public class StackTest {

    static int count1 = 0;
    static int count2 = 0;


    public static void main(String[] args) {
        try {
            test1();
        } catch (StackOverflowError ignore){
            System.out.println(count1);
        }
        try {
            test2();
        } catch (StackOverflowError ignore){
            System.out.println(count2);
        }
    }


    private static void test1(){
        count1++;
        test1();
    }

    private static void test2(){
        long l1 = 0;long l2 = 0;long l3 = 0;
        long l4 = 0;long l5 = 0;long l6 = 0;
        long l7 = 0;long l8 = 0;long l9 = 0;
        count2++;
        test2();
    }

}
