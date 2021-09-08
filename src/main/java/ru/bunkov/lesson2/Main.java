package ru.bunkov.lesson2;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int n = 20000;
        ArrayGenerator generator = new ArrayGenerator();
        List<Notebook> arr = generator.generate(n);
//        arr.forEach(System.out::println); //для проверки правильности генерации.
        System.out.println("Начало сортировки");
        long start = System.currentTimeMillis();
        //sort

        System.out.println(System.currentTimeMillis() - start);
    }
}
