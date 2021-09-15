package ru.bunkov.lesson3.queue;

public interface Deque<E> extends Queue<E>{
    boolean insertRight(E value);
    boolean insertLeft(E value);
    E peakTail();
    E removeRight();
    E removeLeft();
    }
