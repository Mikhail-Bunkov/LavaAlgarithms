package ru.bunkov.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 20;
        ArrayGenerator generator = new ArrayGenerator();
        List<Notebook> arr = new ArrayList<>();
        arr = generator.generate(n);
        BubbleSort bubbleSort = new BubbleSort();
        arr.forEach(System.out::println);
        System.out.println("Начало сортировки");
        long start = System.currentTimeMillis();
        //sort
        bubbleSort.sort(arr, n);
        arr.forEach(System.out::println);
        System.out.println(System.currentTimeMillis() - start);
    }
}
