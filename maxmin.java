import java.util.Scanner;
public class maxmin {
	public static void main (String args[]) {
		Scanner input = new Scanner(System.in);
		int max = 1;
		int min = 1;
		for (int i=1; i<=5; i++) {
			System.out.print("Masukkan nilai " + i + " : ");
			int nilai = input.nextInt();
			if (nilai<= min) {
				min = nilai;
			}
			if (nilai>= max) {
				max = nilai;
			}
		}
		System.out.println("Max: " + max);
		System.out.println("Min: " + min);
	}
}