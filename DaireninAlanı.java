import java.util.Scanner;
public class DaireninAlanı {

	public static void main(String[] args) {
		
		int r ;
		double pi = 3.14, alan, cevre;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Dairenin Yarıçapını Giriniz: ");
		r = input.nextInt();
		
		alan = pi*r*r;
		cevre = 2*pi*r;
		
		System.out.println("Dairenin Yarıçapı: "+r);
		System.out.println("Dairenin Alanı: "+alan);
		System.out.println("Dairenin Çevresi: "+cevre);
		
		

	}

}
