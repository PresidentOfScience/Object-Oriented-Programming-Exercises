import java.util.Random;
import java.util.Scanner;

public class Game {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Scissor (0), Rock (1), Paper (2): ");
		int ourChoice = scan.nextInt();
		
		Random random = new Random();
		int computerChoice = random.nextInt(3);
		
		if(ourChoice == computerChoice) {
			if(ourChoice == 0) {
				System.out.println("The computer is scissor. You are scissor too. It is a draw.");
			}
			else if(ourChoice == 1) {
				System.out.println("The computer is rock. You are rock too. It is a draw.");
			}
			else {
				System.out.println("The computer is paper. You are paper too. It is a draw.");
			}
		}
		else if(ourChoice == 0 && computerChoice == 1) {
			System.out.println("The computer is rock. You are scissor. You lose.");
		}
		else if(ourChoice == 0 && computerChoice == 2) {
			System.out.println("The computer is paper. You are scissor. You win.");
		}
		else if(ourChoice == 1 && computerChoice == 0) {
			System.out.println("The computer is scissor. You are rock. You win.");
		}
		else if(ourChoice == 1 && computerChoice == 2) {
			System.out.println("The computer is paper. You are rock. You lose.");
		}
		else if(ourChoice == 2 && computerChoice == 0) {
			System.out.println("The computer is scissor. You are paper. You lose.");
		}
		else if(ourChoice == 2 && computerChoice == 1) {
			System.out.println("The computer is rock. You are paper. You win.");
		}
		
		System.exit(0);
	}
}
