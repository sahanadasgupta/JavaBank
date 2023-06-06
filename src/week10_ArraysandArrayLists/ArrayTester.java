package week10_ArraysandArrayLists;

public class ArrayTester {
    public static void main(String[] args) {
        ExpandingArray arr = new ExpandingArray();
        for(int i = 0; i < 100; i++)
        {
            System.out.println("adding " + i);
            arr.add(i); }
        for(int i = 0; i < 100; i++)
        {
            System.out.println(arr.get(i));
            }
        }
    }

