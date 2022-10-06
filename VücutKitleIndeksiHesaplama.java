import java.util.Scanner;
public class VücutKitleIndeksiHesaplama {

	public static void main(String[] args) {
		double boy,kilo;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen Boyunuzu Metre Cinsinden Giriniz: ");
		boy = input.nextDouble();
		
		System.out.println("Lütfen Kilonuzu Giriniz: ");
		kilo = input.nextDouble();
		
		double indeks = kilo/(boy*boy);
		
		System.out.println("Kilonuz: "+kilo+" kg");
		System.out.println("Boyunuz: "+boy+" m");
		System.out.println("Vücut Kitle İndeksiniz: "+indeks);


	}

}
