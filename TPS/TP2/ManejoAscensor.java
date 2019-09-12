public class ManejoAscensor{
	public static void main(String args[]) {
		Ascensor consorcioCallePeron = new Ascensor(4, 150.0);
		
		System.out.println(consorcioCallePeron.getPisoActual());
		consorcioCallePeron.abrirPuerta();
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		
		System.out.println(consorcioCallePeron.getPisoActual());
		
		consorcioCallePeron.abrirPuerta();
		consorcioCallePeron.cerrarPuerta();
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		consorcioCallePeron.subir();
		System.out.println(consorcioCallePeron.getPisoActual());

		Persona natalia, jorge, damian;
		natalia = new Persona("Natalia","Femenino", 1, 60.0, 1.60);
		jorge = new Persona("Jorge","Masculino", 2, 80.0, 1.90);
		damian = new Persona("Damian","Masculino", 3, 90.0, 1.70);

		consorcioCallePeron.abrirPuerta();
		consorcioCallePeron.ingresar(natalia);
		consorcioCallePeron.ingresar(jorge);
		consorcioCallePeron.ingresar(damian);
		consorcioCallePeron.salir(damian);
		consorcioCallePeron.cerrarPuerta();
		consorcioCallePeron.subir();
		System.out.println(consorcioCallePeron.getPisoActual());

	}
}