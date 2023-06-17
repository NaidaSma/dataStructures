package org.example.labs;

import org.example.labs.Node;

import java.util.LinkedList;
import java.util.Random;

public class App {
  public static void main(String[] args) {
    queuesExample();
    linkedListExample();
    linearSearchExample();
    binarySearchExample();
    SelectionSortExample();
    InsertionSortExample();
    ShellSortExample();
  }
    private static void queuesExample(){
      Queue<Integer> queue=new Queue<Integer>();
      queue.enqueue(1);
      queue.enqueue(2);
      queue.enqueue(3);
      System.out.println(queue.dequeue());
      System.out.println("Queue size "+ queue.size());
    }
  private static void linkedListExample(){
    Node<Integer> list=new Node<Integer>();
    list.addtoRear(1);
    list.addtoRear(2);
    list.addtoRear(3);
    list.addtoRear(4);
    list.addtoRear(5);
    list.addtoRear(6);
    list.removeFromRear();
    list.removeFromFront();
    for(Integer i:list){
      System.out.println(i);
    }

    System.out.println("list size:"+list.count());
  }
  public static void linearSearchExample() {
    int[] elements = {49, 16, 19, 17, 15, 53, 30, 90, 42, 11};

    // Successful search
    int key = 53;
    int index = LinearSearch.search(elements, key);
    System.out.println("Element " + key + " is located at index: " + index);

    // Element not found
    key = 18;
    index = LinearSearch.search(elements, key);
    System.out.println("Element " + key + " is located at index: " + index);
  }
  public static void binarySearchExample() {
    /* Sorted array */
    int[] elements = { 3, 4, 5, 11, 14, 19, 21, 26, 33, 49, 56, 71, 72, 74, 89, 90, 98, 100 };

    /* Return the index of an element */
    int index = BinarySearch.search(elements, 19);
    System.out.println("index: " + index);

    /* Element not found */
    int index2 = BinarySearch.search(elements, 42);
    System.out.println("index: " + index2);
  }
  public static void SelectionSortExample(){
    int[] elements = new int[100];
    Random random = new Random();

    /* Generate random elements */
    for (int i = 0; i < elements.length; i++) {
      elements[i] = random.nextInt(1000);
    }

    /* Sort the array */
    SelectionSort.sort(elements);

    /* Print the elements */
    for (int i: elements) {
      System.out.println(i);
    }
  }
  public static void InsertionSortExample(){
    int[] elements = new int[100];
    Random random = new Random();

    /* Generate random elements */
    for (int i = 0; i < elements.length; i++) {
      elements[i] = random.nextInt(1000);
    }

    /* Sort the array */
    InsertionSort.sort(elements);

    /* Print the elements */
    for (int i: elements) {
      System.out.println(i);
    }
  }
  public static void ShellSortExample(){
    int[] elements = new int[100];
    Random random = new Random();

    /* Generate random elements */
    for (int i = 0; i < elements.length; i++) {
      elements[i] = random.nextInt(1000);
    }

    /* Sort the array */
    ShellSort.sort(elements);

    /* Print the elements */
    for (int i: elements) {
      System.out.println(i);
    }
  }
}
