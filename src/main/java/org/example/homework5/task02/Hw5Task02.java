package org.example.homework5.task02;

import java.util.*;

/**
 * 2) Пусть дан список сотрудников:
 * Иван Иванов
 * Светлана Петрова
 * Кристина Белова
 * Анна Мусина
 * Анна Крутова
 * Иван Юрин
 * Петр Лыков
 * Павел Чернов
 * Петр Чернышов
 * Мария Федорова
 * Марина Светлова
 * Мария Савина
 * Мария Рыкова
 * Марина Лугова
 * Анна Владимирова
 * Иван Мечников
 * Петр Петин
 * Иван Ежов
 * Написать программу, которая найдёт и выведет повторяющиеся имена
 * с количеством повторений. Отсортировать по убыванию популярности.
 */
public class Hw5Task02 {
    public static void main(String[] args) {
        List<String> employees = listOfEmployees();
        Map<String, Integer> names = repeatingNames(employees);
        names.values().removeIf(value -> value == 1);
        names.entrySet().stream()
                .sorted((v1, v2) -> -v1.getValue().compareTo(v2.getValue()))
                .forEach(v -> System.out.println(v.getKey() + "=" + v.getValue()));
    }

    public static Map<String, Integer> repeatingNames(List<String> employees) {
        Map<String, Integer> names = new HashMap<>();
        for (String employee : employees) {
            String[] employeeName = employee.split(" ");
            names.putIfAbsent(employeeName[0], 0);
            names.put(employeeName[0], names.get(employeeName[0]) + 1);
        }
        return names;
    }

    public static List<String> listOfEmployees() {
        List<String> employees = new ArrayList<>();
        employees.add("Иван Иванов");
        employees.add("Светлана Петрова");
        employees.add("Кристина Белова");
        employees.add("Анна Мусина");
        employees.add("Анна Крутова");
        employees.add("Иван Юрин");
        employees.add("Петр Лыков");
        employees.add("Павел Чернов");
        employees.add("Петр Чернышов");
        employees.add("Мария Федорова");
        employees.add("Марина Светлова");
        employees.add("Мария Савина");
        employees.add("Мария Рыкова");
        employees.add("Марина Лугова");
        employees.add("Анна Владимирова");
        employees.add("Иван Мечников");
        employees.add("Петр Петин");
        employees.add("Иван Ежов");
        return employees;
    }
}
