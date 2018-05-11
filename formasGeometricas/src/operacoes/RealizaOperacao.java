package operacoes;

import java.util.Scanner;

public class RealizaOperacao {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int operacao;

		System.out.println("Digite o primeiro numero: ");
		double num1 = scanner.nextInt();

		System.out.println("Digite o segundo número: ");
		double num2 = scanner.nextInt();

		System.out.println(" ");
		System.out.println(" ");
		System.out.println("------------------------------------");
		System.out.println("Digite uma opção para a operação, sendo: ");
		System.out.println("1 - Soma.");
		System.out.println("2 - Subtração.");
		System.out.println("3 - Divisão.");
		System.out.println("4 - Multiplicação.");
		System.out.println("------------------------------------");
		System.out.println(" ");
		operacao = scanner.nextInt();
		System.out.println(" ");
		System.out.println(" ");

		Operacoes s = new TodasOperacoes();
		Operacoes u = new TodasOperacoes();
		Operacoes d = new TodasOperacoes();
		Operacoes m = new TodasOperacoes();

		switch (operacao) {
		case 1:
			s.Soma(num1, num2);
			break;

		case 2:
			u.Subtracao(num1, num2);
			break;

		case 3:
			d.Divisao(num1, num2);
			break;

		case 4:
			m.Multiplicacao(num1, num2);
			;
			break;

		default:
			System.out.printf("Você digitou uma operação inválida.");
		}		
	}

}
