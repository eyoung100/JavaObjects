package com.carterswebs.hangman;

/**
 * Created by ecyoung on 6/5/2016.
 * Main Loop creates console based
 * Runnable Objects for Hangman
 * game.  Removing this and placing
 * connected classes will allow
 * running on other platforms.
 */

public class Hangman {

    public static void main(String[] args) {
        // Enter amazing code here:
        if (args.length == 0) {
            System.out.println("Please enter a word when starting the program.");
            System.exit(1);
        }
        Game game = new Game(args[0]);
        Prompter prompter = new Prompter(game);
        prompter.play();
    }
}