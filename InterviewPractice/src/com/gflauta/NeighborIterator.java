package com.gflauta;

public class NeighborIterator {
    public Neighbor currentNeighbor;
    private Neighbor previousNeighbor;
    private DoubleEndedLinkedList theNeighbors;

    public NeighborIterator(DoubleEndedLinkedList theNeighbors) {
        this.theNeighbors = theNeighbors;
        this.currentNeighbor = theNeighbors.firstLink;
        this.previousNeighbor = theNeighbors.lastLink;
    }

    public boolean hasNext() {
        if(currentNeighbor.next!=null) {
            return true;
        }
        return false;
    }

    public Neighbor next(){
        if (hasNext()) {
            previousNeighbor = currentNeighbor;
            currentNeighbor = currentNeighbor.next;

            return currentNeighbor;
        }
        return null;
    }

    public void remove() {
        if(previousNeighbor==null) {
            theNeighbors.firstLink = currentNeighbor.next;
        } else {
            previousNeighbor.next = currentNeighbor.next;
            if (currentNeighbor.next==null) {
                currentNeighbor=theNeighbors.firstLink;
                previousNeighbor=null;
            } else {
                currentNeighbor = currentNeighbor.next;
            }
        }

    }
}
