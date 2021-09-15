package ru.bunkov.lesson3.queue;

import java.util.Arrays;

public class DequeImpl<E> implements Deque<E>{

    private int size;

    private int right;

    private int left;

    private final E[] data;

    private final int LEFT_DEFAULT = 0;

    private final int RIGHT_DEFAULT = -1;



    public DequeImpl( int maxSize) {
        this.data = (E[]) new Object[maxSize];
        left = LEFT_DEFAULT;
        right = RIGHT_DEFAULT;
    }

    @Override
    public boolean insertRight(E value) {
        if(isFull()){
            return false;
        }
        data[++right] = value;
        size++;
        return true;
    }

    @Override
    public boolean insertLeft(E value) {
        if(isFull()){
            return false;
        }
        for (int i = ++right; i >left; i--) {
            data[i] = data[i-1];
        }
        data[left] = value;
        return true;
    }

    @Override
    public E removeRight() {
        if(isEmpty()){
            return null;
        }
        E value = data[right--];;
        size--;
        return value;
    }

    @Override
    public E removeLeft() {
        if(isEmpty()){
            return null;
        }
        E value = data[left++];
        size--;
        return value;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    @Override
    public boolean isFull() {
        return size == data.length;
    }

    @Override
    public void display() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (int i = left; i <= right; i++) {
            sb.append(data[i]);
            if(i!=right){
                sb.append(", ");
            }
        }
        sb.append("]");
        return sb.toString();
    }

    @Override
    public boolean insert(E value) {
        return insertRight(value);
    }

    @Override
    public E removeFront() {
        return removeLeft();
    }

    @Override
    public E peakFront() {
        return data[left];
    }

    @Override
    public E peakTail() {
        return data[right];
    }
}
