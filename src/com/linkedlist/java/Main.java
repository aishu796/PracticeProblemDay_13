package com.linkedlist.java;

public class Main {
    public static void main(String[] args) {


        LinkedList list = new LinkedList();
        Node head = list.addNode(10, null);
        list.addNode(20, head);
        list.addNode(30, head);
        list.addNode(40, head);
        list.printList(head);
    }
}