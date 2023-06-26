package org.example.labs;

import java.util.Iterator;

public class Node <Item> implements Iterable<Item>{
    public Item data;
    public Node <Item> next;
    private Node<Item> head; // Instance variable for the head of the linked list
    private int size=0;
    public void addToFront (Item item){
        Node<Item> newNode= new Node <Item>();
        newNode.data=item;
        newNode.next=head;
        head=newNode;
        size++;
    }
    public void removeFromFront(){
        if (head==null){
            throw new IndexOutOfBoundsException("The linked list is empty");
        }
        head=head.next;
        size--;
    }
    public void addtoRear(Item item){
        Node <Item> newNode= new Node<Item>();
        newNode.data=item;
        if (head==null){
            head=newNode;
        }
        else{
            Node <Item> current=head;
            while (current.next!=null){
                current=current.next;
            }
            current.next=newNode;
        }
        size++;
    }
    public void removeFromRear(){
        if(head==null){
            throw new IndexOutOfBoundsException("The linked list is empty");
        } else if(size==1){
            head=null;
        }
        else{
            Node<Item> current=head;
            while(current.next.next!=null){
                current=current.next;
            }
            current.next=null;
        }
        size--;
    }
    public int count(){
        return size;
    }
    /* get a linked list node by index*/
        Item get (int index) {
        if (index < 0 || index >= size) {
            throw new IndexOutOfBoundsException("invalid linked list");
        }
        Node<Item> current = head;
        int i = 0;
        while (i < index) {
            current = current.next;
            i++;
        }
        return current.data;
    }
    private class LinkedListIterator implements Iterator<Item>{
        Node<Item> current=head;
        public boolean hasNext(){
            return current!=null;
        }
        public Item next(){
            Item item=current.data;
            current=current.next;
            return item;
        }
    }
    public Iterator<Item> iterator(){
        return new LinkedListIterator();
    }

}
