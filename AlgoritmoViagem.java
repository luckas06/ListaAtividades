package Exercicios;
import java.util.*;
public class AlgoritmoViagem {
	public static void main (String[]args) {
		Scanner in = new Scanner (System.in);
		double di, dia, v;
		System.out.println("Digite qual destino quer ir 1 para Ilhabela e 2 para Fernando de Noronha");
		di = in.nextDouble();
		System.out.println("Digite a quantidade de dias que pretender ficar");
		dia = in.nextDouble();
		if (di == 1 && dia <= 2) {
			v = dia * 240;
			System.out.println("O valor a ser pago é "+v);
		}else if (di == 1 && dia <= 6) {
			v = dia * 220 + 130;
			System.out.println("O valor a ser pago é "+v);
		}else if (di == 1 && dia < 10){
			v = dia * 210 + 150;
			System.out.println("O valor a ser pago é "+v);
		}else if (di == 2 && dia <= 2) {
			v = dia * 400 + 100;
			System.out.println("O valor a ser pago é "+v);
		} else if (di == 2 && dia <=6){
			v = dia * 410 + 150;
			System.out.println("O valor a ser pago é "+v);
		}else {
			v = dia * 420 + 200;
			System.out.println("O valor a ser pago é "+v);
		}in.close();
				
	}
}

	
