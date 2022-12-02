package Exercicios;
import java.util.*;
public class Inss {
	public static void main (String arg[]) {
		Scanner in = new Scanner (System.in);
		double s, d, sf;
		System.out.println("Digite o salário");
		s = in.nextDouble();
		if (s<=2500) {
			d = s * 0.09;
		}else {
			d = s * 0.11;
		}
		sf = s - d;
		System.out.println("O salário final é "+sf);
		in.close();
	}
}
