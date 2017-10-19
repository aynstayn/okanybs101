package ybsA;
import java.util.Scanner;
public class zodiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int sene, senecase;
		Scanner input = new Scanner (System.in);
		System.out.println("Lutfen dogum tarihinizi giriniz: ");
		sene = input.nextInt();
		senecase = sene %12;
		switch (senecase){
		case 0:
			System.out.println("Monkey"); break;
		case 1:
			System.out.println("Rooster"); break;
		case 2:
			System.out.println("dog"); break;
		case 3:
			System.out.println("pig"); break;
		case 4:
			System.out.println("rat"); break;
		case 5:
			System.out.println("ox"); break;
		case 6:
			System.out.println("tiger"); break;
		case 7:
			System.out.println("rabbit"); break;
		case 8:
			System.out.println("dragon"); break;
		case 9:
			System.out.println("snake"); break;
		case 10:
			System.out.println("horse"); break;
		case 11:
			System.out.println("sheep"); break;
		
			
			
		}
	}

}
