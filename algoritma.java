import java.util.Scanner;

public class algoritma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int boyut = 5;
		Scanner input = new Scanner (System.in);
		int[] dizi2 = new int[boyut];
		for (int i=0; i<dizi2.length; i++) {
			dizi2[i] = (int) (Math.random()*(dizi2.length));
		

		}
		int temp = dizi2[dizi2.length-1];
		for ( int i=dizi2.length; i<0; i--){
				dizi2[i] = dizi2[i-1];
		}
		 
		 
	
	
	
	
	}
	
}
