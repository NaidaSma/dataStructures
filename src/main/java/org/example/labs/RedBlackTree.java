package org.example.labs;

public class RedBlackTree <Key extends Comparable <Key> , Value> {
    private Node<Key, Value> root;
    private static final boolean RED = true;
    private static final boolean BLACK = false;

    public Value get(Key key) {
        Node<Key, Value> x = root;              // 1

        while (x != null) {                     // 2
            int cmp = key.compareTo(x.key);     // 3
            if (cmp < 0) {                      // 4
                x = x.left;                     // 4
            } else if (cmp > 0) {               // 5
                x = x.right;                    // 5
            } else {                            // 6
                return x.value;                 // 6
            }
        }

        return null;                            // 7
    }

    /*orient a right-leaning red link to lean left
     */
    private Node<Key, Value> rotateLeft(Node<Key, Value> h) {
        Node<Key, Value> x = h.right;
        h.right = x.left;
        x.left = h;
        x.color = h.color;
        h.color = RED;
        h.size = 1 + size(h.left) + size(h.right);
        return x;
    }

    /*orient a left-leaning red link to lean right
     */
    private Node<Key, Value> rotateRight(Node<Key, Value> h) {
        Node<Key, Value> x = h.left;
        h.left = x.right;
        x.right = h;
        x.color = h.color;
        h.color = RED;
        h.size = 1 + size(h.left) + size(h.right);
        return x;
    }
    private void flipColors(Node<Key, Value> h){
        h.color=RED;
        h.right.color=BLACK;
        h.left.color=BLACK;
    }
    private boolean isRed(Node<Key, Value> x){
        if(x==null){
            return false;
        }
        return x.color==RED;
    }
    public void put(Key key, Value value){
        root=put(root, key, value);
    }
    private Node<Key, Value> put(Node<Key, Value> x, Key key, Value value) {
        if (x == null) {                                                            // 2
            return new Node<Key, Value>(key, value);                                // 2
        }

        int cmp = key.compareTo(h.key);                                             // 3
        if (cmp < 0) {                                                              // 4
            h.left = put(h.left, key, value);                                       // 4
        } else if (cmp > 0) {                                                       // 5
            h.right = put(h.right, key, value);                                     // 5
        } else {                                                                    // 6
            h.value = value;                                                        // 6
        }
        /*color balancing*/
        if(isRed(h.right) && !isRed(h.left)){
            h=rotateLeft(h);
        }
        if(isRed(h.left) && isRed(h.left.left)){
            h=rotateRight(h);
        }
        if(isRed(h.left) && isRed(h.right)){
            flipColors(h);
        }
        h.size=1+size(h.left)+size(h.right);
        return h;
    }
}
