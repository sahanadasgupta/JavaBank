package week9_ArrayLists;
import java.util.*;
public class example3 {
    public static void main(String[] args) {
        ArrayList<String> readingList = new ArrayList<String>();
        // Add four books to the list and print it out
        readingList.add("The Great Gatsby");
        readingList.add("The Catcher in the Rye");
        readingList.add("Animal Farm");
        readingList.add("Tom Sawyer");
        System.out.println(readingList);
        {
            System.out.print("=");
        }
        System.out.println();

        readingList.add(0, "Lord of the Flies");
        System.out.println(readingList);

         // Now decide that Walden should actually be third.
         readingList.add(2, "Walden");
         System.out.println(readingList);

         // Now decide we don't actually want to read Animal Farm
         readingList.remove("Animal Farm");
         System.out.println(readingList);

         // Now decide we also want to remove the second book.
         readingList.remove(1);
         System.out.println(readingList);

         // How many books are in our reading list now?
         System.out.println("Number of books: " + readingList.size());

         // Let's get the first book
         String firstBook = readingList.get(0);
         System.out.println("First book: " + firstBook);

         // And what index is Tom Sawyer now?
         int indexOfTomSawyer = readingList.indexOf("Tom Sawyer");
         System.out.println("Tom Sawyer is at index: " + indexOfTomSawyer);
         }

private void printArrayList(ArrayList<String> list)
        {
        System.out.println("Reading List:");
        int counter = 1;
        // This uses the for each loop.
        for(String s: list)
        {
        System.out.println(counter + ": " + s);
        counter++;
        }

        for(int i = 0; i < 20; i++)
        {
        System.out.print("=");
        }
        System.out.println();
        }
        }
