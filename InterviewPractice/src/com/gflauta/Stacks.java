package com.gflauta;


import java.util.HashSet;
import java.util.Stack;

public class Stacks {

    private String[] stackArray;
    private int stackSize;
    private int topOfStack = -1;

    public Stacks(int size) {
        this.stackSize = size;
        this.stackArray = new String[size];
    }

    public void push(String input) {
        if(topOfStack + 1 < stackSize) {
            topOfStack++;
            stackArray[topOfStack] = input;
            System.out.println(input + " added to the top of the stack.");
        } else {
            System.out.println("Sorry, the stack is full");
        }
    }

    public String pop() {
        if(topOfStack >= 0) {
            String result = stackArray[topOfStack];
            topOfStack--;
            return result;
        } else {
            return "Nothing found";
        }
    }

    public String peek() {
        if(topOfStack>=0) {
            return stackArray[topOfStack];
        }
        return "Nothing found";
    }

    public static void main(String[] args) {
        Stacks stack = new Stacks(10);

        stack.push("10");
        System.out.println(stack.peek());
        stack.push("15");
        System.out.println(stack.peek());
        stack.push("20");
        System.out.println(stack.peek());
        stack.pop();
        System.out.println(stack.peek());

        System.out.println("Native Stack");
        Stack<String> stringStack = new Stack<String>();
        stringStack.push("10");
        System.out.println(stringStack.peek());
        stringStack.push("15");
        System.out.println(stringStack.peek());
        stringStack.push("20");
        System.out.println(stringStack.peek());
        stringStack.pop();
        System.out.println(stringStack.peek());

    }
}
