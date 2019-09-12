public class Rectangulo{
	private float base;
	private float altura;

	public void Rectangulo(float base, float altura){
		this.base = base;
		this.altura	= altura;
	}

	public void setBase(float base){
		if (base > 0) {
		this.base = base;	
		}
	}

	public float getBase(){
		return base;
	}

	public void setAltura(float altura){
		if (altura > 0) {
		this.altura = altura;	
		}
	}

	public float getAltura(){
		return altura;
	}

	//calcular perimetro
	public float calcularPerimetro(){
		float perimetro;
		perimetro = (this.base + this.altura)*2;
		return perimetro;
	}

	//calcular area
	public float calcularArea(){
		float area;
		area = this.base * this.altura;
		return area;
	}

}
