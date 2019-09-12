public class PruebaConByte{
	public static void main(String args[]){
		//Byte: 127
		//Short: 32767
		//int: 2147483647
		//Long: 9223372036854775807
		//Char: ?
		//Float: 3.4028235E38
		//Double: 1.7976931348623157E308
		byte valorByte;
		short valorshort;

		System.out.println("\n______________________________________________________________");
		System.out.println("\nEl valor maximo de las variables son: " + "\nByte: " + Byte.MAX_VALUE + "\nShort: " + Short.MAX_VALUE + "\nshort: " + Integer.MAX_VALUE + "\nLong: " + Long.MAX_VALUE + "\nChar: " + Character.MAX_VALUE + "\nFloat: " + Float.MAX_VALUE + "\nDouble: " + Double.MAX_VALUE);
		System.out.println("\n______________________________________________________________");

		valorByte = 127;
		System.out.println("\nEl valor de la variable byte es: " + valorByte);

		valorByte++;
		System.out.println("El valor de la variable byte Incrementada es: " + valorByte);

		valorshort = 127;
		System.out.println("\n\nEl valor de la variable short es: " + valorshort);

		valorshort++;
		System.out.println("El valor de la variable short Incrementada es: " + valorshort);
		}
}