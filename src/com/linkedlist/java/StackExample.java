package com.linkedlist.java;
import java.util.Stack;

public class StackExample
{
    public static void main(String[] args) {
            Stack<Integer> stack =new Stack();
            stack.push(10);
            stack.push(20);
            stack.push(30);
            stack.push(40);
            stack.push(50);

            System.out.println(stack);

            stack.pop();
            System.out.println("after pop the values"+stack);

            int topelement=stack.peek();
            System.out.println("top values"+topelement);

            boolean isempty=stack.isEmpty();
            System.out.println(isempty);

            System.out.println("stack size is:"+stack.size());

        }
    }


