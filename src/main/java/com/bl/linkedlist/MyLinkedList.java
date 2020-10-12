package com.bl.linkedlist;

public class MyLinkedList<K> {
    public INode<K> head;
    public INode<K> tail;
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

    public void add(INode<K> newNode) {
        count++;
        if (this.tail == null) {
            this.tail = newNode;
        }
        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            this.head = newNode;
            this.head.setNext(tempNode);
        }
    }

    //Method to add elements from the back
    public void insert(INode<K> newNode) {
        count++;
        if (this.tail == null) {
            this.tail = newNode;
        }

        if (this.head == null) {
            this.head = newNode;
        } else {
            INode<K> tempNode = this.head;
            while (tempNode.getNext() != null) {
                tempNode = tempNode.getNext();
            }

            tempNode.setNext(newNode);
            this.tail = newNode;

        }
    }


    //Method to insert after a specified element
    public void insertAfter(INode<K> destNode, INode<K> newNode) {
        count++;
        INode<K> tempNode = this.head;
        while (!tempNode.getKey().equals(destNode.getKey())) {
            tempNode = tempNode.getNext();
        }
        newNode.setNext(tempNode.getNext());
        tempNode.setNext(newNode);
    }

    //Method to pop first element
    public INode<K> pop() {
        count--;
        INode<K> tempNode = this.head;
        this.head = head.getNext();
        return tempNode;
    }

    //Method to pop last element
    public INode<K> popLast() throws NullPointerException {
        count--;
        if (this.head == null)
            return null;
        else {
            INode<K> tempNode = head;
            while (!tempNode.getNext().equals(tail)) {
                tempNode = tempNode.getNext();
            }
            INode<K> tempNode1 = tempNode.getNext();
            tempNode.setNext(null);
            return tempNode1;
        }
    }
//Method To Search For a Specific Node
    public INode<K> search(INode<K> element) {
        if (this.head.equals(element))
            return this.head;

        INode<K> tempNode = head;
        while (tempNode != null) {
            tempNode = tempNode.getNext();
            if (tempNode.equals(element))
                return tempNode;
        }
        return null;
    }
    //Method To Search For a Specific Node By Key
    public INode<K> search(K key) {
       if(head==null)
           return null;

        INode<K> tempNode = this.head;
        while (tempNode != null) {
            if (tempNode.getKey().equals(key))
                return tempNode;
            tempNode =tempNode.getNext();
        }
        return null;
    }
//Method to delete at a specific index
    public INode<K> deleteAtIndex(INode<K> element) {
        count--;
        if (head.equals(element)) {
            INode<K> del = head;
            head = head.getNext();
            return del;
        }
        INode<K> deletedElement = head;
        while (!deletedElement.getNext().equals(element)) {
            deletedElement = deletedElement.getNext();
        }
        INode<K> tempNode = deletedElement.getNext();
        deletedElement.setNext(deletedElement.getNext().getNext());
        return tempNode;
    }

    public INode<K> deleteAtIndex(K key) {
        count--;
        if(head==null)
            return null;
        if (head.getKey().equals(key)) {
            INode<K> del = head;
            head = head.getNext();
            return del;
        }
        INode<K> deletedElement = head;
        while (!deletedElement.getNext().getKey().equals(key)) {
            deletedElement = deletedElement.getNext();
        }
        INode<K> tempNode = deletedElement.getNext();
        deletedElement.setNext(deletedElement.getNext().getNext());
        return tempNode;
    }
//Method to create sorted linked list
    public void addSorted(INode<K> newNode) {
        count++;
        INode<K> currentNode = this.head;
        INode<K> prevNode = null;
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
        INode<K> tempNode = head;
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

