package hiptenüsHesaplama;
import java.util.Scanner;

public class HipoHesaplama {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a,b;
		double c;
		
		Scanner ınp=new Scanner(System.in);
		System.out.print("a: ");
		
		a=ınp.nextInt();
		System.out.print("b: ");
		b=ınp.nextInt();
		
		
		c=Math.sqrt((a*a)+(b*b));
		System.out.println("Bir Kenarı "+a+" bir kenarı "+b+" olan dik üçgenimizin hipotenüs uzunluğu "+c+ " dir");

	}

}
