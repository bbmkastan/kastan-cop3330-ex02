package base;

import java.util.Scanner;

/*
 *  UCF COP3330 Summer 2021 Assignment 1 Solution
 *  Copyright 2021 Bao Kastan
 */

public class App {
    static Scanner in = new Scanner(System.in);

    public static void main(String[] args) {
        App myApp = new App();

        myApp.promptUser();
        String userInput = myApp.readUserInput();
        int charNum = myApp.countCharInUserInput(userInput);
        String outputString = myApp.createOutputString(userInput, charNum);
        myApp.printOutput(outputString);
    }

    public void printOutput (String outputString) {
        System.out.println(outputString);
    }

    public String createOutputString(String userInput ,int charNum) {
        return userInput + " has " + charNum + " characters.";
    }

    public int countCharInUserInput(String userInput) {
        return userInput.length();
    }

    public String readUserInput() {
        return in.nextLine();
    }

    public void promptUser () {
        System.out.println("What is the input string? ");
    }
}
