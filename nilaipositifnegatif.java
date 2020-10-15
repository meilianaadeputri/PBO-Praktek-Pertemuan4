import java.util.Scanner;
public class nilaipositifnegatif{
	public static void main (String[] args){
		Scanner input = new Scanner(System.in);
		System.out.println("Masukkan nilai: ");
		int nilai = input.nextInt();
		if(nilai<0){
			System.out.println("Angka yang anda masukkan negatif");
		} else
			System.out.println("Angka yang anda masukkan positif");
	}
}