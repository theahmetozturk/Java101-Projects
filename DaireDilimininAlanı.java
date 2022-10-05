import java.util.Scanner;
public class DaireDilimininAlanı {

	public static void main(String[] args) {
		
		int r;
		double pi  = 3.14,aci,dilimAlanı;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Lütfen Dairenin Yarıçapını Giriniz: ");
		r = input.nextInt();
		
		System.out.println("Lütfen Merkez Açıyı Giriniz: ");
		aci = input.nextDouble();
		
		dilimAlanı=(pi*(r*r)*aci/360);
		System.out.println("Daire Diliminin Alanı: "+dilimAlanı);


		
		

	}

}
