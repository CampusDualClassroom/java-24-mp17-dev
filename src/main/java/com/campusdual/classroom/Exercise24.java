package com.campusdual.classroom;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

public class Exercise24 {
    public static Queue<String> createQueue() {
        Queue<String> stringQueue = new LinkedList<>();
        stringQueue.add("Smith");
        stringQueue.add("Montessori");
        stringQueue.add("Peralta");
        stringQueue.add("House");
        return stringQueue;
    }
    public static void printAndEmptyQueue(Queue<String> queue) {
        Iterator<String> stringIterator = queue.iterator();
        while (stringIterator.hasNext()) {
            String elem = stringIterator.next();
            stringIterator.remove();
            System.out.println(elem);
        }
    }

    public static void main(String[] args) {
        printAndEmptyQueue(new LinkedList<>(List.of("1", "2", "3", "4")));
    }

}
