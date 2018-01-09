package com.gflauta;

import java.util.LinkedList;

public class Link {
    public String bookName;
    public int millionsSold;

    public Link next;

    public Link(String bookName, int millionsSold) {
        this.bookName = bookName;
        this.millionsSold = millionsSold;
    }

    public void display() {
        System.out.println(bookName + ": " + millionsSold + ",000,000");
    }

    public String toString() {
        return bookName;
    }

    public static void main(String[] args) {
        LinkList theLinkedList = new LinkList();

        theLinkedList.insertFirstLink("Don Quixote", 500);
        theLinkedList.insertFirstLink("A Tale of Two Cities", 200);
        theLinkedList.insertFirstLink("The Lord of the Rings", 150);
        theLinkedList.insertFirstLink("Harry Potter and the Sorcerer's Stone", 50);

        theLinkedList.removeLink("A Tale of Two Cities");
        theLinkedList.display();

        theLinkedList.findItem("Don Quixote").display();


        System.out.println("\nBuilt in Linked List");
        LinkedList<Link> linkLinkedList = new LinkedList<Link>();
        linkLinkedList.add(new Link("Don Quixote", 500));
        System.out.println(linkLinkedList.peek());
    }
}

class LinkList{
    public Link firstLink;

    LinkList(){
        firstLink = null;
    }

    public boolean isEmpty() {
        return(firstLink==null);
    }

    public void insertFirstLink(String bookName, int millionsSold) {
        Link newLink = new Link(bookName, millionsSold);

        newLink.next = firstLink;

        firstLink = newLink;
    }

    public Link removeFirstLink() {
        Link referenceLink = firstLink;
        if(!isEmpty()) {
            firstLink = firstLink.next;
        } else {
            System.out.println("Empty LinkList");
        }
        return referenceLink;
    }

    public void display() {
        Link theLink = firstLink;

        while(theLink!=null) {
            theLink.display();
            System.out.println("Next Link:" + theLink.next);
            theLink = theLink.next;
        }
    }

    public Link findItem(String name) {
        Link theLink = firstLink;

        while(theLink!=null) {
            if (theLink.bookName.equals(name)) {
                return theLink;
            }
            theLink = theLink.next;
        }
        return null;
    }

    public Link removeLink(String name) {
        Link currentLink = firstLink;
        Link previousLink = firstLink;

        while(!currentLink.bookName.equals(name)) {
            if (currentLink.next == null) {
                return null;
            } else {
                previousLink = currentLink;
                currentLink = currentLink.next;
            }
        }

        if(currentLink == firstLink) {
            removeFirstLink();
        } else {
            previousLink.next = currentLink.next;
        }
        return currentLink;
    }



}