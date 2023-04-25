package org.example.homework4.task01;

import java.util.*;

/**
 * 1)Вывести список на экран в перевернутом виде (без массивов и ArrayList)
 * Пример:
 * 1 -> 2->3->4
 * Вывод:
 * 4->3->2->1
 */
public class Hw4Task01 {
    public static void main(String[] args) {
        List<Integer> list = new LinkedList<>(Arrays.asList(1, 2, 3, 4));
        System.out.println(list);
        Collections.reverse(list);
        System.out.println(list);
    }
}
