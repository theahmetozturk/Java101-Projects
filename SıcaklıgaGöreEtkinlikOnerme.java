//https://app.patika.dev/theozturk
//https://github.com/theahmetozturk/Java101-Projeler
import java.util.Scanner;

public class SıcaklıgaGöreEtkinlikOnerme {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
// 1.Çözüm
		System.out.println("Lütfen hava sıcaklığını giriniz: ");
		int heat = input.nextInt();
		
		if(heat<5) {
			System.out.println("Kayak yapabilirsiniz");
		}else if(heat>5 && heat<=15){
			System.out.println("Sinemaya gidebilirsiniz");
		}else if(heat>15 && heat<=25) {
			System.out.println("Piknik yapabilirsiniz");
		}else if(heat>25) {
			System.out.println("Yüzmeye gidebilirsiniz");
		}		
//***********************************************************************
//2.Çözüm
		System.out.println("Lütfen hava sıcaklığı giriniz: ");
		int temperature = input.nextInt();
		
		String offer = (temperature<5)? "Kayak yapabilirsiniz":
			((temperature>5 && temperature<=15)?"Sinemaya gidebilirsiniz":
				((temperature<15 && temperature>=25)?"Piknik yapabilirsiniz":
					"Yüzmeye gidebilirsiniz"));
		
		
	}

}
