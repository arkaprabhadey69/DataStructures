package com.bl.linkedlist;

public class MyBinaryNode<K extends Comparable<K>> {
    K key;
    MyBinaryNode<K> left;
    MyBinaryNode<K> right;

    public MyBinaryNode(K key){
        this.key=key;
        left=null;
        right=null;
    }
    public String toString()
    {
        return key.toString();
    }

    public K getKey() {
        return key;
    }
}
