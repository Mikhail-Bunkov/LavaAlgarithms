package ru.bunkov.lesson4.deque;

import ru.bunkov.lesson4.LinkedQueueImpl;
import ru.bunkov.lesson4.TwoSideLinkedList;
import ru.bunkov.lesson4.TwoSideLinkedListImpl;

public class DequeImpl<E> {

    private final TwoSideLinkedList<E> data;
    private int size =0;

    public DequeImpl() {
        this.data = new TwoSideLinkedListImpl<>();
    }

    public boolean insertLeft(E value) {
        data.insertFirst(value);
        return true;
    }

    public boolean insertRight(E value) {
        data.insertLast(value);
        return true;
    }


    public void removeLeft() {
        data.removeFirst();
    }


    public void removeRight() {
        data.remove(data.getLast());
    }

    public E peekFront() {
        return data.getFirst();
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }

    public void display() {
        data.display();
    }
}
