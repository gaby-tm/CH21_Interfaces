public class testFiguras {
	public static void main(String[] args) {
		//nombre, base, altura, lado
		Triangulo t1 = new  Triangulo("Triángulo t1", 20.0, 10.0, 15.0);
		Triangulo t2 = new  Triangulo("Bermudas", 87.0, 121.0, 101.0);
		Cuadrado c1 = new Cuadrado("Cuadrado 1", 0, 0, 4);
		Rectangulo r1 = new Rectangulo("Rectángulo 1", 4, 2, 0);
		Rombo ro1 = new Rombo("Rombo 1", 0, 0, 4, 10, 5); //nombre, base, altura, lado, diagMayor, diagMenor
		// TODO: Aquí se deben instanciar las otras figuras geométricas

		imprimirCalculo(t1); imprimirCalculo(t2); imprimirCalculo(c1);
		imprimirCalculo(r1); imprimirCalculo(ro1);
		
		// TODO: Aquí se debe probar cada figura con el método imprimirCalculo
		
	}//main

	public static void imprimirCalculo(Calculadora t) {
		System.out.println(t);
		System.out.println("+========================================");
		System.out.println("|El área de ["+t.getName()+"] es: " + t.calcularArea() + 
				"\n" + "|El perímetro de ["+t.getName()+"] es: " + t.calcularPerimetro());
		System.out.println("+========================================");
	}//imprimirCalculo
	
//	public static void imprimirCalculo(Cuadrado c) {
//		System.out.println(c);
//		System.out.println("+========================================");
//		System.out.println("|El área de ["+c.getName()+"] es: " + c.calcularArea() + 
//				"\n" + "|El perímetro de ["+c.getName()+"] es: " + c.calcularPerimetro());
//		System.out.println("+========================================");
//	}//imprimirCalculo
	
}//class testFiguras