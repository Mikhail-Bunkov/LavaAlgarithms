package ru.bunkov.lesson3.search;

public class BinarySearch {
    public static int search(Integer[] arr, int num) {

        int start = 0;
        int end = arr.length - 1;
        int base;
        int i = 0;

        while (end >= start) {

            i++;
            base = (start + end) / 2;

            if (arr[base] == num) {
                System.out.println("Кол-во итераций: " + i);
                return base;
            } else if (arr[base] > num) {
                end = base - 1;
            } else {
                start = base + 1;
            }
        }
        System.out.println("Кол-во итераций: " + i);
        return -1;
    }
}
