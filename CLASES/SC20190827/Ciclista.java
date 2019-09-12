public class Ciclista{

	public static void main(String args[]) {
		
		//El ciclista compra su bicicleta
		Bicicleta rutaRoja;
		//Creando el Objeto (Instanciamos la clase)
		rutaRoja = new Bicicleta();

		byte cadenciaQueDeseaRicardo = 30;

		//Ricardo se sube a su bici, entonces en pantalla se visualiza la velocidad
		System.out.print("\nVelocidad: ");
		System.out.println(rutaRoja.calcularVelocidad());
	
		//Incrementar el pinion
		rutaRoja.subirPinion();
		rutaRoja.subirPinion();

		//Conversion explicita
		rutaRoja.establecerCadencia((byte)30);

		System.out.print("Pinion Actual: ");
		System.out.println(rutaRoja.verPinionActual());

		System.out.print("\nVelocidad: ");
		System.out.println(rutaRoja.calcularVelocidad());

		System.out.print("Pinion Actual: ");
		System.out.println(rutaRoja.verPinionActual());

		rutaRoja.bajarPinion();
		rutaRoja.bajarPinion();

		System.out.print("\nVelocidad: ");
		System.out.println(rutaRoja.calcularVelocidad());

		System.out.print("Pinion Actual: ");
		System.out.println(rutaRoja.verPinionActual());
	}	
}