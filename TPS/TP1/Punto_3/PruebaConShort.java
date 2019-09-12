public class PruebaConShort{
	public static void main(String args[]){
		//Byte: 127
		//Short: 32767
		//Int: 2147483647
		//Long: 9223372036854775807
		//Char: ?
		//Float: 3.4028235E38
		//Double: 1.7976931348623157E308
		short valorShort;
		int valorInt;
		
		System.out.println("\n______________________________________________________________");
		System.out.println("\nEl valor maximo de las variables son: " + "\nByte: " + Byte.MAX_VALUE + "\nShort: " + Short.MAX_VALUE + "\nInt: " + Integer.MAX_VALUE + "\nLong: " + Long.MAX_VALUE + "\nChar: " + Character.MAX_VALUE + "\nFloat: " + Float.MAX_VALUE + "\nDouble: " + Double.MAX_VALUE);
		System.out.println("\n______________________________________________________________");

		valorShort = 32767;
		System.out.println("\nEl valor de la variable Short es: " + valorShort);

		valorShort++;
		System.out.println("El valor de la variable Short Incrementada es: " + valorShort);

		valorInt = 32767;
		System.out.println("\n\nEl valor de la variable int es: " + valorInt);

		valorInt++;
		System.out.println("El valor de la variable int Incrementada es: " + valorInt);
	}
}