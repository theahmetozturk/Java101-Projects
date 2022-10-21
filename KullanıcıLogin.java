//https://app.patika.dev/theozturk
//https://github.com/theahmetozturk/Java101-Projeler

import java.util.Scanner;

public class KullanıcıLogin {

	public static void main(String[] args) {
		String userName, password;
		Scanner input = new Scanner(System.in);

		System.out.println("LÜtfen kullanıcı adınıdızı giriniz: ");
		userName = input.nextLine();
		System.out.println("Lütfen şifrenizi giriniz: ");
		password = input.nextLine();

		if (userName.equals("Ahmet") && password.equals("123456")) {
			System.out.println("Giriş yapıldı");
		} else {
			System.out.println("Parolanız yanlış");
			System.out.println("Yeni parola oluştumak ister misiniz?\n-Evet ise 1\n-Hayır ise 2");
			int select = input.nextInt();

			switch (select) {
			case 1:
				System.out.println("Yeni şifrenizi giriniz: ");
				String yeniSifre = input.next();
				if (yeniSifre.equals(password)) {
					System.out.println("Şifre oluşturulamadı.Lütfen başka şifre giriniz: ");
				} else {
					System.out.println("Şifre oluşturuldu");
				}
				break;
			case 2:
				System.out.println("Şifre OLuşturmak istemediniz");
				break;	
			}

		}

	}

}
