package com.bl.linkedlist;

public class MyLinkedList {
    public INode head;
    public INode tail;
    public static int count;

    public void displayMessage() {
        System.out.println("Welcome to Data Structures");
    }

    public static int getCount() {
        return count;
    }

    public MyLinkedList() {
        this.head = null;
        this.tail = null;
        count = 0;
    }
//Method to add elements from front

    public void add(INode newNode) {
        count++;
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //Method to add elements from the back
    public void insert(INode newNode) {
        count++;
        if (this.tail == null) {
            this.tail = newNode;
        }

        if (this.head == null) {
            this.head = newNode;
        } else {
            INode tempNode = this.head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }

            tempNode.setNext(newNode);
            this.tail = newNode;

        }
    }

    //Method to insert after a specified element
    public void insertAfter(INode destNode, INode newNode) {
        count++;
        INode tempNode = this.head;
        while (!tempNode.getKey().equals(destNode.getKey())) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
    }

    //Method to pop first element
    public INode pop() {
        count--;
        INode tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    //Method to pop last element
    public INode popLast() throws NullPointerException {
        count--;
        if (this.head == null)
            return null;
        if (this.head.getNext().equals(null))
            return null;
        else {
            INode tempNode = head;
            while (!tempNode.getNext().equals(tail)) {
                tempNode = tempNode.getNext();
            }
            INode tempNode1 = tempNode.getNext();
            tempNode.setNext(null);
            return tempNode1;
        }
    }
//Method To Search For a Specific Node
    public INode search(INode element) {
        if (this.head.equals(element))
            return this.head;

        INode tempNode = head;
        while (tempNode != null) {
            tempNode = tempNode.getNext();
            if (tempNode.equals(element))
                return tempNode;
        }
        return null;
    }

    public INode deleteAtIndex(INode element) {
        count--;
        if (head.equals(element)) {
            INode del = head;
            head = head.getNext();
            return del;
        }
        INode deletedElement = head;
        while (!deletedElement.getNext().equals(element)) {
            deletedElement = deletedElement.getNext();
        }
        INode tempNode = deletedElement.getNext();
        deletedElement.setNext(deletedElement.getNext().getNext());
        return tempNode;
    }

    public void addSorted(INode newNode) {
        count++;
        INode currentNode = this.head;
        INode prevNode = null;
        while (currentNode != null && (int) newNode.getKey() > (int) currentNode.getKey()) {
            prevNode = currentNode;
            currentNode = currentNode.getNext();

        }
        if (prevNode == null) {
            this.head = newNode;
        } else {
            prevNode.setNext(newNode);
        }
        newNode.setNext(currentNode);

    }


    public void printLinkedList() {
        StringBuffer myNodes = new StringBuffer("My Nodes: ");
        INode tempNode = head;
        while (tempNode.getNext() != null) {
            myNodes.append(tempNode.getKey());
            if (!tempNode.getNext().equals(null))

                myNodes.append("->");
            tempNode = tempNode.getNext();

        }
        myNodes.append(tempNode.getKey());
        System.out.println(myNodes);

    }
}
