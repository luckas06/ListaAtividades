package Exercicios;
import java.util.*;
public class DiaMeses {
	public static void main (System[]args) {
		Scanner in = new Scanner (System.in);
		int m;
		
		System.out.println("Digite um número correspondente ao mês");
		m = in.nextInt();
		
		switch (m) {
			case 4:
			case 6:
			case 9:
			case 11:
				System.out.println("Esse mês possui 30 dias");
				break;
			case 1:
			case 3:
			case 5:
			case 7:
			case 8:
			case 10:
			case 12:
				System.out.println("Esse mês possui 31 dias");
				break;
			case 2:
				System.out.println("Esse mês possui 28 dias");
				break;
			default:
				System.out.println("Número inválido");
		}
		
	}
}
