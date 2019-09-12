//Modelamos la clase de bicicleta
public class Bicicleta {
	//Definen el estado del objeto
	// Definimos los atributos
	private char color; // r = rojo; a = amarillo; n = negro;
	private byte cantidadDePiniones = 5;
	private byte rodado;
	private char tipo; // m = mountain bike; r = ruta;
	private byte cadencia;
	private float velocidad;
	private byte pinionActual = 1;

	//Realizamos un constructor de metodos. No retorna nada, y se llama siempre igual que la clase
	public Bicicleta()

	// Definimos el comportamiento
	public float calcularVelocidad(){
		//Conversion Implicita
		velocidad = cadencia / pinionActual;
		return velocidad;
	}	

	public void subirPinion(){
		pinionActual++;
	}

	public void bajarPinion(){
		pinionActual--;
	}

	public void establecerCadencia(byte cadenciaDeseada){
		cadencia = cadenciaDeseada;
	}

	public byte verPinionActual(){
		return pinionActual;
	}
}