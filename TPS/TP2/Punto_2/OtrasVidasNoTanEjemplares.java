public class OtrasVidasNoTanEjemplares{
	public static void main(String args[]) {
		
		Persona mauricio, marcos, eugenia, elisa;

		//Punto a.
		//Instancio las personas, seteando el valor que quiero.
		mauricio = new Persona("Mauricio", "Masculino", 33999776, 70, 1.70);
		//Punto b.
		//IDEM punto a.
		marcos = new Persona("Marcos", "Masculino", 2315321, 80, 1.75);
		//Punto c.
		//IDEM punto a.
		eugenia = new Persona("Eugenia", "Femenino", 2154215, 60, 1.69);
		//Punto d.
		//IDEM punto a.
		elisa = new Persona("Elisa", "Femenino", 63215478, 150, 1.60);
		
		System.out.println("\n" + mauricio.toString());
		System.out.println(marcos.toString());
		System.out.println(eugenia.toString());
		System.out.println(elisa.toString());

		//Podria llamar a cumplirAnos X veces repitiendo la linea muchas veces, pero prefiero usar el for.
		//tambien podria modificar el objeto de "Persona" para que pudiera hacer un getEdad, pero como no está el metodo, uso el for. 
		for (int i=0;i<50;i++) {
		mauricio.cumplirAnos();
		}
		for (int i=0;i<30;i++) {
		marcos.cumplirAnos();
		}
		for (int i=0;i<40;i++) {
		eugenia.cumplirAnos();
		}
		for (int i=0;i<60;i++) {
		elisa.cumplirAnos();
		}

		System.out.println("\n" + mauricio.toString());
		System.out.println(marcos.toString());
		System.out.println(eugenia.toString());
		System.out.println(elisa.toString());				
		
		//Punto e.
		//luego de ejecutar el metodo "Morir", el toString me muestra que la persona se encuentra fallecida.
		mauricio.morir();
		System.out.println("\n" + mauricio.toString());
	}
}