import java.util.Scanner;
public class faizhesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
		System.out.println(1.0 - 0.9);
		
		// 
		// degerleri yarat
		 double senelikfaiz;
		 double borcMiktari;
		 double aylikfaiz;
		 double aylikOdeme;
		 double toplamBorc; 
		 int kacsene;
		 
		 //Scanner
		 Scanner input = new Scanner (System.in);
		 System.out.print("Özben Bankamýza hoþgeldiniz lütfen faiz oranini giriniz: ");
		 senelikfaiz = input.nextDouble();
		 System.out.print("Borcunuzu kaç senede ödemek istersiniz: ");
		 kacsene = input.nextInt();
		 System.out.print("Ýstediðiniz para ne kadar: ");
		 borcMiktari = input.nextDouble();
		 aylikfaiz = senelikfaiz / 1200;
		 
		 aylikOdeme = borcMiktari * aylikfaiz / (1
				- 1 / Math.pow(1 + aylikfaiz, kacsene * 12 ));
		 toplamBorc = aylikOdeme * kacsene *12;
		 
		 System.out.println("Aylik odemeniz = " + aylikOdeme);
		 System.out.println("Toplam borcunuz = " + toplamBorc );
		 
		 System.out.println("Aylik odemeniz = " + String.format("%.2f", aylikOdeme));
		 System.out.println("Toplam borcunuz = " + String.format("%.2f", toplamBorc ));
		 System.out.println("Aylik odemeniz = " + (int) (aylikOdeme * 100)/100.000 );
		 System.out.println("Toplam borcunuz = " + (int) (toplamBorc * 100)/100);
		 
		  
		
			
	}

}
