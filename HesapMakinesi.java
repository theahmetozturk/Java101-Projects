import java.util.Scanner;

public class HesapMakinesi {

	public static void main(String[] args) {
		int s1,s2,select;
		Scanner input = new Scanner(System.in);
		System.out.println("İlk sayıyı giriniz: ");
		s1=input.nextInt();
		System.out.println("İkinci sayıyı giriniz: ");
		s2=input.nextInt();
		System.out.println("1-Toplama\n2-Çıkarma\n3-Çarpma\n4-Bölme");
		System.out.println("İşlem seçiniz");
		select=input.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("İşlem sonucunuz: "+s1+s2);
			break;
		case 2:
			System.out.println("İşlem sonucunuz: "+(s1-s2));
			break;
		case 3:
			System.out.println("İşlem sonucunuz: "+s1*s2);
			break;
		case 4:
			System.out.println("İşlem sonucunuz: "+s1/s2);
		default:	
			System.out.println("Hatalı giriş yaptınız");
		}
	}

}
