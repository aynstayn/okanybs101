package ybsA;
import java.util.Scanner;
public class piyangOrnegi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		// verileri yarat
		int input1 , input2, sistem1, sistem2;
		
		
		// rastgele 2 say� yarat
		sistem1 = (int) (Math.random () *10);
		sistem2 = (int) (Math.random () *10);
		System.out.println("sayilar" + sistem1 + sistem2);
		
		
		// kullanicidan 2 say� girmesini iste
		System.out.println("iki 0 -9 sayisi giriniz");
		Scanner input = new Scanner (System.in);
		input1= input.nextInt();
		input2= input.nextInt();
		
		
		//kar��la�t�r mesaj g�ster
		if (input1 == sistem1 && input2 == sistem2)
			System.out.println("50000 Dolar Kazand�n�z");
		else if (input1 == sistem2 && input2 == sistem1)
			System.out.println("4000 Dolar Kazandiniz");
		else if (input1 == sistem1 || input1 == sistem2 || input2 == sistem1 || input2 == sistem2);
			System.out.println("2000 Dolar Kazandiniz");
		
	}

}
