package ru.bunkov.lesson4.deque;

import ru.bunkov.lesson3.queue.Queue;

public interface Deque<E> extends Queue<E> {
    boolean insertLeft(E value);
    boolean insertRight(E value);

    void removeLeft();
    void removeRight();

}
