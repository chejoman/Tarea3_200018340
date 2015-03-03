import java.util.Scanner;
public class Paridad {

	public static void main(String[] args) {
		int num=0;
		
		System.out.println("Ingrese número a verificar:");
		
		Scanner s = new Scanner(System.in);
		num = s.nextInt();
		
		if(num%2==0)
			System.out.println(num+" "+"Es par");
		else
			System.out.println(num+" "+"Es Impar");

	}

}
