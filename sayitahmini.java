package ybsA;
import java.util.Scanner;
public class sayitahmini {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//verileri yarat
		
		int sistemsayi, kultah;
		
		// rastgele sayý yarat 0-100
		sistemsayi = (int) (Math.random() * 101);
		
		
		//sayý tahmin et kullanýcý
		System.out.println("Lutfen 0-100 arasý bir sayi giriniz: ");
		Scanner input = new Scanner (System.in);
		kultah = input.nextInt();
		
		// sonuclarý karsýlastýr ve mesaj göster
		while (kultah != sistemsayi){
			if (kultah < sistemsayi){
				System.out.println("DAHA YUKSEK BIR SAYI GIRINIZ!");
			}else if (kultah > sistemsayi){
				System.out.println("DAHA KUCUK BIR SAYI GIRINIZ!");
			}
			kultah = input.nextInt();
		
	}
		System.out.println("TEBRIKLER DOGRU TAHMIN ETTINIZ!");
	}
}
