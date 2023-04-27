public class Cuadrado extends Triangulo implements Calculadora {

	public Cuadrado(String name, double base, double altura, double lado) {
		super(name, base, altura, lado);
	}//constructor
	
	public double calcularArea() {
		return getLado() * getLado();	
	}//calcularArea
	
	public double calcularPerimetro() {
		return getLado() * 4;
	}// calcularPerimetro

	@Override
	public String toString() {
		return "Cuadrado [getName()=" + getName() + ", getLado()=" + getLado() + "]";
	}//toString	
}//class Cuadrado

