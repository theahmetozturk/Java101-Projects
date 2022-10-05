import java.util.Scanner;
public class KdvTutarıHesaplama {

	public static void main(String[] args) {
		double kdv1 = 0.18,kdv2 = 0.08;
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen bir fiyat giriniz: ");
		double fiyat = input.nextInt();
		
		double hangiKdv = (fiyat>1000)? fiyat*kdv1 :fiyat*kdv2;
		
		System.out.println("Kdv'siz Fiyat: "+fiyat);
		System.out.println("Kdv'li Fiyat: "+(fiyat+hangiKdv));
		System.out.println("Toplam Kdv : "+hangiKdv);

	}

}
