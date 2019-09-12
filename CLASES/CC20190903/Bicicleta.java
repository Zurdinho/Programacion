//Modelamos la clase de bicicleta
public class Bicicleta {
	//Definen el estado del objeto
	// Definimos los atributos
	private char color; // r = rojo; a = amarillo; n = negro;
	private byte cantidadDePiniones;
	private byte rodado;
	private char tipo; // m = mountain bike; r = ruta;
	private byte cadencia;
	private float velocidad;
	private byte pinionActual;

	//Realizamos un constructor de metodos. No retorna nada, y se llama siempre igual que la clase
	public Bicicleta(){
		color = 'N';
		cantidadDePiniones = (byte)5;
		rodado = (byte)28;
		tipo = 'M';
		cadencia = (byte)0;
		velocidad = (float)0.0;
		pinionActual = (byte)1;

	}

	public Bicicleta(char color){
		this.pinionActual= (byte)1;
		this.color = color;
	}

	// Definimos el comportamiento
	public void calcularVelocidad(){
		//Conversion Implicita
		velocidad = cadencia / pinionActual;
	}	

	public float verLaVelocidad(){
		calcularVelocidad();
		return velocidad;	
	}

	public void subirPinion(){
		pinionActual++;
	}

	public void bajarPinion(){
		pinionActual--;
	}

	public void establecerCadencia(byte cadencia){
		this.cadencia = cadencia;
	}

	public byte verPinionActual(){
		color='R';
		return pinionActual;
	}

	public char verColor(){
		return color;
	}

	public char verTipo(){
		return tipo;
	}

	public void pintar(char color){
		this.color = color;
	}

	public char imprimirColor(){
		return color;
	}

}