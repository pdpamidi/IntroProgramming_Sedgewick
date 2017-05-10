/**
 * Created by Pruthvi on 5/8/2017.
 */

/**
 * Counter Data Type that implements Comparable interface
 * API:
 * Counter(String id, int max)          ---     create a counter initialized to 0
 * void increment()                     ---     increment the counter unless its value is max
 * int value()                          ---     get the value of the counter
 * String toString()                    ---     String representation
 */
public class Counter implements Comparable<Counter> {
    private final String name;
    private final int max;
    private int count;

    public Counter(String id, int m){
        name = id;
        max = m;
    }

    public void increment(){
        if (count < max) count++;
    }

    public int value(){
        return count;
    }

    public String toString(){
        return name + ":" + count;
    }

    public int compareTo(Counter b){
        if (count < b.count) return  -1;
        else if (count > b.count) return +1;
        else return 0;
    }
}