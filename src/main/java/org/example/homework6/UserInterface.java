package org.example.homework6;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class UserInterface extends Filter {
    public ArrayList<Laptop> laptops = super.getListOfLaptop();
    public Map<Integer, Object> filterMap = new HashMap<>();

    public UserInterface() {

    }

    public String getStringRequest(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(message);
        return scanner.nextLine();
    }

    public Double getDoubleRequest(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(message);
        return scanner.nextDouble();
    }

    public Integer getIntegerRequest(String message) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf(message);
        return scanner.nextInt();
    }

    public String[] getResponse(String request) {
        return request.split(" ");
    }

    public void mainMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("--------------------------------");
            System.out.println("Главное меню магазина техники");
            System.out.println("1 - Показать все товары");
            System.out.println("2 - Отфильтровать товары по параметрам");
            System.out.println("3 - Выход");
            System.out.println("--------------------------------");
            Integer request = this.getIntegerRequest("Выберите пункт меню: ");
            switch (request) {
                case 1 -> this.showAll(laptops);
                case 2 -> {
                    exit = true;
                    this.filterMenu();
                }
                case 3 -> exit = true;
                default -> System.out.println("Вы ввели некорректную команду. Повторите попытку.");
            }
        }
    }

    public void filterMenu() {
        boolean exit = false;
        while (!exit) {
            System.out.println("--------------------------------");
            System.out.println("Товары по фильтрам: ");
            System.out.println("0 - Вернуться в главное меню");
            System.out.println("1 - Бренд");
            System.out.println("2 - Диагональ Дисплея");
            System.out.println("3 - Процессор");
            System.out.println("4 - Видеокарта");
            System.out.println("5 - Оперативная память");
            System.out.println("6 - Жёсткий диск");
            System.out.println("7 - Операционная система");
            System.out.println("8 - Цена");
            System.out.println("--------------------------------");
            String request = this.getStringRequest("Выберите пункт меню (или несколько через пробел): ");
            String[] response = this.getResponse(request);
            for (String responseID : response) {
                Integer id = Integer.parseInt(responseID);
                switch (id) {
                    case 0 -> {
                        exit = true;
                        this.mainMenu();
                    }
                    case 1 -> {
                        String brandFilter = this.getStringRequest("Введите Бренд: ");
                        filterMap = super.fillFilter(id, brandFilter, filterMap);
                    }
                    case 2 -> {
                        Double displayFilter = this.getDoubleRequest("Введите минимальный размер диагонали: ");
                        filterMap = super.fillFilter(id, displayFilter, filterMap);
                    }
                    case 3 -> {
                        String cpuFilter = this.getStringRequest("Введите название процессора: ");
                        filterMap = super.fillFilter(id, cpuFilter, filterMap);
                    }
                    case 4 -> {
                        String gpuFilter = this.getStringRequest("Введите название видеокарты: ");
                        filterMap = super.fillFilter(id, gpuFilter, filterMap);
                    }
                    case 5 -> {
                        Integer ramFilter = this.getIntegerRequest("Введите минимальный размер ОЗУ: ");
                        filterMap = super.fillFilter(id, ramFilter, filterMap);
                    }
                    case 6 -> {
                        Integer diskFilter = this.getIntegerRequest("Введите минимальный размер диска: ");
                        filterMap = super.fillFilter(id, diskFilter, filterMap);
                    }
                    case 7 -> {
                        String osFilter = this.getStringRequest("Введите название ОС: ");
                        filterMap = super.fillFilter(id, osFilter, filterMap);
                    }
                    case 8 -> {
                        Double priceFilter = this.getDoubleRequest("Введите минимальную цену: ");
                        filterMap = super.fillFilter(id, priceFilter, filterMap);
                    }
                    default -> System.out.println(responseID + "Этот фильтр введён некорректно.");
                }
            }
            this.showResult();
            filterMap.clear();
        }
    }

    public void showAll(ArrayList<Laptop> laptops) {
        System.out.println("--------------------------------");
        System.out.println("Список всех товаров:");
        for (Object obj : laptops)
            System.out.println(obj);
    }


    public void showResult() {
        ArrayList<Laptop> filterResult = super.getLaptopsFromFilter(laptops, filterMap);
        System.out.println("--------------------------------");
        System.out.println("Список отфильтрованных товаров:");
        if (filterResult.size() > 0) {
            for (Object obj : filterResult)
                System.out.println(obj);
        } else System.out.println("Совпадений не найдено.");
    }
}
