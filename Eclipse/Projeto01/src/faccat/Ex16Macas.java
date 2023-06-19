package faccat;
import java.util.Scanner;

public class Ex16Macas {
public static void main(String[]args) {
	Scanner sc=new Scanner (System.in);
	System.out.println ("Quantas maçãs foram compradas?");
	int macas = sc.nextInt();
	if (macas < 12) {
		float valor = 1.30f * macas; 
		System.out.printf ("O valor das maçãs será : %.2f %n " , (valor));		
	}
	else {
		float promocao = 1.00f * macas;
		System.out.printf ("Por conta da promoção você irá pagar :%.2f %n ", (promocao));
	}
sc.close();	
	
}
}
