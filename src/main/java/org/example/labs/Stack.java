package org.example.labs;

import java.util.NoSuchElementException;

public class Stack <Item> {
    private Node<Item> top = null;
    private int size = 0;


    /* Push an item onto the stack */
    public void push(Item item) {
        Node<Item> newNode=new Node<Item>();
        if(newNode==null) {
            System.out.println("Stack is full");
        }
        newNode.data=item;
        newNode.next=top;
        top=newNode;
    }

    /* Check if the stack is empty */
    public boolean isEmpty() {
        return top == null;
    }

    /* Remove the top item from the stack, and return its data */
    public Item pop() {
        if (top == null) {
            System.out.println("Stack underflow");
        }
        Node<Item> temp=top;

        top = top.next;
        return temp.data;
    }

    /* Return the current size of the stack */
    public int size() {
        return size;
    }

}
