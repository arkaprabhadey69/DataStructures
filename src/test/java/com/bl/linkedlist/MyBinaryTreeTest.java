package com.bl.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyBinaryTreeTest {
    @Test
    public void givenThreeNumbersFormABST() {
        MyBinaryTree<Integer> myBinaryTree= new MyBinaryTree<>();
        myBinaryTree.add(56);
        myBinaryTree.add(30);
        myBinaryTree.add(70);



        int size= myBinaryTree.getSize();
        System.out.println(size);
        Assert.assertEquals(3,size);
    }
}