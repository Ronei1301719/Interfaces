package operacoes;

public class TodasOperacoes implements Operacoes {
	public void Soma(double num1, double num2) {
		System.out.println("A soma dos numeros é: " + (num1 + num2));
	}

	@Override
	public void Subtracao(double num1, double num2) {
		System.out.println("A subtração dos numeros é: " + (num1 - num2));

	}

	@Override
	public void Divisao(double num1, double num2) {
		if (num2 == 0) {
			System.out.println("Não é possível realizar uma divisão por 0.");
		}
		else {
			System.out.println("A divisao dos numeros é: " + (num1 / num2));
		}
	}

	@Override
	public void Multiplicacao(double num1, double num2) {
		System.out.println("A multiplicação dos numeros é: " + (num1 * num2));

	}

}
