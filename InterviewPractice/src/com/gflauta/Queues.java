package com.gflauta;

import java.util.*;

public class Queues {
    private String[] queueArray;
    private int queueSize;
    private int frontOfTheLine;
    private int endOfTheLine;
    private int numberOfItems;

    public Queues(int size) {
        this.queueArray = new String[size];
        this.queueSize = size;
        this.frontOfTheLine = 0;
        this.endOfTheLine = 0;
        this.numberOfItems = 0;
    }

    private void add(String input) {
        if (numberOfItems == 0) {
            queueArray[endOfTheLine] = input;
            numberOfItems++;
            return;
        }
        endOfTheLine++;
        if(endOfTheLine >= queueSize) {
            endOfTheLine--;
            System.out.println("Sorry, the queue is full");
        } else {
            queueArray[endOfTheLine] = input;
            numberOfItems++;
        }
    }

    private String peek() {
        return queueArray[frontOfTheLine];
    }

    private void remove() {
        if (frontOfTheLine < endOfTheLine) {
            frontOfTheLine++;
        } else if (frontOfTheLine == endOfTheLine) {
            frontOfTheLine++;
            endOfTheLine++;
        } else {
            System.out.println("Nothing left in queue");
        }
    }
    public static void main(String[] args) {
        Queues queue = new Queues(10);
        queue.add("10");
        System.out.println(queue.peek());
        queue.add("15");
        queue.remove();
        System.out.println(queue.peek());


        System.out.println("Native queue");
        Queue<String> stringQueue = new LinkedList<String>();
        stringQueue.add("10");
        System.out.println(stringQueue);
        System.out.println(stringQueue.peek());
        stringQueue.add("15");
        System.out.println(stringQueue);
        stringQueue.remove();
        System.out.println(stringQueue);

        System.out.println("Native Priority Queue");
        PriorityQueue<String> priorityQueue = new PriorityQueue<String>();
        priorityQueue.add("C");
        priorityQueue.add("B");
        System.out.println(priorityQueue.peek());
        System.out.println(priorityQueue.contains("A"));
        priorityQueue.poll();
        System.out.println(priorityQueue.peek());


    }

}
