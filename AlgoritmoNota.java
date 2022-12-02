package Exercicios;
import java.util.*;
public class AlgoritmoNota {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double n1, n2, media, nE, nM, exame;
		System.out.println("Digite a primeira nota");
		n1 = in.nextDouble();
		System.out.println("Digite a segunda nota");
		n2 = in.nextDouble();
		media = (n1 + n2) / 2;
		System.out.println("A média é "+media);
		System.out.println();
		if (media <= 3) {
			System.out.println("REPROVADO");
		}else if (media >= 6) {
			System.out.println("APROVADO");	
		}else {
			System.out.println("EM EXAME");
			System.out.println("Digite a nova nota de exame");
			exame = in.nextDouble();
			media = (n1 + n2 + exame) / 3;
			System.out.println("A nova média é "+media);
		}
		if (media <= 3) {
			System.out.println("REPROVADO");
		}else{
			System.out.println("APROVADO");	
		}
	}
}
