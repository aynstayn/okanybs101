package ybsA;
import java.util.Scanner;
public class donguler {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// veri yarat
			int num1, num2;
			num1 = (int) (Math.random() * 10);
			num2 = (int) (Math.random() * 10);
			int cevap;
			int sorgusonucu;
			System.out.println("num1 =" + num1 + "num2 =" + num2 );
			
			
			// kullanicidan cevap al
			Scanner input = new Scanner(System.in);
			System.out.println("iki sayinin toplamini giriniz: ");
			cevap = input.nextInt();
			
			// cevaba baglý mesaj göster:
			sorgusonucu = num1+num2;
			 while (sorgusonucu != cevap) {
				System.out.println("Yanlis cevap tekrar giriniz");
				cevap = input.nextInt();
				
			 }
			 System.out.println("Dogru cevap");

}
}
