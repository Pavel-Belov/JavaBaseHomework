package org.example.homework2.task01;

import java.util.Scanner;

public class Hw2Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean inputFlag = false;
        int n = 0;
        while (!inputFlag) {
            System.out.print("Введите длину последователььности N: ");
            n = scanner.nextInt();
            if (n <= 1) {
                System.out.println("Неверный ввод, такое количество чисел не является последовательностью");
            } else inputFlag = true;
        }

        System.out.println("Введите последовательность чисел:");
        int sum = 0;
        while (n > 0) {
            int num = scanner.nextInt();
            if (simpleNum(num)) {
                sum += num;
            }
            n--;
        }
        System.out.printf("Сумма простых чисел в последовательности: %d", sum);
    }

    /**
     *
     * @param num число в последовательности
     * @return возвращает true, если число простое, иначе false
     */
    public static boolean simpleNum(int num) {
        if (num < 2 || (num % 2 == 0 && num != 2)) return false;
        if (num == 2) return true;
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                return false;
            }
        }
        return true;
    }
}