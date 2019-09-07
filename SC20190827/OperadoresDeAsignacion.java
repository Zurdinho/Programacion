public class OperadoresDeAsignacion {
	public static void main(String args[]) {
		//Declarando variables 
		int a=0, b=0, c=0, d=0;
		a=1; b=1;

		//Realizando operaciones
		c=a++;
		//Imprimiendo variables
		System.out.println("variable a : " + a);
		System.out.println("variable c : " + c);
		
		//Realizando operaciones
		d=++b;
		// Imprimo variables
		System.out.println("variable b : " + b);		
		System.out.println("variable d : " + d);
	}
}