package com.askar.gc;

public class ReturnValue {

    public static void main(String[] args) {

        int x = 0;
        int []arr = {20};

        x = f(x,g(x,arr));
        System.out.println(x + " arr[0] :" + arr[0]);

        arr = arrF(x,g(x,arr));
        System.out.println(x + " arr[0] :" + arr[0]);
    }

    private static int f(int x,int[] arr) {
        x += 30;
        arr[0] = x;
        return 42;
    }

    private static int[] g(int x, int[] arr) {
        arr = new int[]{50};
        return arr;
    }

    private static int[] arrF(int x,int[] arr) {
        x += 30;
        arr[0] = x;
        return arr;
    }


}
