package com.bl.linkedlist;

public class MyBinaryNode<K extends Comparable<K>> {
    K key;
    MyBinaryNode<K> leftTree;
    MyBinaryNode<K> rightTree;

    public MyBinaryNode(K key){
        this.key=key;
        leftTree=null;
        rightTree=null;
    }

    public K getKey() {
        return key;
    }
}
