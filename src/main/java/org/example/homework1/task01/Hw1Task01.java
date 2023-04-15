package org.example.homework1.task01;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Hw1Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Input: ");
        String s = scanner.nextLine();
        String[] str = s.trim().split("\\s+");
        Collections.reverse(Arrays.asList(str));
        s = String.join(" ", str);
        System.out.printf("Output: %s", s);
    }
}
