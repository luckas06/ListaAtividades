package Exercicios;
import java.util.*;
import java.io.*;
public class MargemLucro {
	public static void main (String[]args) throws IOException {
		Scanner in = new Scanner (System.in);
		double r, p, l;
		char s;
		
		do {
			System.out.println("Digite o preço do produto");
			p = in.nextDouble();
			System.out.println("Digite a margem de lucro em porcentagem");
			l = in.nextDouble();
			r = ((l/100)*p)+p;
			System.out.println("O preço de venda deverá ser R$"+r);
			System.out.println();
			System.out.println("Deseja continuar? S/N");
			s = (char)System.in.read();
		}while (s == 'S' || s == 's') ;
	}
}
