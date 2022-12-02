package Exercicios;
import java.util.*;
import java.io.*;
public class IRPF {
	public static void main (System[]args) throws IOException{
		Scanner in = new Scanner (System.in);
		double s, r;
		
		System.out.println("Digite seu salário");
		s = in.nextDouble();
		if (s <= 1434.59) {
			System.out.println("Não precisa pagar IRPF");
		}else if (s <= 2150.00) {
			r = s*7.5/100-107.59;
			System.out.println("O desconto será de R$"+r);
		}else if (s <= 2866.70) {
			r = s*15.00/100-268.84;
			System.out.println("O desconto será de R$"+r);
		}else if (s <= 3582.00) {
			r = s*22.5/100-483.84;
			System.out.println("O desconto será de R$"+r);
		}else if (s >= 3582.00) {
			r = s*27.5/100-662.94;
			System.out.println("O desconto será de R$"+r);
		}
	}
}
