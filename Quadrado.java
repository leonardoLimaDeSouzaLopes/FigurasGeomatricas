
public class Quadrado extends FiguraGeometrica {
	
	public void calcularArea() {
		
		System.out.println("A area do quadrado e: " + this.getBase() * this.getBase());
	}
	
	public Quadrado(double lado) {
		this.setBase(lado);
	}
	
}