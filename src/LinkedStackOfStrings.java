/**
 * Created by Pruthvi on 5/8/2017.
 */

/**
 * Stack implementation using linked lists
 * API:
 * *StackOfStrings()            ---       Create an empty stack
 * boolean isEmpty()            ---       is the stack empty
 * void push(String item)       ---       insert a string onto the stack
 * String pop()                 ---       remove and return the most recently inserted string
 */
public class LinkedStackOfStrings {
    //Instance variables
    private Node first;

    private class Node{
        String item;
        Node next;
    }

    //Constructor
    //Blank Constructor
    LinkedStackOfStrings(){
        first = new Node();
    }

    LinkedStackOfStrings(String s){
        first = new Node();
        first.item = s;
        first.next = null;
    }

    //Instance methods
    public boolean isEmpty(){
        return (first == null);
    }

    public void push(String s){
        Node old = first;
        first = new Node();
        first.next = old;
        first.item = s;
    }

    public String pop(){
        if (first==null)
            throw new RuntimeException("The Stack is empty!");
        String item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args){
        int n = Integer.parseInt(args[0]);
        String[] s = new String[n];
        for (int i =0; i<n; i++){
            s[i] = args[i+1];
            System.out.print(s[i] + " ");
        }
        System.out.println("\nStack manipulations:");
        LinkedStackOfStrings stack = new LinkedStackOfStrings();
        stack.push(s[0]);
        stack.push(s[1]);
        System.out.println(stack.pop());
        stack.push(s[2]);
        System.out.println(stack.pop());
    }
}