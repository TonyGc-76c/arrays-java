public class Arregmat {
	public static void main(String[] args) {
		int[][] m = { { 1, 2, 3, 4 }, { 5, 6, 7, 8 }, { 9, 10, 11, 12 } };
		int i;// Indice de filas
		int j; // indice de columnas

		// El código utiliza bucles for anidados para iterar a través de una matriz bidimensional `m` e
		// imprimir sus elementos.
		for (i = 0; i < 3; i++) {
			for (j = 0; j < 4; j++) {
				// Usa %3d para que se reserve un ancho de 3 caracteres para cada número.
				System.out.printf("%3d", m[i][j]);
			}
			System.out.println(); // Salto de línea al final de cada fila.
		}
	}
}