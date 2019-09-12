public class Ciclista{

	public static void main(String args[]) {
		
		//El ciclista compra su bicicleta
		Bicicleta rutaRoja, hibrida;
		// Marta se compra su bicicleta
		Bicicleta mountainNegra;
		// La bici de marta tiene las caracteristicas por default
		mountainNegra = new Bicicleta();
		//Creando el Objeto (Instanciamos la clase). La bici de ricardo definio que no es default, sino que es ruta y roja
		rutaRoja = new Bicicleta('R','R');

		System.out.print("Color de rutaRoja: ");
		System.out.print(rutaRoja.verColor());
		System.out.print(" - Tipo de rutaRoja: ");
		System.out.println(rutaRoja.verTipo());

		System.out.print("Color de mountainNegra: ");
		System.out.print(mountainNegra.verColor());
		System.out.print(" - Tipo de mountainNegra: ");
		System.out.println(mountainNegra.verTipo());

		hibrida = rutaRoja;
		hibrida = mountainNegra;
		
		System.out.print("Color de hibrida: ");
		System.out.print(hibrida.verColor());
		System.out.print(" - Tipo de hibrida: ");
		System.out.println(hibrida.verTipo());

		rutaRoja = mountainNegra;

		System.out.print("Color de rutaRoja: ");
		System.out.print(rutaRoja.verColor());
		System.out.print(" - Tipo de rutaRoja: ");
		System.out.println(rutaRoja.verTipo());

		rutaRoja = new Bicicleta('R','R');
		mountainNegra.establecerCadencia((Byte)30);
		System.out.print("\nVelocidad mountainNegra: ");
		System.out.println(mountainNegra.verVelocidad());
		System.out.print("\nVelocidad rutaRoja: ");
		System.out.println(rutaRoja.verVelocidad());
		System.out.print("\nVelocidad hibrida: ");
		System.out.println(hibrida.verVelocidad());

		byte cadenciaQueDeseaRicardo = 30;

		//Ricardo se sube a su bici, entonces en pantalla se visualiza la velocidad
		System.out.print("\nVelocidad: ");
		System.out.println(rutaRoja.verVelocidad());
	
		//Incrementar el pinion
		rutaRoja.subirPinion();
		rutaRoja.subirPinion();

		//Conversion explicita
		rutaRoja.establecerCadencia((byte)30);

		System.out.print("Pinion Actual: ");
		System.out.println(rutaRoja.verPinionActual());

		System.out.print("\nVelocidad: ");
		System.out.println(rutaRoja.verVelocidad());

		System.out.print("Pinion Actual: ");
		System.out.println(rutaRoja.verPinionActual());

		rutaRoja.bajarPinion();
		rutaRoja.bajarPinion();

		System.out.print("\nVelocidad: ");
		System.out.println(rutaRoja.verVelocidad());

		System.out.print("Pinion Actual: ");
		System.out.println(rutaRoja.verPinionActual());
	}	
}