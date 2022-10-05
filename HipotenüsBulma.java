import java.util.Scanner;
public class HipotenüsBulma {

	public static void main(String[] args) {
		int a,b;
		double c;
		Scanner input = new Scanner(System.in);
		System.out.println("1.Kenarı Giriniz: ");
		a = input.nextInt();
		
		System.out.println("2.Kenarı Giriniz: ");
		b= input.nextInt();
		
		c= Math.sqrt((a*a) + (b*b));
		System.out.println("Hipotenüs : "+c);
		
		

	}

}
