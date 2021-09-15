package ru.bunkov.lesson3.queue;

public interface Queue<E> {
    boolean insert( E value);
    E removeFront();
    E peakFront();
    int size();
    boolean isEmpty();
    boolean isFull();
    void display();
}
