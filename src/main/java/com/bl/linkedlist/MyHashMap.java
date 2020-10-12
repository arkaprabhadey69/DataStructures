package com.bl.linkedlist;

public class MyHashMap<K, V> {
    public  MyLinkedList<K> myLinkedList;

    public MyHashMap() {
        this.myLinkedList=new MyLinkedList<>();
    }
//Method to get occurence based on key
    public V get(K key) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
        return  (myMapNode==null)?null:myMapNode.getValue();
    }
//Method to add element to hashtable
    public void add(K key, V value) {
        MyMapNode<K, V> myMapNode = (MyMapNode<K, V>) this.myLinkedList.search(key);
        if (myMapNode == null) {
            myMapNode = new MyMapNode<>(key, value);
            myLinkedList.insert(myMapNode);
        } else
            myMapNode.setValue(value);
    }
    //Method to delete element from hashtable
    public K delete(K key){
        MyMapNode<K,V> myMapNode= (MyMapNode<K, V>) this.myLinkedList.deleteAtIndex(key);
        return (myMapNode==null)?null:myMapNode.getKey();
    }
}