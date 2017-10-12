/**
 * 
 */
package haf5a;
import java.util.Scanner;
/**
 * @author user
 *
 */
public class mainler {

	public static void main(String[] args) {
		
		// verileri yarat (math random yonetmı)
		int num1, num2;
		num1 = (int) (Math.random() * 10);
		num2 = (int) (Math.random() * 10);
		int cevap;
		
		System.out.println("num1 =" + num1 + "num2 =" + num2 );
		
		
		//kullanicidan cevabı al
		
		Scanner input = new Scanner(System.in);
		System.out.println("iki sayının toplamını giriniz");
		cevap = input.nextInt();
		
		
		//cevaba baglı mesaj göster
		// System.out.println("Cevap Dogru Mu = " + (cevap == num1+num2));
		if (cevap == num1+num2)
		System.out.println("dogru cevap");
		
	}

}
