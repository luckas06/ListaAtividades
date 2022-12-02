package Exercicios;
import java.util.*;
public class AnoBissexto {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double nasc, bi;
		System.out.println("Digite o ano de nascimento");
		nasc = in.nextDouble();
		bi = nasc % 4;
		if (bi == 0) {
			System.out.println("O ano é bissexto");
		}else {
			System.out.println("O ano não é bissexto");
		}in.close();
	}
}
