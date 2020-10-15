public class ContohIfElse {
	public static void main(String args[]) {
		char hurufAwal = 'a';
		System.out.println("Masukkan huruf awal nama Anda: ");
		try {
			hurufAwal = (char)System.in.read();
			} catch(Exception e) {
				System.out.println("Salah ko menginput cesss...!");
			}
		if (hurufAwal == 'a')
			System.out.println("apa nanamu amin?");
		else if (hurufAwal == 'b')
			System.out.println("apa namamu bambang?");
		else if (hurufAwal == 'c')
			System.out.println("apa namamu ceceo?");
		else if (hurufAwal == 'd')
			System.out.println("apa namamu daud?");
		else if (hurufAwal == 'e')
			System.out.println("apa namamu endang?");
		else
			System.out.println("aku tidak bisa menebak");	
		}
}