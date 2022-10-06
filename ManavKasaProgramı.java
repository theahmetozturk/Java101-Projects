import java.util.Scanner;
public class ManavKasaProgramı {

	public static void main(String[] args) {
		double perArmut =2.14, perElma = 3.67, perDomates = 1.11, perMuz = 0.95, perPatlıcan = 5.00;
		double toplam, kiloArmut, kiloElma, kiloDomates, kiloMuz,kiloPatlıcan;
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen Armut Miktarını Kg Cinsinden Giriniz: ");
		kiloArmut = input.nextDouble();
		
		System.out.println("Lütfen Elma Miktarını Kg Cinsinden Giriniz: ");
		kiloElma = input.nextDouble();
		
		System.out.println("Lütfen Domates Miktarını Kg Cinsinden Giriniz: ");
		kiloDomates = input.nextDouble();
		
		System.out.println("Lütfen Muz Miktarını Kg Cinsinden Giriniz: ");
		kiloMuz = input.nextDouble();
		
		System.out.println("Lütfen Patlıcan Miktarını Kg Cinsinden Giriniz: ");
		kiloPatlıcan = input.nextDouble();
		
		toplam =(perArmut*kiloArmut)+(perElma*kiloElma)+(perDomates*kiloDomates)+(perMuz*kiloMuz)+(perPatlıcan*kiloPatlıcan);
		
		System.out.println("Armut: "+kiloArmut+" Kg");
		System.out.println("Elma: "+kiloElma+" Kg");
		System.out.println("Domates: "+kiloDomates+" Kg");
		System.out.println("Muz: "+kiloMuz+" Kg");
		System.out.println("Patlıcan: "+kiloPatlıcan+" Kg");
		System.out.println("Toplam Kasa Tutarı: "+toplam);
		

	}

}
