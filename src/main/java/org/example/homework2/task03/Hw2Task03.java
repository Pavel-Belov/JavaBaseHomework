package org.example.homework2.task03;

import java.util.Arrays;

public class Hw2Task03 {
    public static void main(String[] args) {
        int[] arr = new int[]{1, 12, -2, 15, -5, 2, 105, -10};
        System.out.println("Дан массив целых чисел: " + Arrays.toString(arr));

        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            if (Math.abs(arr[i]) >= 10 && Math.abs(arr[i]) < 100) sum += i;
        }
        System.out.println("Сумма элементов двухначных чисел: " + sum);

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 0) arr[i] = sum;
        }
        System.out.println("После замены отрицательных элементов на эту сумму послучаем массив:");
        System.out.println(Arrays.toString(arr));
    }
}