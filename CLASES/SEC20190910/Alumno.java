public class Alumno{
	private float notaUno;
	private float notaDos;
	private String nombre;
	private char estadoAlumno;

	public Alumno(String nombre, float notaUno, float notaDos){
		this.nombre = nombre;
		this.notaUno = notaUno;
		this.notaDos = notaDos;
	}

	private char situacionAlumno(){
		if (notaUno >= 7 && notaDos >= 7) {
			return 'p';
		} else{
			if (notaUno >= 4 && notaDos >= 4) {
				return 'c';
			}else{
				return 'r';
			}
		}
	}

	public void setNotaUno(float notaUno){
		if (notaUno >= 0) {
		this.notaUno = notaUno;	
		}
	}

	public float getNotaUno(){
		return this.notaUno;
	}

	public void setNotaDos(float notaDos){
		if (notaDos >= 0) {
		this.notaDos = notaDos;	
		}
	}

	public float getNotaDos(){
		return this.notaDos;
	}

	public void setNombre(String nombre){
		this.nombre = nombre;
	}

	public String getNombre(){
		return this.nombre;
	}

	public void setEstadoAlumno(char estadoAlumno){
		this.estadoAlumno = estadoAlumno;
	}

	public char getEstadoAlumno(){
		return this.estadoAlumno;
	}

	public String verEstadoAlumno(){
		if (situacionAlumno() == 'p') {
			return "Estado del Alumno/a " + this.nombre + ": Promociono";
		} else{
				if (situacionAlumno() == 'c') {
					return "Estado del Alumno/a " + this.nombre + ": Va a Final";
				}else{
					return "Estado del Alumno/a " + this.nombre + ": Tiene que recursar";
				}
		}
	}

	public String toString(){
		return "\n|| Alumno/a - " + nombre + " ||" + "\nNota uno: " + notaUno + "\nNota dos: " + notaDos;
	}
}