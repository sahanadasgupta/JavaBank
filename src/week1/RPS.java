package week1;
import week2.Randomizer;

import java.util.Scanner;
public class RPS {
    private String user;
    private int computer;
    private String winner;
    private String scissors = "scissors";
    private String user_Player = "User wins!";
    private String computer_Player = "Computer wins.";
    private String tie = "Tie";

    public String winner (){
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

    public int computer (){
        // 1 = rock; 2 = paper; 3 = scissors
        int min, max;
        min = 1;
        max = 3;
        computer = (int)(Math.random() * (max - min + 1) + min);
        return computer;}

    public String user (){
        Scanner input = new Scanner(System.in);
        System.out.println("Let's play rock paper scissors!");
        System.out.println("Computer chooses between 1, 2, and 3. 1 is rock, 2 is paper, and 3 is scissors.");
        System.out.println("Choose either rock, paper, or scissors: ");
         user = input.nextLine();
        return user;}
    }

