package com.company;
import java.util.Scanner;
import java.util.Random;
public class RockPaperScissor {
    public static void main(String[] args) {
//        create a rock paper scissor using conditional statement
//        0 - rock
//        1 - scissor
//        2 - paper

        Scanner s = new Scanner(System.in);
        System.out.println("Enter 0 for Rock ,1 for Scissor ,and 2 for Paper");
        int input = s.nextInt();
        Random r = new Random();
        int ran = r.nextInt(3);

        if(input == ran){
            System.out.println("Draw");
        }
        else if(input==0 && ran==1 || input==1 && ran==2 || input==2&& ran==0){
            System.out.println("YOU WIN");

        }
        else
        {
            System.out.println("Computer Win");
        }

        if(ran==0){
            System.out.println("computer chose rock");
        }
        else if(ran==1){
            System.out.println("computer chose scissor");

        }
        else if(ran==2){
            System.out.println("computer chose paper");

        }
    }
}
