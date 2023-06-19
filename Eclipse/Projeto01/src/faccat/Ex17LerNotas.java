package faccat;
import java.util.Scanner;

public class Ex17LerNotas {
public static void main (String[]args) {
	Scanner sc=new Scanner (System.in);
	System.out.println ("Digite a primeira nota do aluno:");
	float primeiraNota = sc.nextFloat();
	System.out.println ("Agora, digite a segunda nota do aluno");
	float segundaNota = sc.nextFloat();
	float media = (primeiraNota + segundaNota)/2;
	if (media < 6) {
		System.out.println("Por conta da nota " +  media + " o aluno repetiu de ano");
	}
	else {
		System.out.println("Parabéns aluno, com a media " + media + " você conseguiu passar de ano");
	}
	sc.close();
	
	
}
}
		