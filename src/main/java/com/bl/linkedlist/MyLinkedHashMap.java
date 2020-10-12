package com.bl.linkedlist;

import java.util.ArrayList;

public class MyLinkedHashMap<K, V> {
    public final int numBuckets;
    ArrayList<MyLinkedList<K>> myBucketArray;

    public MyLinkedHashMap() {
        this.numBuckets = 10;
        this.myBucketArray = new ArrayList<>(numBuckets);
        for (int i = 0; i < numBuckets; i++) {
            this.myBucketArray.add(null);
        }
    }
//Method to get linked list and node using key
    public V get(K word) {
        int index = this.getBucketIndex(word);
        MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null)
            return null;
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(word);
        return (myMapNode == null) ? null : myMapNode.getValue();
    }
//Method to get which index of the hashtable to use
    private int getBucketIndex(K word) {
        int hashCode = Math.abs(word.hashCode());
        int index = hashCode % numBuckets;
        return index;
    }
//Method to add a new word
    public void add(K word, V value) {
        int index = this.getBucketIndex(word);
        MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null) {
            myLinkedList = new MyLinkedList<>();
            this.myBucketArray.set(index, myLinkedList);
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.search(word);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(word, value);
            myLinkedList.insert(myMapNode);

        } else {
            myMapNode.setValue(value);
        }

    }
//Method to delete an occurrence of a word
    public K delete(K word) {
        int index = this.getBucketIndex(word);
        MyLinkedList<K> myLinkedList = this.myBucketArray.get(index);
        if (myLinkedList == null) {
            return null;
        }
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) myLinkedList.deleteAtIndex(word);

        return (myMapNode == null) ? null : myMapNode.getKey();
    }

}
