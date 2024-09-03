
public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("The perfect numbers are:");
		for(int i=1; i<10000; i++) {
			int compare = 0;
			for(int j=1; j*j<=i; j++) {
				if(i % j == 0 && i != j) {
					compare += j;
					if(i/j != i && i/j != j) {
						compare += (i/j);
					}
				}
			}
			if(compare == i) {
				System.out.println(i);
			}
		}
	}
}
