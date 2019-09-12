public class ClaseDePrueba{
	public static void main(String args[]) {
		int capacidadHdd = 1; // Expresado en TERA
		Double capacidadDvd = 8.5; // Expresado en GIGA
		double capacidadBlueRay = 25.0; //Expresado en GIGA
		int cantidadDeDvdsParaBackupearHdd;
		int cantidadBlueRaysParaBackupearHdd;

		int conversionDeUnidad = 1024;

		cantidadDeDvdsParaBackupearHdd = (int)((capacidadHdd*conversionDeUnidad)/capacidadDvd);
		cantidadBlueRaysParaBackupearHdd = (int)((capacidadHdd*conversionDeUnidad)/capacidadBlueRay);
		
		System.out.println("\nCantidad de DVD que se necesitan para backupear el disco rigido: " + cantidadDeDvdsParaBackupearHdd);
		System.out.println("Cantidad de Blue Rays que se necesitan para backupear el disco rigido: " + cantidadBlueRaysParaBackupearHdd);
		//Se puede reformular la definicion de la variable, pero no seria correcto.
		//Realizaria un casteo, convirtiendo el valor del resultado a entero, ya que los Dvds O Blue Rays
		//no pueden ser con coma, sino enteros.
	}
}