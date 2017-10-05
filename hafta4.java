import java.util.Scanner;
public class hafta4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// degerleri yarat
		double yaricap1;	
		double yaricap2;
		double alan;
		final double PI = 3.14159;
		
				// kullanicidan yaricapi girmesini iste
		System.out.println("1- Lutfen yaricapi ondalik formatinda girin");
		// scanner yarat
		Scanner input = new Scanner (System.in);
		yaricap1 = input.nextDouble();
		System.out.println("Kullancinin girdigi yaricap:" + yaricap1);
		
		// alani hesaplayacagim
		alan = yaricap1 * yaricap1 * 3.14;
		// ekrana alan bilgisini göster
		System.out.println("Dairenin alani : " + alan);
		
		// kullanicidan yaricapi girmesini iste
				System.out.println("2- Lutfen yaricapi ondalik formatinda girin");
				yaricap2 = input.nextDouble();
			// alani hesaplayacagim
				alan = yaricap2 * yaricap2 * PI;
			// ekrana alan bilgisi gosterecegim
				System.out.println("2- Dairenin alani: " + alan);
				
		
			
	}


}
