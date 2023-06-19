package faccat;
import java.util.Scanner;

public class Ex15LerNumero {
public static void main (String[]args) {
	Scanner sc = new Scanner (System.in);
	System.out.println("Digite um valor");
	int numero = sc.nextInt();
	if (numero < 0) {
		System.out.println("O numero é negativo");
	}
	else{
System.out.println("O valor inserido é sim positivo! ");		
	}
	sc.close();
	
}
}
