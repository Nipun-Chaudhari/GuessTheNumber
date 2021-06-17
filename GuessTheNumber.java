package com.company;
import java.util.Random;
import java.util.Scanner;

class Game{
    public int noOFGuesses = 0;
    public int userInput;
    public int compNum;
    public boolean isCorrectNo = false;

            public void takeUserInput () {
            System.out.println("Enter your guess");
            Scanner S = new Scanner(System.in);
            userInput = S.nextInt();
            noOFGuesses ++;
            
            if (noOFGuesses == 10){
                System.out.println("Guess limit exceeded \n ;_; \n YOU LOST");
                exit();
            }

        }
    
    // to generate random number in range 0 to 100

        public  Game () {
            Random rn = new Random();
            compNum = rn.nextInt(100);
            //return compNum;
        }

        void isCorrectNumber(){
                if(userInput == compNum){
                    isCorrectNo = true;
                }
                else if(userInput > compNum){
                    System.out.println("HINT : Guess a smaller number");
                }
                else if (userInput < compNum) {
                    System.out.println("HINT : Guess a larger number");
                }
        }

        void getNumOfGuesses(){
            int n = noOFGuesses;
            int score = 10 - n;
            System.out.println("!!!YAY!!! \n You got it \n Your score is:"+score);
        }
}

public class GuessTheNumber {
    public static void main(String[] args) {
       Game gm = new Game();
       while (gm.isCorrectNo == false){
           gm.takeUserInput();
           gm.isCorrectNumber();
       }
       gm.getNumOfGuesses();
    }
}
