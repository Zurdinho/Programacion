public class NotaAlumno{
	public static void main(String args[]) {
		Alumno fernando = new Alumno("Fernando",2.0F,3.0F);
		Alumno sofia = new Alumno("Sofia",9.0F,10.0F);
		Alumno juliana = new Alumno("Juliana",4.0F,4.0F);

		System.out.println(fernando.toString());
		System.out.println(sofia.toString());
		System.out.println(juliana.toString());
		
		System.out.println("\n" + fernando.verEstadoAlumno());
		System.out.println(sofia.verEstadoAlumno());
		System.out.println(juliana.verEstadoAlumno());
	}
}