public class PruebaConLong{
	public static void main(String args[]){
		//Byte: 127
		//Short: 32767
		//Int: 2147483647
		//Long: 9223372036854775807
		//Char: ?
		//Float: 3.4028235E38
		//Double: 1.7976931348623157E308
		long valorLong;
		float valorFloat;
		
		System.out.println("\n______________________________________________________________");
		System.out.println("\nEl valor maximo de las variables son: " + "\nByte: " + Byte.MAX_VALUE + "\nShort: " + Short.MAX_VALUE + "\nInt: " + Integer.MAX_VALUE + "\nLong: " + Long.MAX_VALUE + "\nChar: " + Character.MAX_VALUE + "\nFloat: " + Float.MAX_VALUE + "\nDouble: " + Double.MAX_VALUE);
		System.out.println("\n______________________________________________________________");

		valorLong = 9223372036854775807L;
		System.out.println("\nEl valor de la variable long es: " + valorLong);

		valorLong++;
		System.out.println("El valor de la variable long Incrementada es: " + valorLong);

		valorFloat = 9223372036854775807L;
		System.out.println("\n\nEl valor de la variable float es: " + valorFloat);

		valorFloat++;
		System.out.println("El valor de la variable float Incrementada es: " + valorFloat);
	}
}