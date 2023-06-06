package week8_Arrays;

public class exercise1 {
    public static void main(String[] args) {
        int[] array = {34, 35, 69, 83, 42, 26};
        for(int i = 0; i < array.length; i++){
            System.out.println(array[i]);}

        int[] array2 = array;
        array[0] = 103;
        System.out.println("The first element of array 2 is: " + array2[0]);
        }
    }

