package com.bl.linkedlist;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MyBinaryTreeTest {
    @Test
    public void givenThreeNumbersFormABST() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
        myBinaryTree.add(36);
        myBinaryTree.add(70);
        myBinaryTree.add(56);
        myBinaryTree.inOrderTraversal();
        int size = MyBinaryTree.size;
        System.out.println(size);
        Assert.assertEquals(4, size);
    }
    @Test
    public void givenMoreThanThreeNumbersFormABST() {
        MyBinaryTree<Integer> myBinaryTree = new MyBinaryTree<Integer>();
        Integer[] integerList={56,30,70,22,40,60,95,11,3,16,65,63,67};
        for (Integer element:integerList){
            myBinaryTree.add(element);
        }
        myBinaryTree.inOrderTraversal();
        int size = MyBinaryTree.size;
        System.out.println(size);
        Assert.assertEquals(13, size);
    }
}