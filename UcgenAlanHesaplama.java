import java.util.Scanner;
public class UcgenAlanHesaplama {

	public static void main(String[] args) {
		
		double a,b,c,u,alan;
		Scanner input = new Scanner(System.in);
		
		System.out.println("Lütfen 1.Kenar Uzunluğunu Giriniz: ");
		a= input.nextDouble();
		
		System.out.println("Lütfen 2.Kenar Uzunluğunu Giriniz: ");
		b = input.nextDouble();
		
		System.out.println("Lütfen 3.Kenar Uzunluğunu Giriniz: ");
		c = input.nextDouble();
		
		// u = çevre
		u= (a+b+c)/2.0;  
		alan=Math.sqrt(u*(u-a)*(u-b)*(u-c));
		
		System.out.println("1.Kenar Uzunluğu: "+a);
		System.out.println("2.Kenar Uzunluğu: "+b);
		System.out.println("3.Kenar Uzunluğu: "+c);
		System.out.println("Üçgenin Alanı: "+alan);
	
		
		
		
		
		
	}

}
