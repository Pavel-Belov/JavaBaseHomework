package org.example.homework3.task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 * 2. Сведения о товаре состоят из наименования,
 * страны-производителя, веса, цены, сорта.
 * Получить наименования товаров заданного сорта с наименьшей ценой.
 */
public class Hw3Task02 {
    public static void main(String[] args) {
        List<Hw3Tsk02Product> hw3Tsk02ProductList = getProducts();
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите сорт товара: ");
        String searchProduct = sc.nextLine();
        List<String> products = new ArrayList<>();
        double minPrise = hw3Tsk02ProductList.get(0).price;
        for (Hw3Tsk02Product hw3Tsk02Product : hw3Tsk02ProductList) {
            if (hw3Tsk02Product.sort.equals(searchProduct) && hw3Tsk02Product.price < minPrise) {
                minPrise = hw3Tsk02Product.price;
            }
        }
        for (Hw3Tsk02Product hw3Tsk02Product : hw3Tsk02ProductList) {
            if (hw3Tsk02Product.sort.equals(searchProduct) && hw3Tsk02Product.price == minPrise) {
                products.add(hw3Tsk02Product.name);
            }
        }
        if (products.size() > 0) System.out.println("Наименьшая цена у: " + products);
        else System.out.println("Такого сорта товара не найдено");
    }

    public static List<Hw3Tsk02Product> getProducts() {
        List<Hw3Tsk02Product> hw3Tsk02ProductList = new ArrayList<>();
        hw3Tsk02ProductList.add(new Hw3Tsk02Product("Мука1", "Россия", 2.25, 1000, "1"));
        hw3Tsk02ProductList.add(new Hw3Tsk02Product("Соль", "Беларусь", 1.55, 1000, "2"));
        hw3Tsk02ProductList.add(new Hw3Tsk02Product("Мука 2А", "Беларусь", 2.00, 500, "1"));
        hw3Tsk02ProductList.add(new Hw3Tsk02Product("Сахар Р", "Россия", 1.25, 1000, "2"));
        hw3Tsk02ProductList.add(new Hw3Tsk02Product("Сахар Б", "Беларусь", 1.25, 1000, "2"));
        hw3Tsk02ProductList.add(new Hw3Tsk02Product("Мука 2Б", "Беларусь", 2.00, 500, "1"));
        return hw3Tsk02ProductList;
    }
}