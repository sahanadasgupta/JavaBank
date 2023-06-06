package week2;
import week2.Randomizer;
import java.util.Scanner;
public class RPS_MethodOverload {
        private String user;
        private int computer;
        private String winner;
        private String scissors = "scissors";
        private String user_Player = "User wins!";
        private String computer_Player = "Computer wins.";
        private String tie = "Tie";

        public String winner (){
            System.out.println(computer);
            if (computer == 1 && user.equals("rock")){
                System.out.println("Computer played " + computer);
                System.out.println(tie);}
            else if (computer == 1 && user.equals("paper")){
                System.out.println("Computer played " + computer);
                System.out.println(user_Player);}
            else if (computer == 1 && user.equals("scissors")){
                System.out.println("Computer played " + computer);
                System.out.println(computer_Player);}
            else if (computer == 2 && user.equals("rock")){
                System.out.println("Computer played " + computer);
                System.out.println(computer_Player);}
            else if (computer == 2 && user.equals("paper")){
                System.out.println("Computer played " + computer);
                System.out.println(tie);}
            else if (computer == 2 && user.equals("scissors")){
                System.out.println("Computer played " + computer);
                System.out.println(user_Player);}
            else if (computer == 3 && user.equals("rock")){
                System.out.println("Computer played " + computer);
                System.out.println(user_Player);}
            else if (computer == 3 && user.equals("paper")){
                System.out.println("Computer played " + computer);
                System.out.println(computer_Player);}
            else if (computer == 3 && user.equals("scissors")){
                System.out.println("Computer played " + computer);
                System.out.println(tie);}
            else
                System.out.println("Invalid input.");
            return winner;}

    // 1 = rock; 2 = paper; 3 = scissors

        public  int nextInt(){
             computer = Randomizer.getInstance().nextInt();
             System.out.println(computer);
            return computer;
        }
        public  int nextInt(int n){
             computer = Randomizer.getInstance().nextInt(n);
            return computer;
        }
        /* Return a number between min and max, inclusive. */
        public  int nextInt(int min, int max){
             computer = min + Randomizer.nextInt(max - min + 1);
            return computer;
        }
        public String user (){
            Scanner input = new Scanner(System.in);
            System.out.println("Let's play rock paper scissors!");
            System.out.println("Computer chooses between 1, 2, and 3. 1 is rock, 2 is paper, and 3 is scissors.");
            System.out.println("Choose either rock, paper, or scissors: ");
            user = input.nextLine();
            return user;}
    }


