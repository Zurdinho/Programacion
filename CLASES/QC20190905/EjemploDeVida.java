public class EjemploDeVida{
	public static void main(String args[]) {
		
		//Punto a.
		Persona sofia;

		//Punto b.
		sofia = new Persona("Sofia", "Mujer", 38432153, 2.8, 0.50);
		System.out.println("\n" + sofia.toString() + "\n");
		// System.out.println("\n" + sofia); o de esta otra

		//El mensaje es la comunicacion entre objetos

		//Punto c.
		//Se observan los estados del objeto sofia

		//Punto d.i.
		sofia.alimentar(1.0);
		//Punto d.ii.
		sofia.crecer(0.5); //literales o variables sin nombre
		//Punto d.iii.
		sofia.cumplirAnos();

		//Punto e.
		System.out.println("\n" + sofia.toString());
	}
}