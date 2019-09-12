public class ClaseDePrueba{
	public static void main(String args[]) {
		int capacidadHdd = 1; // Expresado en TERA
		Double capacidadDvd = 8.5; // Expresado en GIGA
		double capacidadBlueRay = 25.0; //Expresado en GIGA
		double cantidadDeDvdsParaBackupearHdd;
		double cantidadBlueRaysParaBackupearHdd;

		int conversionDeUnidad = 1024;

		cantidadDeDvdsParaBackupearHdd = ((capacidadHdd*conversionDeUnidad)/capacidadDvd);
		cantidadBlueRaysParaBackupearHdd = ((capacidadHdd*conversionDeUnidad)/capacidadBlueRay);
		
		System.out.println("\nCantidad de DVD que se necesitan para backupear el disco rigido: " + cantidadDeDvdsParaBackupearHdd);
		System.out.println("Cantidad de Blue Rays que se necesitan para backupear el disco rigido: " + cantidadBlueRaysParaBackupearHdd);
		//Respuesta a ----->
		//No se puede compilar, porque existe un problema de tipos de variables y conversiones.
		//Respuesta b ----->
		//Se puede reformular la definicion de la variable, pero no seria correcto.
		//Realizaria un casteo, convirtiendo el valor del resultado a entero, ya que los Dvds O Blue Rays
		//no pueden ser con coma, sino enteros.
	}
}