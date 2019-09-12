public class ManejoDeString{
	
	public static void main(String args[]) {
		
	Bicicleta roja, verde;
	String palabra1, palabra2;
	
	roja = new Bicicleta('r');

	verde = roja;
	verde.pintar('v');

	palabra1 = "Hola";
	palabra2 = palabra1;
	palabra2 = "Chau";

	System.out.println("" + palabra1);

	System.out.print(roja.imprimirColor());

	}
}