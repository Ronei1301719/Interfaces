package formasGeometricas;

public class CalculoCirculo implements FormaGeometrica {

	public void CalcularArea(int raio) {
		// raio = (3.1456 * (raio * raio));
		System.out.println("A área do círculo é: " + 3.1456 * (raio * raio));

	}

	public void CalcularPerimetro(int raio) {
		// raio = (raio * (raio * 3.1456));
		System.out.println("O perímetro do círculo é: " + raio * (2 * 3.1456));

	}

}
