package com.bl.linkedlist;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;

    public void add(K key)
    {
        this.root=this.addRecursive(root,key);
    }

    private MyBinaryNode<K> addRecursive(MyBinaryNode<K> current, K key) {
        if(current==null)
            return new MyBinaryNode<>(key);
        int compareResult=key.compareTo(current.key);
        if(compareResult==0) return current;
        if(compareResult<0){
            current.leftTree=addRecursive(current.leftTree,key);

        }else
            current.rightTree=addRecursive(current.rightTree,key);
        return current;
    }


    public int getSize(){
        return this.getSizeOfTree(root);
    }
    private  int getSizeOfTree(MyBinaryNode<K> current){
        return (current==null)?0:1+getSizeOfTree(current.leftTree)+getSizeOfTree(current.leftTree);
    }



}
