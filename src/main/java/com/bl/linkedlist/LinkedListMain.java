package com.bl.linkedlist;

public class LinkedListMain<K> implements INode<K> {

    // public
    public K key;
    public INode<K> next;

    public K getKey() {
        return key;
    }

    public void setKey(K key) {
        this.key = key;
    }

    public LinkedListMain(K key) {
        this.key = key;
        this.next = null;
    }


    public INode<K> getNext() {
        return next;
    }

    public void setNext(INode<K> next) {
        this.next = next;
    }
}
