package formasGeometricas;

public class CalculoCirculo implements FormaGeometrica {

	public void CalcularArea(int raio) {
		// raio = (3.1456 * (raio * raio));
		System.out.println("A �rea do c�rculo �: " + 3.1456 * (raio * raio));

	}

	public void CalcularPerimetro(int raio) {
		// raio = (raio * (raio * 3.1456));
		System.out.println("O per�metro do c�rculo �: " + raio * (2 * 3.1456));

	}

}
