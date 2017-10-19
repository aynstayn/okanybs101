package ybsA;
import java.util.Scanner;
public class cikarmasorusu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num1, num2, count;
		int girilensonuc, dogrucevapsayaci;
		
		// rastgele random iki sayý yarat
		 num1 = (int) (Math.random() * 10);
		 num2 = (int) (Math.random() * 10);
		 
		 // kullanicidan iki sayi göster ve toplamýný gir
		 
		 System.out.println("sayilar " + num1 + num2);
		 System.out.println("cikartma sonucunu yaziniz ");
		 Scanner input = new Scanner (System.in);
		 girilensonuc = input.nextInt();
		 count = 0;
		 dogrucevapsayaci = 0;
		 while (count < 5){
			// rastgele random iki sayý yarat
			 num1 = (int) (Math.random() * 10);
			 num2 = (int) (Math.random() * 10);
			 
			 // kullanicidan iki sayi göster ve toplamýný gir
			 
			 System.out.println("sayilar " + num1 + " " + num2);
			 System.out.println("cikarma sonucunu yaziniz ");
			 girilensonuc = input.nextInt();
			 if (girilensonuc == (num1-num2) || (girilensonuc == num2-num1) ){
				 dogrucevapsayaci++;
				 count++;
				 
			 }
			 System.out.println("dogru cevap" + dogrucevapsayaci);
		 }
		 
	}

}
