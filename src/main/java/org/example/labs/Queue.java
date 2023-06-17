package org.example.labs;

public class Queue <Item> {
    private Node<Item> head=null;
    private Node<Item> tail=null;
    private int size=0;
    public void enqueue(Item newData){
        Node <Item> nodeToBeAdded=new Node<Item>();
        nodeToBeAdded.data=newData;
        if(this.isEmpty()){
            this.head=nodeToBeAdded;
        }
        else{
            this.tail.next=nodeToBeAdded;
        }
        this.tail=nodeToBeAdded;
        this.size++;
    }
    public Item dequeue(){
        if(isEmpty()) throw new IndexOutOfBoundsException("Queue is empty");
        Item dataToRead=this.head.data;
        this.head=this.head.next;
        size--;
        if(isEmpty()){
            this.tail=null;
        }
        return dataToRead;
    }
    public boolean isEmpty(){
        return this.size==0;
    }
    public int size(){
        return this.size;
    }
}
