import java.util.Random;
import java.util.Scanner;
public class Week1_D1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] moves = {"Rock", "Paper", "Scissors"};
        Random rand = new Random();
        int rounds = 5;
        String[] playerMoves = new String[rounds];
        String[] computerMoves = new String[rounds];
        String[] results = new String[rounds];
        int wins = 0, losses = 0, draws = 0;
        for (int i = 0; i < rounds; i++) {
            System.out.println("Enter your move for round " + (i + 1) + " (Rock/Paper/Scissors):");
            String playerMove = sc.nextLine();
            String computerMove = moves[rand.nextInt(3)];
            String result = playRound(playerMove, computerMove);
            playerMoves[i] = playerMove;
            computerMoves[i] = computerMove;
            results[i] = result;
            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }
        System.out.println("\nRound | Player Move | Computer Move | Result");
        for (int i = 0; i < rounds; i++) {
            System.out.println((i + 1) + " | " + playerMoves[i] + " | " + computerMoves[i] + " | " + results[i]);
        }
        double winPercent = (wins * 100.0) / rounds;
        System.out.println("\nWins: " + wins + " | Losses: " + losses + " | Draws: " + draws + " | Win % = " + winPercent + "%");
        sc.close();
    }
    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }
        if (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) {
            return "Player Wins";
        } else if (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) {
            return "Player Wins";
        } else if (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper")) {
            return "Player Wins";
        } else {
            return "Computer Wins";
        }
    }
}

