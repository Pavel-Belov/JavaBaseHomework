package org.example.homework3.task01;

import java.util.ArrayList;
import java.util.List;

/**
 * 1. Дан массив записей: наименование товара, цена, сорт.
 * Найти наибольшую цену товаров 1го или 2го сорта среди товаров,
 * название которых содержит «высший».
 */
public class Hw3Task01 {
    public static void main(String[] args) {
        List<Hw3Tsk01Product> hw3Tsk01ProductList = getProducts();
        double maxPrice = 0;
        for (Hw3Tsk01Product hw3Tsk01ProductItem : hw3Tsk01ProductList) {
            if (hw3Tsk01ProductItem.name.contains("высший")) {
                if (hw3Tsk01ProductItem.sort.contains("1") || hw3Tsk01ProductItem.sort.contains("2")) {
                    if (hw3Tsk01ProductItem.price > maxPrice) maxPrice = hw3Tsk01ProductItem.price;
                }
            }
        }
        System.out.println(maxPrice);
    }

    public static List<Hw3Tsk01Product> getProducts() {
        List<Hw3Tsk01Product> hw3Tsk01ProductList = new ArrayList<>();
        hw3Tsk01ProductList.add(new Hw3Tsk01Product("Мука высший сорт", 199.95, "1"));
        hw3Tsk01ProductList.add(new Hw3Tsk01Product("Мука пшеничная", 222, "1"));
        hw3Tsk01ProductList.add(new Hw3Tsk01Product("Мука для блинов", 100, "2"));
        hw3Tsk01ProductList.add(new Hw3Tsk01Product("Мука отборная, высший сорт", 120.95, "2"));
        hw3Tsk01ProductList.add(new Hw3Tsk01Product("высший", 110, "2"));
        return hw3Tsk01ProductList;
    }
}
