package haf5a;
import java.util.Scanner;

public class hesaplamalar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// iki veri yarat kilo ve boy
		double kilogirdipound, boygirdiinch;
		
		
		// bmi hesaplama icin veri yarat
		double bmisonucu;
		double kilogirdikg, boygirdimetre;
		final double KILOGRAMS_PER_POUND = 45359238; //Constant
		final double METERS_PER_INCH = 0.0254; //Constant
		
		// kullanicida iki deger iste
		Scanner input = new Scanner (System.in);
		System.out.println("kilonuzu pound olarak giriniz ");
		kilogirdipound = input.nextDouble();
		System.out.println("boyunuzu inch olarak giriniz ");
		boygirdiinch = input.nextDouble();
		
		kilogirdikg = kilogirdipound * KILOGRAMS_PER_POUND;
		boygirdimetre = boygirdiinch * METERS_PER_INCH;
		
		System.out.println("Kilonuz = " + String.format("%.2f", kilogirdikg) + "boyunuz = " + String.format("%.2f", boygirdimetre*100 + " cm"));
		
		// System.out.println("Kilonuz = " + kilogirdi + "boyunuz= " + boygirdi*100 + "cm");
		
		// bmi hesapalamasýný yap
		bmisonucu = kilogirdipound / (boygirdiinch * boygirdiinch);
		
		//bmi sonucuna göre mesaji göster
		System.out.println("BMI sonucu = " + bmisonucu);
		if (bmisonucu < 18.5)
			System.out.println("underweight");
		else if (bmisonucu < 25 )
			System.out.println("normal");
		else if (bmisonucu < 30)
			System.out.println("owerweight");
		else
			System.out.println("Obese");
	}

}
