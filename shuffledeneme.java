import java.util.Scanner;

public class shuffledeneme {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int boyut = 5;
		Scanner input = new Scanner (System.in);
		int[] dizi2 = new int[boyut];
		for (int i=0; i<dizi2.length; i++) {
			dizi2[i] = (int) (Math.random()*(dizi2.length));
		}
		
		for (int i=0; i<dizi2.length; i++) {
			System.out.println(i+1 + " = " + dizi2[i] + " , " );
		}
		System.out.println("sola itirdikten sonra-----------------------------");
		
		int temp = dizi2[0];
			
			for (int i=0 ;i<dizi2.length-1; i++) {
				dizi2[i] = dizi2[i+1];
			}
		
			for (int i=0; i<dizi2.length; i++) {
				System.out.println(i+1 + " = " + dizi2[i] + " , " );
			}
			
			dizi2[dizi2.length-1] = temp;
			
			
			
			/*
		for (int i=0; i<dizi2.length; i++ ) {
			int j = (int)(Math.random()*dizi2.length);
			int temp = dizi2[i];
			dizi2[i] = dizi2[j];
			dizi2[j] = temp;
		} 
		
	*/
	
	}
	

}
