package org.example.labs;

public class NodeRBT<Key extends Comparable<Key>, Value> {
    public Key key;
    public Value value;
    public Node<Key, Value> left, right;
    public int size=1;
    public boolean color;
    public Node(Key key, Value value, boolean color){
        this.key=key;
        this.value=value;
        this.color=color;
    }

}
