package haf5a;
import java.util.Scanner;
public class yılhesapla {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner (System.in);
		System.out.println("yil girin");
		int sene = input.nextInt();
		/*
		if ((sene % 4 == 00 && sene %100 == 0) || (sene % 400 == 0)){
			System.out.println(sene + "sene artik yil");
			
		}else
			System.out.println(sene + " senesi artik yil degildir");
			*/
			
		// tek satırda kod yazma
		System.out.print(sene + "senesi artik yil");
			if (!((sene % 4 == 00 && sene %100 == 0) || (sene % 400 == 0)));
			System.out.println(" degildir");
		}

	}



