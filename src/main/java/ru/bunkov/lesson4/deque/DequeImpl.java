package ru.bunkov.lesson4.deque;

import ru.bunkov.lesson4.LinkedQueueImpl;
import ru.bunkov.lesson4.TwoSideLinkedList;
import ru.bunkov.lesson4.TwoSideLinkedListImpl;

public class DequeImpl<E>  {

    private final TwoSideLinkedList<E> data;
    private int size =0;
    private int capacity;

    public DequeImpl(int maxCapacity) {
        this.capacity = maxCapacity;
        this.data = new TwoSideLinkedListImpl<>();
    }

    public boolean insertLeft(E value) {
        if(isFull()){
            return false;
        }
        size++;
        data.insertFirst(value);
        return true;
    }

    public boolean insertRight(E value) {
        if(isFull()){
            return false;
        }
        size++;
        data.insertLast(value);
        return true;
    }


    public void removeLeft() {
        size--;
        data.removeFirst();
    }


    public void removeRight() {
        size--;
        data.remove(data.getLast());
    }

    public E peekLeft() {
        return data.getFirst();
    }

    public E peekRight() {
        return data.getLast();
    }
    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return data.isEmpty();
    }
    public boolean isFull(){
        return size == capacity;
    }

    public void display() {
        data.display();
    }
}
