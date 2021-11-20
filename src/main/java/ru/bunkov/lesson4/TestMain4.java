package ru.bunkov.lesson4;

import ru.bunkov.lesson4.deque.DequeImpl;

public class TestMain4 {

    public static void main(String[] args) {
        var list = new DequeImpl<Integer>(5);
        list.insertLeft(1);
        list.insertLeft(2);
        list.insertLeft(3);
        list.insertLeft(4);
        list.insertRight(5);
        list.display();
        list.removeLeft();
        list.removeRight();
        list.display();
        var linkedList = new TwoSideLinkedListImpl<Integer>();
//        for(Integer value: linkedList){
//            System.out.println(value);
//        }
    }

}
