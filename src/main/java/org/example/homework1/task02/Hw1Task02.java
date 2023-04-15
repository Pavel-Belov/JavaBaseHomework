package org.example.homework1.task02;

import java.util.Scanner;

public class Hw1Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите последовательность целых чисел:");
        int num = scanner.nextInt();
        int sum = 0;
        int prevNum = 0;
        while (num != 0) {
            prevNum = num;
            num = scanner.nextInt();
            if (num < 0) sum += prevNum;
        }
        System.out.println("Сумма положительных чисел, после которых следует отрицательное число:");
        System.out.println(sum);
    }
}