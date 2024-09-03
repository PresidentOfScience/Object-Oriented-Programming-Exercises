import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Hangman {

	public static void main(String[] args) {
		String[] words = {"tanggungan", "sepatu", "aurora", "bahagia", "mencintai"};
		char repeat;
		Scanner scan = new Scanner(System.in);
		
		do {
			Random random = new Random();
			int idx = random.nextInt(words.length);
			
			int missed = 0;
			int len = words[idx].length();
			int gameOver = words[idx].length();
			char guess;
			int[] flag = new int[26];
			Arrays.fill(flag, -1);
			
			while(gameOver != 0) {
				System.out.print("(Guess) Enter a letter in word ");
				for(int i=0; i<len; i++) {
					int mark = words[idx].charAt(i) - 'a';
					if(flag[mark] != 1) {
						System.out.print("*");
					}
					else {
						System.out.print(words[idx].charAt(i));
					}
				}
				System.out.print(" > ");
				guess = scan.nextLine().charAt(0);
				int index = guess - 'a';
				
				if(flag[index] == -1) {
					if(checkCharacter(words[idx], guess)) {
						flag[index] = 1;
						gameOver -= amountOfCharacter(words[idx], guess);
					}
					else {
						flag[index] = 0;
						System.out.println("    " + guess + " is not in the word.");
						missed++;
					}
				}
				else if(flag[index] == 1) {
					System.out.println("    " + guess + " is already in the word.");
				}
				else {
					System.out.println("    " + guess + " is not in the word.");
					missed++;
				}
			}
			
			System.out.println("The word is " + words[idx] + ". You missed " + missed + " time.");
			System.out.print("Do you want to guess another word? Enter y or n > ");
			repeat = scan.nextLine().charAt(0);
			System.out.println();
		} while(repeat == 'y');
		
		System.exit(0);
	}
	
	public static boolean checkCharacter(String word, char alphabet) {
		int len = word.length();
		for(int i=0; i<len; i++) {
			if(word.charAt(i) == alphabet) {
				return true;
			}
		}
		return false;
	}
	
	public static int amountOfCharacter(String word, char alphabet) {
		int len = word.length();
		int total = 0;
		for(int i=0; i<len; i++) {
			if(word.charAt(i) == alphabet) {
				total++;
			}
		}
		return total;
	}
}
