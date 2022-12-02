package Exercicios;
import java.util.*;
public class Temperatura {
	public static void main (String[]args) {
		Scanner in=new Scanner (System.in);
		int t;
		System.out.println("Escreva a temperatura");
		t = in.nextInt();
		if (t<15) {
			System.out.println("Frio");
		}else if (t>=22) {
			System.out.println("Quente");
		}else {
			System.out.println("Amena");
		}in.close();
	}
}
