/**
 * Created by Pruthvi on 5/8/2017.
 */
/**
        * Stack implementation using resizeable array
        * API:
        * //*StackOfStrings()            ---     Create an empty stack///Invalid, no constructor needed
        *                                        only resize
        * boolean isEmpty()            ---       is the stack empty
        * void resize(int n)           ---       double the stack size
        * void push(String item)       ---       insert a string onto the stack
        * String pop()                 ---       remove and return the most recently inserted string
 **/
public class ResizingArrayStackOfStrings {
    private String[] items = new String[1];   //Array of Strings
    //private int size = 1;                     //Size of the Array
    private int fill = 0;                     // filled size of the Array

    public boolean isEmpty(){
        return (fill ==0);
    }

    public void resize(){
        int size = (fill+1) * 2;
        String[] other = new String[size];
        for (int i=0; i<fill; i++)
            other[i] = items[i];
        items = other;
    }

    public void push(String item){
        if (fill==items.length)
            resize();
        items[fill++] = item;
    }

    public String pop(){
        String item = items[--fill];
        if (fill <= items.length/4)
            resize();
        return item;
    }

    public static void main(String [] args){
        int n = Integer.parseInt(args[0]);
        String[] s = new String[n];
        for (int i =0; i<n; i++){
            s[i] = args[i+1];
            System.out.print(s[i] + " ");
        }
        System.out.println("\nStack manipulations:");
        ResizingArrayStackOfStrings stack = new ResizingArrayStackOfStrings();
        stack.push(s[0]);
        stack.push(s[1]);
        stack.push(s[2]);
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        stack.push(s[3]);
        System.out.println(stack.pop());
    }
}