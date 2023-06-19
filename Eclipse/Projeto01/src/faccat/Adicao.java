package faccat;
import java.util.Scanner;

public class Adicao {
public static void main(String[]args) {
	Scanner sc = new Scanner(System.in);
	System.out.println("Digite um valor:"); 
	int numero01=sc.nextInt();
	System.out.println("Digite mais um valor:");
	int numero02=sc.nextInt();
	
	int resultadoadicao= numero01+numero02;
	System.out.println("O resultado é:" +resultadoadicao);
	sc.close();
	
}

}
