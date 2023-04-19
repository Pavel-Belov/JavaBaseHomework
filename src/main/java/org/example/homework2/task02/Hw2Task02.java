package org.example.homework2.task02;

import java.util.Scanner;

public class Hw2Task02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean input = true;
        int n = 0;
        while (input) {
            System.out.print("Введите длину последователььности N: ");
            n = scanner.nextInt();
            if (n <= 1) {
                System.out.println("Неверный ввод, такое количество чисел не является последовательностью");
            } else input = false;
        }

        int prevNum = 0;
        boolean flag = true;
        System.out.println("Введите последовательность чисел:");
        while (n > 0) {
            int num = scanner.nextInt();
            if (prevNum >= num) {
                flag = false;
                n = 0;
            }
            prevNum = num;
            n--;
        }

        if (flag) System.out.println("Последовательность является возрастающей");
        else System.out.println("Последовательность не является возрастающей");
    }
}
