import java.util.Scanner;
public class prak2Lat1 {
 	public static void main(String[] args) {
 		 Scanner input = new Scanner(System.in);
 		 int pilihan;
 		 boolean loop = true;
  
 		 System.out.println("Menu pilihan:");
 		 System.out.println("1. Nasi goreng ayam");
  		 System.out.println("2. Nasi goreng seafood");
 		 System.out.println("3. Soto ayam");
 		 System.out.println("4. Jus jeruk");
  		 System.out.println("Pilihan:");
 		 pilihan = input.nextInt();
  
 		 while(loop) {
 	 	 switch(pilihan){
   		 case 1:
    		 System.out.println("Anda memilih Nasi goreng ayam");
    		 loop = false;
    		 break;
   		 case 2:
    		 System.out.println("Anda memilih Nasi goreng seafood");
    		 loop = false;
    		 break;
   		 case 3:
    		 System.out.println("Anda memilih Soto ayam");
    		 loop = false;
    		 break;
   		 case 4:
   			 System.out.println("Anda memilih Jus jeruk");
    		 loop = false;
    		 break;
   		 default:
    		 System.out.println("Silahkan pilih menu 1-4");
   }
  }
  
 		 System.out.println("Pesanan anda akan diantar sebentar lagi");
 }
}