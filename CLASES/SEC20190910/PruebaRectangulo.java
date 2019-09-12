public class PruebaRectangulo{
	
	public static void main(String args[]) {
		
	Rectangulo figuraUno = new Rectangulo();
	Rectangulo figuraDos = new Rectangulo();

	float baseUno = 2, alturaUno = 5;
	float baseDos = 3, alturaDos = 6;


	figuraUno.setBase(baseUno);
	if (figuraUno.getBase() != baseUno){
		System.out.println("El valor de la base no es valido");
	}
	figuraUno.setAltura(alturaUno);
	if (figuraUno.getAltura() != alturaUno){
		System.out.println("El valor de la altura no es valido");
	}

	figuraDos.setBase(baseDos);
	if (figuraDos.getBase() != baseDos){
		System.out.println("El valor de la base no es valido");
	}
	figuraDos.setAltura(alturaDos);
	if (figuraDos.getAltura() != alturaDos){
		System.out.println("El valor de la altura no es valido");
	}

	System.out.println("\nLa Altura de figura 1 es: " + figuraUno.getAltura());
	System.out.println("La Base de figura 1 es: " + figuraUno.getBase());

	System.out.println("El Perimetro de figura 1 es: " + figuraUno.calcularPerimetro());
	System.out.println("El Area de figura 1 es: " + figuraUno.calcularArea());

	System.out.println("\nLa Altura de figura 2 es: " + figuraDos.getAltura());
	System.out.println("La Base de figura 2 es: " + figuraDos.getBase());

	System.out.println("El Perimetro de figura 2 es: " + figuraDos.calcularPerimetro());
	System.out.println("El Area de figura 2 es: " + figuraDos.calcularArea());
	
	if (figuraUno.calcularArea() == figuraDos.calcularArea()) {
			System.out.println("\nLos rectangulos son Iguales.");	
		}else {
			if (figuraUno.calcularArea() > figuraDos.calcularArea()){
				System.out.println("\nEl Rectangulo 1 es mayor al rectangulo 2.");
			} else{
				System.out.println("\nEl Rectangulo 2 es mayor al rectangulo 1.");
			}
		}
	}
}