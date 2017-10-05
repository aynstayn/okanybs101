import java.util.Scanner;

public class hesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int kullsaniye;
		int hesapDak, hesapSan ;
		
		
		
		Scanner input = new Scanner (System.in);
		System.out.print("saniye giriniz: ");
		kullsaniye = input.nextInt();
		System.out.println("girilen saniye " + kullsaniye);
		
		
		hesapDak = kullsaniye / 60;
		hesapSan = kullsaniye % 60;
		//goster
		System.out.print("girelen saniye = " + hesapDak + " dakika, " + hesapSan + " saniye\n");
		System.out.print("girelen saniye = " + hesapDak + ":" + hesapSan);
		
	}

}
