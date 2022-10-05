import java.util.Scanner;
public class NotOrtalaması {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen Matematik Notunuzu Giriniz: ");
		double matematik = input.nextInt();
		
		System.out.println("Lütfen Turkce Notunuzu Giriniz: ");
		double turkce = input.nextInt();
		
		System.out.println("Lütfen Fizik Notunuzu Giriniz: ");
		double fizik = input.nextInt();
		
		System.out.println("Lütfen Kimya Notunuzu Giriniz: ");
		double kimya = input.nextInt();
		
		System.out.println("Lütfen Tarih Notunuzu Giriniz: ");
		double tarih = input.nextInt();
		
		System.out.println("Lütfen Muzik Notunuzu Giriniz: ");
		double muzik = input.nextInt();
		
		double ortalama = (matematik+turkce+fizik+kimya+tarih+muzik)/6;
		System.out.println("Ortalamanız: "+ortalama);
		String durum = ortalama >60 ? "Geçtiniz" : "Kaldınız";
		System.out.println("Geçme Durumunuz: "+durum);

	}

}
