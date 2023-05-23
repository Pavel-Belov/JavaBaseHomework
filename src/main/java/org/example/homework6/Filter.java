package org.example.homework6;

import java.util.ArrayList;
import java.util.Map;

public class Filter extends Laptop {
    public Filter() {

    }

    public Map<Integer, Object> fillFilter(Integer request, Object filter, Map<Integer, Object> filterMap) {
        filterMap.putIfAbsent(request, filter);
        return filterMap;
    }

    public ArrayList<Laptop> getLaptopsFromFilter(ArrayList<Laptop> laptops, Map<Integer, Object> filtertMap) {
        ArrayList<Laptop> resultList = new ArrayList<>();
        boolean coincidence;
        for (int i = 0; i < laptops.size(); i++) {
            coincidence = true;
            if (filtertMap.containsKey(1)) {
                String brand = laptops.get(i).getBrand().toLowerCase();
                String brandFilter = filtertMap.get(1).toString().toLowerCase();
                if (!brand.contains(brandFilter)) {
                    coincidence = false;
                    continue;
                }
            }
            if (filtertMap.containsKey(2)) {
                Double display = laptops.get(i).getDisplay();
                Double displayFilter = (Double) filtertMap.get(2);
                if (display < displayFilter) {
                    coincidence = false;
                    continue;
                }
            }
            if (filtertMap.containsKey(3)) {
                String cpu = laptops.get(i).getCpu().toLowerCase();
                String cpuFilter = filtertMap.get(3).toString().toLowerCase();
                if (!cpu.contains(cpuFilter)) {
                    coincidence = false;
                    continue;
                }
            }
            if (filtertMap.containsKey(4)) {
                String gpu = laptops.get(i).getGpu().toLowerCase();
                String gruFilter = filtertMap.get(4).toString().toLowerCase();
                if (!gpu.contains(gruFilter)) {
                    coincidence = false;
                    continue;
                }
            }
            if (filtertMap.containsKey(5)) {
                Integer ram = laptops.get(i).getRam();
                Integer ramFilter = (Integer) filtertMap.get(5);
                if (ram < ramFilter) {
                    coincidence = false;
                    continue;
                }
            }
            if (filtertMap.containsKey(6)) {
                Integer disk = laptops.get(i).getDisk();
                Integer diskFilter = (Integer) filtertMap.get(6);
                if (disk < diskFilter) {
                    coincidence = false;
                    continue;
                }
            }
            if (filtertMap.containsKey(7)) {
                String os = laptops.get(i).getOs().toLowerCase();
                String osFilter = filtertMap.get(7).toString().toLowerCase();
                if (!os.contains(osFilter)) {
                    coincidence = false;
                    continue;
                }
            }
            if (filtertMap.containsKey(8)) {
                Double price = laptops.get(i).getPrice();
                Double priceFilter = (Double) filtertMap.get(8);
                if (price < priceFilter) {
                    coincidence = false;
                    continue;
                }
            }
            if (coincidence) resultList.add(laptops.get(i));
        }
        return resultList;
    }
}
