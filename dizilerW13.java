import java.util.Scanner;

public class dizilerW13 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		
	int boyut = 5;
	Scanner input = new Scanner (System.in);
	int[] dizi2 = new int[boyut];
	for (int i=0; i<dizi2.length; i++) {
		dizi2[i] = (int) (Math.random()*10);
	}
		for (int i = 0; i<dizi2.length; i++) {
			System.out.println((i+1) + " = " + dizi2[i] + " , ");
		}
	int toplam=0;
	for (int i=0; i<dizi2.length; i++ ) {
		toplam = toplam + dizi2[i];
	}
		//min bul
		int min= dizi2[0];
		for ( int i=1; i<dizi2.length; i++) {
			if (dizi2[i] < min) {
				min = dizi2[i];
			}
		}
			System.out.println("min = " + min);
	/*
	int boyut2;
	System.out.println("kac sayi giriceksiniz");
	boyut2 = input.nextInt();

	int [] dizi1 = new int [boyut2];
	
		for ( int i = 0; i<boyut2; i++ ) {
			System.out.println(i + " int degeri giriniz" );
			dizi1[i]= input.nextInt();
			}		
		for (int i = 0; i<boyut2; i++) {
			System.out.println((i+1) + " = " + dizi1[i] + " , ");
		}
	*/
	
	
	
	}
	}



