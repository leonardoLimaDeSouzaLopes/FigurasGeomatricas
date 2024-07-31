import java.util.Scanner;

public class App {

	
	public static void main(String[] args) {
		
		Scanner ler = new Scanner(System.in);
		
		System.out.println("Qual figura vc vai querer?\n(1) quadrado\n(2) circulo\n(3) triangulo\n(4) retangulo");
		
		int escolha = ler.nextInt();
		
		switch (escolha) {
		case 1: {
			OperacoesQuadrado(ler);
			break;
		}
		case 2: {
			OperacoesCirculo(ler);
			break;
		}
		case 3: {
			OperacoesTriangulo(ler);
			break;
		}
		case 4: {
			OperacoesRetangulo(ler);
			break;
		}
		default:
			throw new IllegalArgumentException("Nao coloco um numero valido");
		}
	}
	
	public static void OperacoesQuadrado(Scanner ler) {
		
		System.out.println("Informe o lado");
		Quadrado quadrado = new Quadrado(ler.nextDouble());
		
		quadrado.calcularArea();
	}
	
	public static void OperacoesCirculo(Scanner ler) {
		
		System.out.println("Informe o raio");
		Quadrado circulo = new Quadrado(ler.nextDouble());
		
		circulo.calcularArea();
	}
	
	public static void OperacoesTriangulo(Scanner ler) {
		
		System.out.println("Informe o 1o lado/base");
		double lado1 = ler.nextDouble(); 
		System.out.println("Informe o 2o lado");
		double lado2 = ler.nextDouble();
		System.out.println("Informe o 3o lado");
		double lado3 = ler.nextDouble();
		System.out.println("Informe a altura");
		double altura = ler.nextDouble();
		
		Triangulo triangulo = new Triangulo(lado1, lado2, lado3, altura);
	}

	public static void OperacoesRetangulo(Scanner ler) {
	
		System.out.println("Informe a base");
		double base = ler.nextDouble();
		System.out.println("Informe o altura");
		double altura = ler.nextDouble();
		
		Retangulo retangulo = new Retangulo(base, altura);
	}

}