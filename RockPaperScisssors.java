// You have to return which player won! In case of a draw return Draw!

import java.util.Arrays;
import java.util.List;
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
}
