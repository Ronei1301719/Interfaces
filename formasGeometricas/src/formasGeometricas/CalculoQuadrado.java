package formasGeometricas;

public class CalculoQuadrado implements FormaGeometrica {

	public void CalcularArea(double lado) {
		// lado = (lado * lado);
		System.out.println("A �rea do quadrado �: " + lado * lado);

	}

	public void CalcularPerimetro(double lado) {
		// lado = (lado * 4);
		System.out.println("O per�metro do quadrado �: " + lado * 4);

	}

}
