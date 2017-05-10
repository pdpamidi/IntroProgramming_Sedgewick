/**
 * Created by Pruthvi on 5/8/2017.
 */

/**
 * Stack implementation based on Linked Lists that can store
 * collections of generic types
 * API same as general stack.
 */
public class GenericStack<Item> {
    private  Node first;


    //Implement node first
    private class Node{
        Item item;
        Node next;
    }
    //Instance methods
    public boolean isEmpty(){
        return (first==null);
    }

    public void push(Item item){
        Node oldfirst = first;
        first = new Node();
        first.item = item;
        first.next = oldfirst;
    }

    public Item pop(){
        if (first == null)
            throw new RuntimeException("The stack is empty!");
        Item item = first.item;
        first = first.next;
        return item;
    }

    public static void main(String[] args){
        System.out.print("This 1 is also working!");
        System.out.println("\nStack manipulations:");
        GenericStack<String> stack1 = new GenericStack<>();
        stack1.push("This ");
        GenericStack<Integer> stack2 = new GenericStack<>();
        stack2.push(1);
        System.out.println(stack1.pop());
        System.out.println(stack2.pop());
        stack1.push(" is also");
        stack1.push(" working!");
        System.out.println(stack1.pop());
        System.out.println(stack1.pop());
    }
}
