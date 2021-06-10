package com.codegym;

public class TennisGame {
    static String score = "";

    public static void equalScore(int playerOneScore) {
        switch (playerOneScore) {
            case 0 -> score = "Love-All";
            case 1 -> score = "Fifteen-All";
            case 2 -> score = "Thirty-All";
            case 3 -> score = "Forty-All";
            default -> score = "Deuce";
        }
    }

    public static void fourOrMorePoint(int playerOneScore, int playerTwoScore) {
        int minusResult = playerOneScore - playerTwoScore;
        if (minusResult == 1) score = "Advantage player1";
        else if (minusResult == -1) score = "Advantage player2";
        else if (minusResult >= 2) score = "Win for player1";
        else score = "Win for player2";
    }

    public static void calculatePoint(int playerOneScore, int playerTwoScore) {
        int tempScore = Math.max(playerOneScore, playerTwoScore);
        switch (tempScore) {
            case 0 -> score += "Love";

            case 1 -> score += "Fifteen";

            case 2 -> score += "Thirty";

            case 3 -> score += "Forty";

        }
    }

    public static String getScore(int playerOneScore, int playerTwoScore) {

        if (playerOneScore == playerTwoScore) {
            equalScore(playerOneScore);
        } else if (playerOneScore >= 4 || playerTwoScore >= 4) {
            fourOrMorePoint(playerOneScore, playerTwoScore);
        } else {
            calculatePoint(playerOneScore, playerTwoScore);
        }
        return score;
    }
}