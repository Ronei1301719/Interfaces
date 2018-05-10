package formasGeometricas;

import java.util.Scanner;

public class CalculoFormaMain {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);

		System.out.println("Digite o tamanho de um dos lados do quadrado: ");
		int lado = scanner.nextInt();

		System.out.println("Digite o raio do círculo: ");
		int raio = scanner.nextInt();

		FormaGeometrica q = new CalculoQuadrado();
		FormaGeometrica c = new CalculoCirculo();
		
		System.out.println(" ");
		q.CalcularArea(lado);
		q.CalcularPerimetro(lado);
		System.out.println(" ");
		System.out.println(" ");
		c.CalcularArea(raio);
		c.CalcularPerimetro(raio);
	}

}
