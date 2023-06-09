// You have to return which player won! In case of a draw return Draw!

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class RockPaperScisssors {

    public static void main (String[] args) {
        // get input and create instance of the class in main method

        try (Scanner scanner = new Scanner(System.in)) {
            System.out.print("Enter the first option: ");
            String user1 = scanner.nextLine();
            System.out.print("Enter the second option: ");
            String user2 = scanner.nextLine();
            RockPaperScisssors firstGame = new RockPaperScisssors();
            System.out.println(firstGame.findWinner(user1, user2));
        } 
    }

    public String findWinner(String user1, String user2) {
        List<String> valid_options = Arrays.asList( "rock", "paper", "scissors");

        //check values and return either invalid input or draw or winner
        if(!valid_options.contains(user1) || !valid_options.contains(user2)) {
            return "Invalid input";
        } else if(user1.equals(user2)) {
            return "Draw";
        } else if (user1.equals("rock")) {
            if (user2.equals("paper")) {
                return user2;
            } else {
                return user1;
            }
        } else if (user1.equals("paper")) {
            if (user2.equals("scissors")) {
                return user2;
            } else {
                return user1;
            }
        } else if (user1.equals("scissors")) {
            if (user2.equals("rock")) {
                return user2;
            } else {
                return user1;
            }
        }
        return "Unknown result";
    }

    // using ternary operator and concatenation
    public static String rps(String p1, String p2) {
        if(p1.equals(p2)) return "Draw!";
        int p = (p1 + p2).equals("rockscissors") || (p1 + p2).equals("paperrock") || (p1 + p2).equals("scissorspaper") ? 1 : 2;
        return "Player " + p + " won!";
    }

    //using logical and operator
    public static String rpsGame(String p1, String p2) {
        if (p1 == p2) {
            return "Draw!";
        } else if (p1.equals("rock") && p2.equals("scisssors")) {
            return "Player 1 won";
        } else if (p1.equals("paper") && p2.equals("rock")) {
            return "Player 1 won";
        } else if(p1.equals("scissors") && p2.equals("paper")) {
            return "Player 1 won";
        } else {
            return "Player 2 won";
        }
    }

    // using switch case
    public static String rpsGame2(String p1, String p2) {
        switch(p1) {
            case "rock":
                return (p1 == p2) ? "Draw!" : (p2 == "scissors" ? "Player 1 won": "Player 2 won");
            case "paper":
                return (p1 == p2) ? "Draw!" : (p2 == "rock" ? "Player 1 won": "Player 2 won");
            case "scissors":
                return (p1 == p2) ? "Draw!" : (p2 == "paper" ? "Player 1 won": "Player 2 won");
            default:
                return "Invalid input";
        }
    }

    // using hashmap
    public static String rpsGame3 (String p1, String p2) {
        if (p1.equals(p2)) return "Draw!";
        
        Map<String, String> game = new HashMap<>();
        game.put("scissors", "paper");
        game.put("paper", "rock");
        game.put("rock", "scissors");

        String result = game.get(p1);
        if (result.equals(p2)) return "Player 1 won!";
        else                   return "Player 2 won!";
    }
}
