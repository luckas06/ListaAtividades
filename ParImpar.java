package Exercicios;
import java.util.*;
public class ParImpar {
	public static void main (String[]args) {
		double n, pi;
		Scanner in = new Scanner (System.in);
		System.out.println("Digite um número:");
		n =in.nextDouble();
		pi = n % 2;
		if (pi == 0) {
			System.out.println("O número é par");
		}else {
			System.out.println("O número é ímpar");
		}in.close();
	}
}
