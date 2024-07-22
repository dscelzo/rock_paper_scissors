package com.codedotorg;

import java.util.Random;

public class GameLogic {

    /** Whether or not the game is over */
    private boolean gameOver;

    /**
     * Constructor for the GameLogic class.
     * Initializes the gameOver variable to false.
     */
    public GameLogic() {
        gameOver = false;
    }

    /**
     * Returns a random choice of "rock", "paper", or
     * "scissors" for the computer player.
     * 
     * @return a String representing the computer's choice
     */
    public String getComputerChoice() {
        String[] choices = {"rock", "paper", "scissors"};
        Random random = new Random();
        int index = random.nextInt(choices.length);
        return "Computer choice: " + choices[index];
    }

    /**
     * Determines the winner of a rock-paper-scissors game based on the user's predicted class and the computer's choice.
     * @param predictedClass The user's predicted class.
     * @param computerChoice The computer's choice.
     * @return A string containing the computer choice, user choice, and the result of the game.
     */
    public String determineWinner(String predictedClass, String computerChoice) {
        if (predictedClass.equals(computerChoice)) {
            return getTieResult();
        } else if (predictedClass.equals("rock")) {
            if (computerChoice.equals("paper")) {
                return getComputerWinnerResult();
            } else {
                return getUserWinnerResult();
            }
        } else if (predictedClass.equals("paper")) {
            if (computerChoice.equals("scissors")) {
                return getComputerWinnerResult();
            } else {
                return getUserWinnerResult();
            }
        } else {
            if (computerChoice.equals("rock")) {
                return getComputerWinnerResult();
            } else {
                return getUserWinnerResult();
            }
        }
        
       // return "Computer choose: " + computerChoice;
    }

    /**
     * Sets the game over flag to true and returns a
     * string indicating a tie result.
     * 
     * @return A string indicating a tie result.
     */
    public String getTieResult() {
        gameOver = true;
        return "Game Results: It's a tie!";
    }

    /**
     * Sets the game over flag to true and returns a string
     * indicating that the user has won.
     * 
     * @return a string indicating that the user has won
     */
    public String getUserWinnerResult() {
        gameOver = true;
        return "Game Result: User wins!";
    }

    /**
     * Sets the game over flag to true and returns a string
     * indicating that the computer has won.
     * 
     * @return A string indicating that the player has lost.
     */
    public String getComputerWinnerResult() {
        gameOver = true; 
        return "Game Result: Computer wins!";
    }

    /**
     * Returns whether the game is over or not.
     * 
     * @return true if the game is over, false otherwise.
     */
    public boolean isGameOver() {
        return gameOver;
    }

    /**
     * Resets the game logic by setting the gameOver flag to false.
     */
    public void resetLogic() {
        gameOver = false;
    }

}

