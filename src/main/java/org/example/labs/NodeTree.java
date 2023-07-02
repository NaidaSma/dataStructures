package org.example.labs;

public class NodeTree {
    public Key key;             				// the node's key
    public Value value;            			// the value associated with the key
    public Node<Key, Value> left, right;     // references to left and right child
    public int size = 1;                		// size of the node

    /* Node constructor */
    public NodeTree(Key key, Value value) {
        this.key = key;
        this.value = value;
    }
}
