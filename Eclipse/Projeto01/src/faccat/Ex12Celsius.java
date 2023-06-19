package faccat;
import java.util.Scanner;

public class Ex12Celsius {
public static void main(String[]Args) {
	Scanner sc = new Scanner (System.in);
	System.out.println ("Insira os graus em Fahrenheit:");
	float fahrenheit = sc.nextFloat();
	float celsius = ((fahrenheit - 32)*5)/9;
	   System.out.println("O valor em Celsius é de: " + celsius);
	   sc.close();
}
}
