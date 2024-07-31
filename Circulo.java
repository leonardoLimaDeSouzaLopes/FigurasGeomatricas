
public class Circulo extends FiguraGeometrica{

	private double raio;
	
	//Getters e Setters
	
	public double getRaio() {
		return raio;
	}


	public void setRaio(double raio) {
		this.raio = raio;
	}



	public void calcularArea() {
			
		System.out.println("A area do circulo e: " + this.getRaio() * this.getRaio() * Math.PI);
	}
	
	public Circulo(double raioParametro) {
		this.setRaio(raioParametro);
	}
}
