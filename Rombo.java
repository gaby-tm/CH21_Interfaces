
public class Rombo extends Triangulo implements Calculadora{
	private double diagMayor;
	private double diagMenor;
	public Rombo(String name, double base, double altura, double lado, double diagMayor, double diagMenor) {
		super(name, base, altura, lado);
		this.diagMayor = diagMayor;
		this.diagMenor = diagMenor;
	}//constructor
	
	public double calcularArea() {
		return (getDiagMayor() * getDiagMenor())/ 2;	
	}//calcularArea
	
	public double calcularPerimetro() {
		return getLado() * 4;
	}// calcularPerimetro
	
	public double getDiagMayor() {
		return diagMayor;
	}
	public void setDiagMayor(double diagMayor) {
		this.diagMayor = diagMayor;
	}
	public double getDiagMenor() {
		return diagMenor;
	}
	public void setDiagMenor(double diagMenor) {
		this.diagMenor = diagMenor;
	}

	@Override
	public String toString() {
		return "Rombo [diagMayor=" + diagMayor + ", diagMenor=" + diagMenor + ", getName()=" + getName()
				+ ", getLado()=" + getLado() + "]";
	}//toString
	
}//class Rombo
