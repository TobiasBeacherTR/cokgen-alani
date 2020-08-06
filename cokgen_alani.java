import java.util.Scanner;

public class cokgen_alani {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Cokgenin kaç kenarý olduðunu giriniz : ");
		double n=scanner.nextDouble();
		System.out.print("Cokgenin bir kenar uzunlugunu giriniz : ");
		double k=scanner.nextDouble();
		
		double a=n*(Math.pow(k, 2))/4;
		
		System.out.println("Cokgenin alaný : " + a );

	}

}
