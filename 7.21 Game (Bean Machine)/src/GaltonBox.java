import java.util.Arrays;
import java.util.Scanner;

public class GaltonBox {

	public static void main(String[] args) {
		int ball;
		int slotNum;
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter the number of balls to drop: ");
		ball = scan.nextInt();
		System.out.print("Enter the number of slots in the bean machine: ");
		slotNum = scan.nextInt();
		System.out.println();
		scan.nextLine();
		
		int[] slots = new int[slotNum];
		String[] pattern = new String[ball];
		Arrays.fill(slots, 0);
		
		for(int i=0; i<ball; i++) {
			int destination = 0;
			pattern[i] = scan.nextLine();
			int len = pattern[i].length();
			for(int j=0; j<len; j++) {
				if(pattern[i].charAt(j) == 'R') {
					destination++;
				}
			}
			slots[destination]++;
		}
		System.out.println();
		
		int maxVal = maxValue(slots);
		for(int i=maxVal; i>0; i--) {
			for(int j=0; j<slotNum; j++) {
				if(slots[j] > 0 && slots[j] == i) {
					System.out.print("O");
					slots[j]--;
				}
				else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
	}
	
	public static int maxValue(int[] slots) {
		int max = 0;
		int len = slots.length;
		for(int i=0; i<len; i++) {
			if(slots[i] > max) {
				max = slots[i];
			}
		}
		return max;
	}
}
