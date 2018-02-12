package com.example.java;
import java.util.Scanner;

/** This program will create a simple, 5 question, fill in the blank quiz. Use the equalsIgnoreCase method to determine
 *  if the user provides the correct answer. Tell them if they got the answer right or not. At the end of the quiz,
 *  tell them how many questions that they got right.
 */
public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); //create scanner for user input
        int user_score = 0;  //creating variable to represent the users score


        String[] Questions = {"Water is referred to as the _______ Solvent.", "_______ Is the furthest planet away from" +
                " earth in our Solar System.", "________ is the study of life.", "Aeronautics is the science of flight" +
                " through air, whereas ______________ is the science of flight through space.", "_______ covers 71 " +
                "percent of the Earth's surface."};

        String[] Answers = {"Universal", "Neptune", "Biology", "Astronautics", "Water"};

        // Created the parallel strings, now informing user what the program is going to do:

        System.out.println("Welcome to the quiz");
        System.out.println("There will be 5 questions, each being worth one point.");
        System.out.println("Fill in the blank:  ");
        System.out.println();
        System.out.println();
        System.out.println();

        //Creating for loop that will control the game.

        for (int i = 0; i < Questions.length; i++) { // loop runs until all strings in the "Question" array are printed
            System.out.println("Question " + (i + 1)); // notify user what question they are on.
            System.out.println();
            System.out.println(Questions[i]);
            System.out.println();
            System.out.println("Please enter your answer: "); // User must enter a value for the loop to restart.
            String user_answer = scanner.nextLine();

            if (user_answer.equalsIgnoreCase(Answers[i])) {  // if the user answer matches the one in the array
                System.out.println("Correct! You have received one point");
                System.out.println();
                System.out.println();
                user_score += 1;
                // adds one to score and notifies user they were correct
            } else {
                System.out.println("Incorrect! You have received zero points");
                System.out.println();
                System.out.println();
            }

        }

        System.out.println();
        System.out.println();
        System.out.println("The Game is Over!");
        System.out.println("You answered " + user_score + " out of 5 correct!");
        System.out.println("Meaning you finished with " + user_score + " point(s)!");

    }
}
