package week8_Arrays;

public class OddNum {
    public static void main(String[] args) {
        int Array[] = {7, 8, 9, 10, 11, 12};
        System.out.println("The odd elements of the array are: ");
        System.out.println(Array);
    }

        public static void getOddNum (int[] Array){
            for (int i = 0; i < Array.length; i++) {
                if (i / 2 != 0)
                    System.out.println(i);
            }
        }
    }



