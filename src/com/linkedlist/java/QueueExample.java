package com.linkedlist.java;

import java.util.LinkedList;
import java.util.Queue;

public class QueueExample
{
    public static void main(String[] args) {

            Queue<String> queue =new LinkedList();
            queue.add("Aishu");
            queue.add("Akshu");
            queue.add("Ankita");

            System.out.println(queue);

            queue.remove();
            System.out.println("After removing the queue values are :"+queue);

            System.out.println("Top element in queue : "+queue.peek());

            boolean isemptyornot = queue.isEmpty();
            System.out.println("Queue elemets empty: "+isemptyornot);

            System.out.println("Size of the queue " + queue.size());
        }


    }


