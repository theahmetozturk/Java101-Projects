import java.util.Scanner;
public class TaksimetreHesaplama {

	public static void main(String[] args) {
		int mesafe;
		double herKm = 2.20, toplam;		//başlangıç fiyatı daha iyi bir kullanım için eklenebilir
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen Mesafeyi Giriniz: ");
		mesafe = input.nextInt();
		
		toplam = (mesafe*herKm)+10;
		
		toplam = (toplam < 20) ? 20 : toplam;
		System.out.println("Taksi Ücreti: "+toplam);
		
		
		

	}

}
