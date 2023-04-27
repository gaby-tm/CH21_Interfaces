
public class Romboide extends Rectangulo implements Calculadora {

	public Romboide(String name, double base, double altura, double lado) {
		super(name, base, altura, lado);
	}//constructor

	@Override
	public String toString() {
		return "Romboide [getName()=" + getName() + ", getBase()=" + getBase() + ", getAltura()=" + getAltura() + "]";
	}//toString
	
	
}//class Romboide
