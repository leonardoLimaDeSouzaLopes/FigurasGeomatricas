
public class Triangulo extends FiguraGeometrica{
	
	private double lado1, lado2, lado3;
	
	//Getters e Setters
	
	public double getLado1() {
		return lado1;
	}

	public void setLado1(double lado1) {
		this.lado1 = lado1;
	}

	public double getLado2() {
		return lado2;
	}

	public void setLado2(double lado2) {
		this.lado2 = lado2;
	}

	public double getLado3() {
		return lado3;
	}

	public void setLado3(double lado3) {
		this.lado3 = lado3;
	}

	public void calcularArea() {
		
			System.out.println("A area do triangulo e: " + (long) (this.getBase() * this.getAltura() / 2));
	}
	
	public boolean eUmTriangulo() {
		
		if (lado1 >= lado2 + lado3) {
			return false;
		}
		if(lado2 >= lado1 + lado3) {
			return false;
		}
		if(lado3 >= lado1 + lado2) {
			return false;
		}
		
		return true;
	}
	
	public Triangulo(double lado1Parametro, double lado2Parametro, double lado3Parametro, double altura) {
		
		this.setLado1(lado1Parametro);
		this.setLado2(lado2Parametro);
		this.setLado3(lado3Parametro);
		
		this.setBase(lado1Parametro);
		this.setAltura(altura);
	}
}
