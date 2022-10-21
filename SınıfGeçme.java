//https://github.com/theahmetozturk/Java101-Projeler
//https://app.patika.dev/theozturk
import java.util.Scanner;

public class SınıfGeçme {

	public static void main(String[] args) {
		int matematik, fizik, turkce, kimya, muzik, toplam = 0, bolum = 0;

		Scanner input = new Scanner(System.in);

		System.out.println("Lütfen matematik notunuzu giriniz: ");
		matematik = input.nextInt();
		if (matematik < 0 || matematik > 100) {
			System.out.println("Geçersiz not girdiniz.**Bu ders hesaplamaya dahil edilmeyecektir**");
			toplam = toplam;
		} else {
			toplam += matematik;
			bolum = bolum + 1;
		}

		System.out.println("Lütfen fizik notunuzu giriniz: ");
		fizik = input.nextInt();
		if (fizik < 0 || fizik > 100) {
			System.out.println("Geçersiz not girdiniz.**Bu ders hesaplamaya dahil edilmeyecektir**");
			toplam = toplam;
		} else {
			toplam += fizik;
			bolum = bolum + 1;
		}
                                               
		System.out.println("Lütfen turkce notunuzu giriniz: ");
		turkce = input.nextInt();
		if (turkce < 0 || turkce > 100) {
			System.out.println("Geçersiz not girdiniz.**Bu ders hesaplamaya dahil edilmeyecektir**");
			toplam = toplam;
		} else {
			toplam += turkce;
			bolum = bolum + 1;
		}

		System.out.println("Lütfen kimya notunuzu giriniz: ");
		kimya = input.nextInt();
		if (kimya < 0 || kimya > 100) {
			System.out.println("Geçersiz not girdiniz.**Bu ders hesaplamaya dahil edilmeyecektir**");
			toplam = toplam;
		} else {
			toplam += kimya;
			bolum = bolum + 1;
		}

		System.out.println("Lütfen muzik notunuzu giriniz: ");
		muzik = input.nextInt();
		if (muzik < 0 && muzik > 100) {
			System.out.println("Geçersiz not girdiniz.**Bu ders hesaplamaya dahil edilmeyecektir**");
			toplam = toplam;
		} else {
			toplam += muzik;
			bolum = bolum + 1;
		}

		double avarage = toplam / bolum;

		if (avarage >= 55) {
			System.out.println("Tebrikler sınıfı geçtiniz!\n" + "Ortalamanız: " + avarage);
		} else {
			System.out.println("Sınıfta kaldınız\n" + "Ortalamanız: " + avarage);
		}

	}
}