package task1;

import org.example.labs.Node;

import java.util.NoSuchElementException;

public class Stack<Item> {
    Item data;
    Stack<Item> next;
    Item value;
    Item item;
    private Queue<Item> q1;
    private Queue<Item> q2;
    private Stack<Item> stackTop = null;
    private int size = 0;

    public Stack() {
    	this.stackTop=null;
    }

    public void push(Item data) {
    	Stack<Item> newNode=new Stack<Item>();
		if(newNode==null) {
			System.out.println("Stack is full");
			}
		newNode.data=value;
		newNode.next=stackTop;
		stackTop=newNode;
    }

    public Item pop() {
        
    	if (stackTop == null) {
            System.out.println("Stack underflow");
        }
        Stack<Item> temp=stackTop;

        stackTop = stackTop.next;
        return temp.data;
    }

    public Item peek() {
    	if (isEmpty()) {
            throw new NoSuchElementException("Stack is empty");
        }
        return stackTop.item;
    }

    public int size() {
    	return size;
    }

    public boolean isEmpty() {
    	return stackTop==null;
    }
}
