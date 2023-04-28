package org.example.homework5.task01;

import java.util.Scanner;
import java.util.Map;
import java.util.HashMap;

/**
 * 1) Подсчитать количество искомого слова, через map
 * (наполнением значение, где искомое слово будет являться ключом),
 * вносить все слова не нужно
 * Пример:
 * Россия идет вперед всей планеты. Планета — это не Россия.
 * Запрос: Россия
 * Ответ: Россия - 2
 * toLoverCase().
 * (Усложнение - игнорировать пунктуацию)*
 */
public class Hw5Task01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите искомое слово");
        String word = scanner.nextLine().toLowerCase();
        String[] strArr = stringToArray("Россия идет вперед всей планеты. Планета — это не Россия.");
        Integer matches = searchMatches(strArr, word);
        if (matches != null) {
            System.out.printf("Искомое слово встречается %d раз(а)", matches);
        } else {
            System.out.println("Искомое слово не найдено");
        }
    }

    public static Integer searchMatches(String[] strArr, String word) {
        Map<String, Integer> map = new HashMap<>();
        for (String item : strArr) {
            item = item.toLowerCase();
            if (item.equals(word)) {
                map.putIfAbsent(item, 0);
                map.put(item, map.get(item) + 1);
            }
        }
        return map.get(word);
    }

    public static String[] stringToArray(String str) {
        str = str.replaceAll("\\p{Punct}", "");
        String[] strArr = str.split(" ");
        return strArr;
    }
}
