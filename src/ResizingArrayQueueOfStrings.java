/**
 * Created by Pruthvi on 5/9/2017.
 */
/**
        * API for generic FIFO Queue using resizing array queue
        * Queue()              ---         create an empty queue
        * boolean isEmpty()    ---         is the queue empty?
        * void enqueue(Item item) ---      insert an item onto queue
        * Item deque()         ---         return and remove the item that was inserted least recently
        * int size()           ---         number of items on the queue
 **/

public class ResizingArrayQueueOfStrings {
    private String [] items = new String[1];    //String array for the queue
    private int length;                         //length of the queue


    public boolean isEmpty(){
        return length == 0;
    }

    private void resize(){
        int size = (length+1) * 2;
        String[] other = new String[size];
        for (int i=0; i<length; i++)
            other[i] = items[i];
        items = other;
    }

    public void enqueue(String string){
        if (length==items.length)
            resize();
        items[length++] = string;
    }

    public String dequeue(){
        if (isEmpty()) throw new RuntimeException("The queue is empty!");
        String item = items[0];
        for (int i=0; i<length-1; i++) {
            items[i] = items[i + 1];
        }
        length--;
        if (length <= items.length/4)
            resize();
        return item;
    }

    public int size() {
        return length;
    }

    public static void main(String [] args) {
        System.out.print("This 1 is also working!");
        System.out.println("\nResizingArrayQueueOfStrings Stack manipulations:");
        ResizingArrayQueueOfStrings stack1 = new ResizingArrayQueueOfStrings();
        stack1.enqueue("This ");
        ResizingArrayQueueOfStrings stack2 = new ResizingArrayQueueOfStrings();
        stack2.enqueue("1");
        System.out.println(stack1.dequeue());
        System.out.println(stack2.dequeue());
        stack1.enqueue(" is also");
        stack1.enqueue(" working!");
        stack1.size();
        System.out.println(stack1.dequeue());
        System.out.println(stack1.dequeue());
    }
}
