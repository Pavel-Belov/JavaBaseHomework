package org.example.homework3.task04;

import java.util.ArrayList;
import java.util.Collections;

/**
 * 4. Задан целочисленный список ArrayList.
 * Найти минимальное, максимальное и среднее из этого списка.
 */
public class Hw3Task04 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(5);
        list.add(3);
        list.add(17);
        list.add(1);

        System.out.println("Минимальное: " + getMin(list));
        System.out.println("Максимальное: " + getMax(list));
        System.out.println("Среднее: " + getAverage(list));
    }

    private static int getMin(ArrayList<Integer> list) {
        int minIndex = list.indexOf(Collections.min(list));
        return list.get(minIndex);
    }

    private static int getMax(ArrayList<Integer> list) {
        int maxIndex = list.indexOf(Collections.max(list));
        return list.get(maxIndex);
    }

    private static double getAverage(ArrayList<Integer> list) {
        double sum = 0;
        for (Integer integer : list) {
            sum += integer;
        }
        return sum / list.size();
    }
}