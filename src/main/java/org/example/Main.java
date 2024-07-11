package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Integer> nums = new ArrayList<>(List.of(10, 1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        // Task one
        printUnevenNumbers(nums);
        System.out.println();
        // Task two
        printEvenNumbers(nums);
        System.out.println();
        // Task three
        List<String> words = new ArrayList<>(List.of(("Напишите код который выводит в консоль все уникальные " +
                "слова из списка слов в котором могут встречаться дубли Код должен работать с любой " +
                "последовательностью и объемом списка слов").split(" ")));
        printUniqueWords(words);
        System.out.println();
        // Task four
        List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
        printDoubleWordsCount(strings);
    }

    static void printUnevenNumbers(List<Integer> list) {
        if (list == null) {
            System.out.println("List is empty or equals null");
            return;
        }
        list.stream().filter(e -> e % 2 != 0).forEach(e -> System.out.print(e + " "));
        System.out.println();
    }

    static void printEvenNumbers(List<Integer> list) {
        if (list == null) {
            System.out.println("List is empty or equals null");
            return;
        }
        Set<Integer> integerSet = new TreeSet<>();
        for (Integer i : list) {
            if (i % 2 == 0) {
                integerSet.add(i);
            }
        }

        System.out.println(integerSet);
    }

    static void printUniqueWords(List<String> list) {
        if (list == null) {
            System.out.println("List is empty or equals null");
            return;
        }
        Set<String> stringSet = new HashSet<>(list);
        System.out.println(stringSet);
    }

    static void printDoubleWordsCount(List<String> list) {
        if (list == null) {
            System.out.println("List is empty or equals null");
            return;
        }
        Map<String, Integer> map = new HashMap<>();
        for (String s : list) {
            if (!map.containsKey(s)) {
                map.put(s, 1);
            } else {
                map.put(s, map.get(s) + 1);
            }
        }
        map.forEach((e, r) -> System.out.println(r));
    }
}