public class ContohSwitch {
	public static void main (String args[]) {
		char hurufAwal = 'a';
		System.out.println("Masukkan huruf awal nama Anda: ");
		try {
			hurufAwal = (char)System.in.read();
		} catch (Exception e){
			System.out.println("Salah ko menginput ceee...!");
		}
		switch(hurufAwal){
			case (char)-1 : System.out.println("bukan huruf depan !!!"); break;
			case 'a': System.out.println("apa nanmu amin?"); break;
			case 'b': System.out.println("apa nanmu bambang?"); break;
			case 'c': System.out.println("apa nanmu ceceo?"); break;
			case 'd': System.out.println("apa nanmu daud?"); break;
			case 'e': System.out.println("apa nanmu endang?"); break;
			default: System.out.println("aku tidak bisa menebak");
		}
	}
}