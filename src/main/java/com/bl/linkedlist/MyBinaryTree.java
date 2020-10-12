package com.bl.linkedlist;

public class MyBinaryTree<K extends Comparable<K>> {
    private MyBinaryNode<K> root;
    public static int size;

    public MyBinaryTree() {
        this.root = null;
    }

    public void add(K key)
    {
        this.root=this.addRecursive(root,key);
    }

    private MyBinaryNode<K> addRecursive(MyBinaryNode<K> current, K key) {
        if(current==null)
            return new MyBinaryNode<K>(key);
        int compareResult=key.compareTo(current.key);
        if(compareResult==0) return current;
        if(compareResult<0){
            current.leftTree=addRecursive(current.leftTree,key);

        }else
            current.rightTree=addRecursive(current.rightTree,key);
        return current;
    }
    private MyBinaryNode<K> searchRecursive(MyBinaryNode<K> current, K key) {
        if(current==null)
            return new MyBinaryNode<>(key);
        int compareResult=key.compareTo(current.key);
        if(compareResult==0) return current;
        if(compareResult<0){
            current.leftTree=searchRecursive(current.leftTree,key);

        }else
            current.rightTree=searchRecursive(current.rightTree,key);
        return current;
    }

    public void inOrderTraversal()
    {
        inOrderHelper(root);
    }
    private void inOrderHelper(MyBinaryNode<K> current)
    {
        if (current!= null)
        {
            size++;
            inOrderHelper(current.leftTree);
            System.out.print(current+" ");
            inOrderHelper(current.rightTree);
        }
    }


    public int getSize(){
        return this.getSizeOfTree(root);
    }
    private  int getSizeOfTree(MyBinaryNode<K> current){
        return (current==null)?0:1+getSizeOfTree(current.leftTree)+getSizeOfTree(current.leftTree);
    }



}
