//Definimos el nombre de la clase
public class PruebaConEnteros{
	public static void main(String args[]){
		//Definimos la variable
		int valorEntero;
		long valorEnteroLong;
		//Asignamos a la variable un valor
		valorEntero = 2147483647;
		//Imprimimos en pantalla un mensaje
		System.out.println("\nEl valor de la variable int es: " + valorEntero);
		//Incrementamos el valor de la variable
		valorEntero++;
		//Imprimimos el valor incrementado
		System.out.println("\nEl valor de la variable int Incrementada es: " + valorEntero);
		//Respuesta E----->
		//El problema que hubo es que el tipo de dato primitivo "int" tiene un limite de bits. El nro. dado es el limite,
		//Si le sumo uno mas, sucede lo que se llama overflow o desbordamiento. Supera el limite del tipo de dato.
		//Para solucionar el problema, deberemos de cambiar el tipo de dato que definimos para la variable, por una mas grande.
		valorEnteroLong = 2147483647;
		System.out.println("\n\nEl valor de la variable long es: " + valorEnteroLong);
		valorEnteroLong++;
		System.out.println("\nEl valor de la variable long Incrementada es: " + valorEnteroLong);
		}
}