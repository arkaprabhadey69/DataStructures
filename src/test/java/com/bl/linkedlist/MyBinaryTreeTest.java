package com.bl.linkedlist;

import org.junit.Assert;
import org.junit.Test;

public class MyBinaryTreeTest {

    @Test
    public void givenThreeNumbers_whenAddedToBST_shouldReturnHeightThree() {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        int sizeOfBinaryTree = binaryTree.getSize();
        Assert.assertEquals(3, sizeOfBinaryTree);
    }
    @Test
    public void givenManyNumbers_whenAddedToBST_shouldReturnHeightOfTree() {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(95);
        binaryTree.add(11);
        binaryTree.add(65);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(63);
        binaryTree.add(67);
        int sizeOfBinaryTree = binaryTree.getSize();
        Assert.assertEquals(13, sizeOfBinaryTree);
    }

    @Test
    public void givenManyNumbers_whenAddedAndKeySearchedInBST_shouldReturnTrueIfPresent() {
        MyBinaryTree<Integer> binaryTree = new MyBinaryTree<>();
        binaryTree.add(56);
        binaryTree.add(30);
        binaryTree.add(70);
        binaryTree.add(22);
        binaryTree.add(40);
        binaryTree.add(60);
        binaryTree.add(95);
        binaryTree.add(11);
        binaryTree.add(65);
        binaryTree.add(3);
        binaryTree.add(16);
        binaryTree.add(63);
        binaryTree.add(67);
        Assert.assertTrue(binaryTree.search(63));
        Assert.assertFalse(binaryTree.search(1));
    }

}