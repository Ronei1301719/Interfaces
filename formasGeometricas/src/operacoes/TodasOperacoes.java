package operacoes;

public class TodasOperacoes implements Operacoes {
	public void Soma(double num1, double num2) {
		System.out.println("A soma dos numeros �: " + (num1 + num2));
	}

	@Override
	public void Subtracao(double num1, double num2) {
		System.out.println("A subtra��o dos numeros �: " + (num1 - num2));

	}

	@Override
	public void Divisao(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("N�o � poss�vel realizar uma divis�o por 0.");
		}
		else {
			System.out.println("A divisao dos numeros �: " + (num1 / num2));
		}
	}

	@Override
	public void Multiplicacao(double num1, double num2) {
		System.out.println("A multiplica��o dos numeros �: " + (num1 * num2));

	}

}
