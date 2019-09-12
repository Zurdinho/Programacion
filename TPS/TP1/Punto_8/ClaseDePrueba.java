public class ClaseDePrueba{
	public static void main(String args[]) {
		int preIncremento = 5;
		int postIncremento = 5;

		System.out.println("Pre Incremento: " + ++preIncremento);
		System.out.println("Post Incremento: " + postIncremento++);
		//Respeusta ----->
		//Por pantalla se observa que el pre incremento se suma uno al valor de la variable
		//Mientras que en el post incremeto, el valor de la variable queda igual.
		//la diferencia es debido a la forma en que se incremento el valor.
		//en el pre incremento, sumo uno a la variable y luego almaceno.
		//en el post incremento, sumo uno y luego piso asignando la variable nuevamente.
	}
}