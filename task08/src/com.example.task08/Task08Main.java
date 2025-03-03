package com.example.task08;

import javax.lang.model.type.NullType;

public class Task08Main {
    public static void main(String[] args) {
        //здесь вы можете вручную протестировать ваше решение, вызывая реализуемый метод и смотря результат
        // например вот так:
        /*
        int[] arr = new int[2];
        arr[0] = 2;
        arr[1] = 3;
        System.out.println(mult(arr));
         */
    }

    static long mult(int[] arr) {
        long mul = 1;
        if (arr.length == 0) return 0;

        for (int i : arr) {
            mul *= i;
        }
        return mul;
    }

}