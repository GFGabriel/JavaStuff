package com.gflauta;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class DoubleEndedLinkedList {

    Neighbor firstLink;
    Neighbor lastLink;

    public void insertInFirstPostion(String ownerName, int houseNumber) {
        Neighbor theNewLink = new Neighbor(ownerName, houseNumber);

        if(isEmpty()){
            lastLink =theNewLink;
        } else {
            firstLink.previous = theNewLink;
        }
        theNewLink.next = firstLink;
        firstLink = theNewLink;
    }

    public void insertInLastPosition(String ownerName, int houseNumber) {
        Neighbor theNewLink = new Neighbor(ownerName, houseNumber);

        if(isEmpty()){
            firstLink =theNewLink;
        } else {

        lastLink.next = theNewLink;
        theNewLink.previous= lastLink;
        }

        lastLink = theNewLink;
    }

    public boolean insertAfterKey(String ownerName, int houseNumber, int key) {
        Neighbor theNewLink = new Neighbor(ownerName, houseNumber);
        Neighbor currentNeighbor = firstLink;

        while(currentNeighbor.houseNumber != key) {
            currentNeighbor = currentNeighbor.next;
            if(currentNeighbor == null) {
                return false;
            }
        }
        if(currentNeighbor == lastLink) {
            theNewLink.next = null;
            lastLink = theNewLink;
        } else {
            theNewLink.next = currentNeighbor.next;
            currentNeighbor.next.previous = theNewLink;
        }
        theNewLink.previous = currentNeighbor;
        currentNeighbor.next = theNewLink;
        return true;

    }

    public void insertInOrder(String ownerName, int houseNumber) {
        Neighbor theNewLink = new Neighbor(ownerName, houseNumber);
        Neighbor previousNeighbor = null;
        Neighbor currentNeighbor = firstLink;

        while(currentNeighbor != null && currentNeighbor.houseNumber > theNewLink.houseNumber) {
            previousNeighbor = currentNeighbor;
            currentNeighbor = currentNeighbor.next;
        }

        if(previousNeighbor == null) {
            firstLink = theNewLink;
        } else {
            previousNeighbor.next = theNewLink;
        }
        theNewLink.next = currentNeighbor;
    }

    private boolean isEmpty() {
        return firstLink == null;
    }

    public void display(){
        Neighbor theLink = firstLink;

        while(theLink!=null) {
            theLink.display();
            System.out.println("Next link: " + theLink.next);
            theLink = theLink.next;
            System.out.println();
        }
    }
    public static void main(String[] args) {
        DoubleEndedLinkedList theLinkedList = new DoubleEndedLinkedList();

        theLinkedList.insertInOrder("George", 7);
        theLinkedList.insertInOrder("Bob", 18);
        theLinkedList.insertInOrder("Katie", 1);

       // theLinkedList.insertAfterKey("Kimiko", 9, 7);
       // theLinkedList.insertAfterKey("Sabriel", 16, 1);

        theLinkedList.display();

        NeighborIterator neighborIterator = new NeighborIterator(theLinkedList);

        neighborIterator.currentNeighbor.display();
        System.out.println(neighborIterator.hasNext());
        neighborIterator.next();
        neighborIterator.currentNeighbor.display();
        neighborIterator.remove();
        neighborIterator.currentNeighbor.display();

        theLinkedList.display();

        System.out.println("Native LinkedList and Iterator");
        LinkedList<Neighbor> nativeNeighborLinkedList = new LinkedList<Neighbor>();
        nativeNeighborLinkedList.add(new Neighbor("George", 7));
        nativeNeighborLinkedList.add(new Neighbor("Bob", 18));
        nativeNeighborLinkedList.add(new Neighbor("Katie", 1));
        System.out.println(nativeNeighborLinkedList.peek());
        ListIterator<Neighbor> nativeNeighborIterator = nativeNeighborLinkedList.listIterator();
        System.out.println(nativeNeighborIterator.hasNext());
        System.out.println(nativeNeighborIterator.next());
        System.out.println(nativeNeighborIterator.next());
        System.out.println(nativeNeighborIterator.next());
        System.out.println(nativeNeighborIterator.previous());
        System.out.println(nativeNeighborIterator.previous());
    }

}
