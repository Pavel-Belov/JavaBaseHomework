package org.example.homework3.task03;

import java.util.ArrayList;
import java.util.List;

/**
 * 3. Сведения о книге состоят из названия, фамилии автора,
 * цены, года издания и количества страниц.
 * Найти названия книг, в которых простое количество страниц,
 * фамилия автора содержит «А» и год издания после 2010 г, включительно.
 */
public class Hw3Task03 {
    public static void main(String[] args) {
        List<Hw3Book> booksList = getBooks();
        for (int i = 0; i < booksList.size(); i++) {
            if (getSimpleNumber(booksList, i)) {
               if (booksList.get(i).author.startsWith("А") && booksList.get(i).year >= 2010) {
                   System.out.println(booksList.get(i).title);
               }
            }
        }
    }

    public static List<Hw3Book> getBooks() {
        List<Hw3Book> booksList = new ArrayList<>();
        booksList.add(new Hw3Book("Аврора", "Попов", 1000, 2001, 213));
        booksList.add(new Hw3Book("В поход", "Аристов", 520, 2010, 98));
        booksList.add(new Hw3Book("Валькирия", "Афонов", 2000, 2015, 599));
        booksList.add(new Hw3Book("Смирение", "Артуров", 1500, 2011, 199));
        return booksList;
    }

    public static boolean getSimpleNumber(List<Hw3Book> booksList, int bookIndex) {
        int n = booksList.get(bookIndex).pages;
        if (n == 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
}
