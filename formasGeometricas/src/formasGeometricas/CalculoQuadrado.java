package formasGeometricas;

public class CalculoQuadrado implements FormaGeometrica {

	public void CalcularArea(int lado) {
		// lado = (lado * lado);
		System.out.println("A área do quadrado é: " + lado * lado);

	}

	public void CalcularPerimetro(int lado) {
		// lado = (lado * 4);
		System.out.println("O perímetro do quadrado é: " + lado * 4);

	}

}
