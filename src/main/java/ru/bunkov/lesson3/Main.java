package ru.bunkov.lesson3;


import ru.bunkov.lesson3.queue.Deque;
import ru.bunkov.lesson3.queue.DequeImpl;

public class Main {
    public static void main(String[] args) {

        SearchForMissed searcher = new SearchForMissed();
        int arr[] = new int[]{1,2,3,4,5,6,8,9,10};
        searcher.search(arr);



        // 2
        Deque deque = new DequeImpl(7);
        deque.insertRight(5);
        deque.insertRight(5);
        System.out.println(deque.removeLeft());
        System.out.println(deque.removeLeft());
        deque.insertRight(4);
        deque.insertRight(2);
        System.out.println(deque.removeRight());
        deque.insertRight(2);
        deque.insertLeft(6);
        System.out.println(deque);
    }
}
