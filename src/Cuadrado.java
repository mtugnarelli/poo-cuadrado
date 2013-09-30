
class Cuadrado {

	private double lado = 1.0;
	
	/*
	 * pre : ladoDelCuadrado es mayor a 0.
	 * post: inicializa el Cuadrado con la longitud de lado indicada como parámetro por ladoDelCuadrado.
	 */
	public Cuadrado(double ladoDelCuadrado) {
		
		cambiarLado(ladoDelCuadrado);
	}
	
	/*
	 * pre : nuevoLado es mayor a 0.
	 * post: cambia las dimensiones del Cuadrado para que la longitud de sus
	 *       4 lados sea nuevoLado.
	 */
	public void cambiarLado(double nuevoLado) {
		
		if (esLadoValido(nuevoLado)) {
			
			lado = nuevoLado;
		}
	}
	
	/*
	 * post: indica si ladoAValidar es una longitud de lado válida para el Cuadrado.
	 */
	private boolean esLadoValido(double ladoAValidar) {
		
		return ladoAValidar > 0;
	}
	
	/*
	 * post: devuelve la longitud del lado.
	 */
	public double medirLado() {
		
		return lado;
	}
	
	/*
	 * post: devuelve la longitud del perímetro.
	 */
	public double medirPerimetro() {
		
		return lado * 4;
	}
	
	/*
	 * pre : nuevoPerimetro es mayor a 0.
	 * post: cambia las dimensiones del Cuadrado para que la longitud de su
	 *       perímetro sea nuevoPerimetro.
	 */
	public void cambiarPerimetro(double nuevoPerimetro) {
		
		cambiarLado(nuevoPerimetro / 4);
	}
	
	/*
	 * post: devuelve el área encerrado por el Cuadrado.
	 */
	public double medirArea() {
		
		return lado * lado;
	}
	
	/*
	 * pre : nuevoArea es mayor a 0.
	 * post: cambia las dimensiones del Cuadrado para que el área
	 *       encierra sea nuevoArea.
	 */
	public void cambiarArea(double nuevoArea) {
		
		cambiarLado(Math.sqrt(nuevoArea));
	}
	
	/*
	 * post : devuelve la longitud de la diagonal del Cuadrado.
	 */
	public double medirDiagonal() {
		
		return Math.sqrt(2 * Math.pow(lado, 2));
	}
	
	/*
	 * pre : nuevaDiagonal es mayor a 0.
	 * post: cambia las dimensiones del Cuadrado para que la
	 *       longitud de su diagonal sea nuevaDiagonal.
	 */
	public void cambiarDiagonal(double nuevaDiagonal) {
		
		cambiarLado(Math.sqrt(Math.pow(nuevaDiagonal, 2) / 2));
	}
}
