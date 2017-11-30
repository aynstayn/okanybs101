package w12;

import java.util.Scanner;

public class hesaplamaW12 {

	public static double fetureInvesmentValue ( double yatirimMik , double aylikFaiz  , int sene ) {
		double kacparakazan;
		kacparakazan =  yatirimMik * Math.pow((1 + aylikFaiz/1200), (sene * 12));
		return kacparakazan;
		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double yatirimMik, aylikFaiz;
		Scanner input = new Scanner (System.in);
		System.out.println("Kac para istiyorsun: ");
		yatirimMik = input.nextDouble();
		System.out.println("Aylik faiz orani kac olsun: ");
		aylikFaiz = input.nextDouble();
		

		System.out.println("Kar 1.Sene: " + fetureInvesmentValue (yatirimMik, aylikFaiz, 1) );
		}
	}


