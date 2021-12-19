package com.company;
import java.util.*;

public class Main {

    public static Map<String, String> createMap() {
        Map new_map = new HashMap();

        new_map.put("Октавиус", "Отто");
        new_map.put("Осборн", "Хари");
        new_map.put("Гарфилд", "Эндрю");
        new_map.put("Магуайер", "Тоби");
        new_map.put("Холанд", "Том");
        new_map.put("Паркер", "Питер");
        new_map.put("Уотсон", "МериДжейн");
        new_map.put("Кейдж", "Питер");
        new_map.put("Первый", "Флэш");
        new_map.put("Второй", "Флэш");

        return new_map;
    }

    public static void removeTheFirstNameDuplicates(Map<String, String> map) {

        Set<String> smth = new HashSet();
        Set<String> duplicates = new HashSet();

        for (Map.Entry entry : map.entrySet()) {
            String key = entry.getKey().toString();
            String value = entry.getValue().toString();

            if (smth.contains(value)) {
                duplicates.add(value);
            } else {
                smth.add(value);
            }
        }

        for (String s : duplicates) {
            removeItemFromMapByValue(map, s);
        }

    }

    public static void removeItemFromMapByValue(Map<String, String> map, String value) {

        Iterator<Map.Entry<String,String>> iter = map.entrySet().iterator();
        while (iter.hasNext()) {
            Map.Entry<String,String> entry = iter.next();
            if (entry.getValue() == value) {
                iter.remove();
            }
        }
    }

    public static void printMap(Map<String, String> map) {

        for (Map.Entry entry : map.entrySet()) {
            String key = entry.getKey().toString();
            String value = entry.getValue().toString();
            System.out.println();
            System.out.print(key);
            System.out.print(" ");
            System.out.print(value);
        }

    }

    public static void main(String[] args) {
        Map mp = createMap();
        removeTheFirstNameDuplicates(mp);
        printMap(mp);
    }

}
