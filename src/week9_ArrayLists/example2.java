package week9_ArrayLists;
import java.util.*;
public class example2 {
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        for(int i = 0; i < 100; i ++) {
            numbers.add(i);}
        // Print out the size of the ArrayList.
        System.out.println(numbers.size());
    }
}
