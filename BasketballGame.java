package basketballGame;
import javax.swing.JOptionPane;
import java.util.Random;
public class BasketballGame {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		   Player player = new Player(JOptionPane.showInputDialog("What is your name?"));
	        Player opponent = new Player("Opponent");

	        // training
	        while (true) {
	            String[] options = {"Shooting", "Dribbling", "Passing", "Rest"};
	            int choice = JOptionPane.showOptionDialog(null, "What do you want to practice?", "Training", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
	            if (choice == 3) {
	                break;
	            }
	            switch (choice) {
	                case 0:
	                    player.practiceShooting();
	                    break;
	                case 1:
	                    player.practiceDribbling();
	                    break;
	                case 2:
	                    player.practicePassing();
	                    break;
	            }
	            JOptionPane.showMessageDialog(null, "Shooting: " + player.getShooting() + "\nDribbling: " + player.getDribbling() + "\nPassing: " + player.getPassing() + "\nFatigue: " + player.getFatigue());
	        }

	        // game
	        Random rng = new Random();
	        int score = 0;
	        int opponentScore = 0;
	        while (true) {
	            String[] options = {"Shoot", "Dribble", "Pass", "End Game"};
	            int choice = JOptionPane.showOptionDialog(null, "What do you want to do?", "Game", JOptionPane.DEFAULT_OPTION, JOptionPane.PLAIN_MESSAGE, null, options, options[0]);
	            if (choice == 3) {
	                break;
	            }
	            switch (choice) {
	                case 0:
	                    if (rng.nextInt(100) < player.getShooting()) {
	                        score++;
	                        System.out.println(player.getName() + " scores! Current score is " + score + ":" + opponentScore);
	                        JOptionPane.showMessageDialog(null, "Score! Your current score is " + score + ":" + opponentScore);
	                    } else {
	                        System.out.println(player.getName() + " missed! Current score is " + score + ":" + opponentScore);
	                        JOptionPane.showMessageDialog(null, "Missed! Your current score is " + score + ":" + opponentScore);
	                    }
	                    if (rng.nextInt(100) < opponent.getShooting()) {
	                        opponentScore++;
	                        System.out.println(opponent.getName() + " scores! Current score is " + score + ":" + opponentScore);
	                        JOptionPane.showMessageDialog(null, opponent.getName() + " scores! Current score is " + score + ":" + opponentScore);
	                    }
	                    break;
	                case 1: if (rng.nextInt(100) < player.getDribbling()) {
                        System.out.println(player.getName() + " successfully dribbled past the defender!");
                        JOptionPane.showMessageDialog(null, "You successfully dribbled past the defender!");
                    } else {
                        System.out.println(player.getName() + " lost the ball!");
                        JOptionPane.showMessageDialog(null, "You lost the ball!");
                    }
                    if (rng.nextInt(100) < opponent.getShooting()) {
                        opponentScore++;
                        System.out.println(opponent.getName() + " scores! Current score is " + score + ":" + opponentScore);
                        JOptionPane.showMessageDialog(null, opponent.getName() + " scores! Current score is " + score + ":" + opponentScore);
                    }
                    break;
                case 2:
                    if (rng.nextInt(100) < player.getPassing()) {
                        System.out.println(player.getName() + " successfully passed the ball!");
                        JOptionPane.showMessageDialog(null, "You successfully passed the ball!");
                    } else {
                        System.out.println(player.getName() + " the ball was intercepted!");
                        JOptionPane.showMessageDialog(null, "The ball was intercepted!");
                    }
                    if (rng.nextInt(100) < opponent.getShooting()) {
                        opponentScore++;
                        System.out.println(opponent.getName() + " scores! Current score is " + score + ":" + opponentScore);
                        JOptionPane.showMessageDialog(null, opponent.getName() + " scores! Current score is " + score + ":" + opponentScore);
                    }
                    break;
            }
        }
        JOptionPane.showMessageDialog(null, "The final score is " + score + ":" + opponentScore);
    }
}