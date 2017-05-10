/**
 * Created by Pruthvi on 5/8/2017.
 */

/**
 * API for generic FIFO Queue
 * Queue()              ---         create an empty queue
 * boolean isEmpty()    ---         is the queue empty?
 * void enqueue(Item item) ---      insert an item onto queue
 * Item deque()         ---         return and remove the item that was inserted least recently
 * int size()           ---         number of items on the queue
 */

public class Queue<Item> {
    //Instance variables
    private Node first;
    private Node last;

    //Node Inner Class
    private class Node {
        Item item;
        Node next;
    }
    //constructor
    public Queue(){
        first = null;
        last  = null;
    }
    //Instance methods
    public boolean isEmpty(){
        return (first == null);
    }

    public void enqueue(Item item){
        Node other = last;
        last = new Node();
        last.item  = item;
        last.next = null;
        if (isEmpty()) first = last;
        else other.next = last;
    }

    public Item dequeue(){
        if (isEmpty()) throw new RuntimeException("The Queue is empty!");
        Item other = first.item;
        first = first.next;
        if (isEmpty()) last = null;
        return other;
    }

    public int size(){
        int counter = 0;
        Node node = first;
        if (isEmpty()) counter=0;
        else {
            do {
                counter++;
                node = node.next;
            } while (node != last);
        }
        return counter;
    }

    public static void main(String [] args){
        System.out.print("This 1 is also working!");
        System.out.println("\nStack manipulations:");
        Queue<String> stack1 = new Queue<>();
        stack1.enqueue("This ");
        Queue<Integer> stack2 = new Queue<>();
        stack2.enqueue(1);
        System.out.println(stack1.dequeue());
        System.out.println(stack2.dequeue());
        stack1.enqueue(" is also");
        stack1.enqueue(" working!");
        stack1.size();
        System.out.println(stack1.dequeue());
        System.out.println(stack1.dequeue());
        Queue<String> stack3 = new Queue<>();
        System.out.println(" stack3 size (0): " + stack3.size());
    }
}