
public class Retangulo extends FiguraGeometrica{

	public void calcularArea() {
		
		System.out.println("A area do retangulo e: " + (long) (this.getBase() * this.getAltura())) ;
		
	}
	
	public void perimetroRetangulo() {
		
		System.out.println("A area do retangulo e: " + (long) (2 * this.getBase() + 2 * this.getAltura()));
		
	}

	public Retangulo(double base, double altura) {
		this.setBase(base);
		this.setAltura(altura);
	}
	
}