package w12;

import java.util.Scanner;

public class ucgenAlana {

	public static void main(String[] args) {
	double alan1 = ucgenAlanHesap(1 ,1 ,1);
	//System.out.println("1,1,1, ucgen alani = " + alan1);
	double alan2 = ucgenAlanHesap(8.95, 8.0 , 9.72);
	//System.out.println("2. ucgen alan= " + alan2);

	
	Scanner input = new Scanner (System.in);
	double i1, i2, i3;
	System.out.println("1.Kenari giriniz: ");
	i1 = input.nextDouble();
	System.out.println("2.Kenari giriniz: ");
	i2 = input.nextDouble();
	System.out.println("3.Kenari giriniz: ");
	i3 = input.nextDouble();
	double alan3 = ucgenAlanHesap(i1 , i2 , i3);
	//System.out.println("3.Ucgenin Alani: " + alan3 );
	
	}
	public static double ucgenAlanHesap( double k1 , double k2 , double k3){
		double alan;
		double s = (k1+k2+k3) / 2;
		alan = Math.pow( (s * (s-k1) * (s-k2) * (s-k3) ) , 0.5);
		ucgenAlanBas(alan, k1, k2, k3);
		return alan;
		
				
	}
	
	public static void ucgenAlanBas ( double alan, double k1, double k2, double k3 ) {
		System.out.println("Ucgenin alani = " +k1 + " " + k2 + " " + k3 + " " + "=" + alan);
	}
	
	
	
	
	
}
