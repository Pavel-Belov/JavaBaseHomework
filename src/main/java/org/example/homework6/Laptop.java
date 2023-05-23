package org.example.homework6;

import java.util.ArrayList;

public class Laptop {
    private String brand;
    private Double display;
    private String cpu;
    private String gpu;
    private Integer ram;
    private Integer disk;
    private String os;
    private Double price;

    public Laptop(String brand, Double display, String cpu, String gpu, Integer ram, Integer disk, String os, Double price) {
        this.brand = brand;
        this.display = display;
        this.cpu = cpu;
        this.gpu = gpu;
        this.ram = ram;
        this.disk = disk;
        this.os = os;
        this.price = price;
    }

    public Laptop() {

    }

    public String getBrand() {
        return brand;
    }

    public Double getDisplay() {
        return display;
    }

    public String getCpu() {
        return cpu;
    }

    public String getGpu() {
        return gpu;
    }

    public Integer getRam() {
        return ram;
    }

    public Integer getDisk() {
        return disk;
    }

    public String getOs() {
        return os;
    }

    public Double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Ноутбук " + this.brand + ", "
                + "Экран: " + this.display + ", "
                + "Процессор: " + this.cpu + ", "
                + "Графический процессор: " + this.gpu + ", "
                + "Оперативная память: " + this.ram + " Гб, "
                + "Диск: " + this.disk + " Гб, "
                + "Операционная система: " + this.os + ", "
                + "Цена: " + this.price + " р.";
    }

    public ArrayList<Laptop> getListOfLaptop() {
        ArrayList<Laptop> listOfLaptops = new ArrayList<>();
        listOfLaptops.add(new Laptop("Acer", 15.6, "Intel Core i3", "Intel UHD Graphics", 8, 512, "нет", 34900.0));
        listOfLaptops.add(new Laptop("Huawei", 16.0, "Intel Core i7", "Intel Iris Xe graphics", 16, 512, "Windows 11 Home", 99009.0));
        listOfLaptops.add(new Laptop("HIPER", 15.6, "AMD Ryzen 5", "AMD Radeon Vega 8", 16, 1024, "Windows 10 Professional", 44990.0));
        listOfLaptops.add(new Laptop("MSI", 15.6, "Intel Core i7", "NVIDIA GeForce RTX 3070", 16, 512, "нет", 129990.0));
        listOfLaptops.add(new Laptop("MSI", 15.6, "Intel Core i5", "NVIDIA GeForce GTX 1650", 8, 256, "Linux", 57990.0));
        listOfLaptops.add(new Laptop("CHUWI", 15.6, "Intel Core i5", "Intel UHD Graphics", 8, 512, "Windows 11 Home", 39990.0));
        return listOfLaptops;
    }
}
