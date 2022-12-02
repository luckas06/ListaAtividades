package PlacaVeiculo;
import java.util.Scanner;
public class PlacaVeiculo {
	public static void main(String[]args) {
		Scanner in = new Scanner (System.in);
		int nv;
		System.out.println("Entre com o número final da placa do seu veiculo de 0 a 9");
		nv = in.nextInt();
		switch(nv){
		case 1:
		case 2:
			System.out.println("O veículo não poderá circular na segunda-feira");
			break;
		case 3:
		case 4:
			System.out.println("O veículo não poderá circular na terça-feira");
			break;
		case 5:
		case 6:
			System.out.println("O veículo não poderá circular na quarta-feira");
			break;
		case 7:
		case 8:
			System.out.println("O veículo não poderá circular na quinta-feira");
			break;
		case 9:
		case 0:
			System.out.println("O veículo não poderá circular na sexta-feira");
			break;
		default:
			System.out.println("número invalido");
		}
	}

}
