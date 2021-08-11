package com.company;
import java.util.Random;
import java.util.Scanner;
class Game {
    public int num;
    public int guess = 0;
    public int input;

    public int getGuess() {
        return guess;
    }

    public void setGuess(int guess) {
        this.guess = guess;
    }

    Game() {
        Random r = new Random();
        this.num = r.nextInt(100);
    }

    void takeUserInput() {
        System.out.println("Guess The Number");
        Scanner s = new Scanner(System.in);
        input = s.nextInt();
    }

    boolean isCorrectN() {
        guess++;
        if (input == num) {
            System.out.format("You guessed it right,\n It was %d and you guessed it in %d attempts", num, guess);
            return true;
        } else if (input < num) {
            System.out.println("Guess higher number");
        } else if (input > num) {
            System.out.println("Guess lower number");
        }
        return false;
    }
}
public class GuessTheNumber {
    public static void main(String[] args) {
        Game g = new Game();
        boolean b = false;
        while(!b){
            g.takeUserInput();
            b = g.isCorrectN();
        }

    }
   /* Create a class Game, which allows a user to play "Guess the Number"
    game once. Game should have the following methods:
            1. Constructor to generate the random number
            2. takeUserInput() to take a user input of number
            3. isCorrectNumber() to detect whether the number entered by the user is true
            4. getter and setter for noOfGuesses
    Use properties such as noOfGuesses(int), etc to get this task done!*/

}
