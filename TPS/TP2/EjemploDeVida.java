public class EjemploDeVida{
	public static void main(String args[]) {
		
		//Punto a.
		Persona sofia;

		//Punto b.
		sofia = new Persona("Sofia", "Mujer", 38432153, 2.8, 0.50);
		
		System.out.println("\n" + sofia.toString() + "\n");
		//Punto c.
		//Se observan los estados del objeto sofia

		//Punto d.i.
		sofia.alimentar(1.0);
		//Punto d.ii.
		sofia.crecer(0.5); //literales o variables sin nombre
		//Punto d.iii.
		sofia.cumplirAnos();

		System.out.println("\n" + sofia.toString());
		//Punto e.
		//Los estados del objeto Sofia se actualizaron y cambiaron.
		//Tiene sentido, porque el objeto Sofia esta "creciendo"

		
	}
}