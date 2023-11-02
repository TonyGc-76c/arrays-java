import java.util.Arrays; // Esta libreria es para ordenar tus valores internos de menor a mayor

public class ArregAleat2 {
	public static void main(String[] args) {
		// Se declaran variables
		int ii;
		float s = 0;
		float[] x = new float[20]; // Se da un valor al almacenamiento del arreglo

		// Este bloque de código genera números aleatorios 
		// de entre 1 y 1000 y los almacena en la matriz "x".
		double val;
		for (ii = 0; ii < x.length; ii++) {
			val = Math.random() * 1000 + 1;
			x[ii] = (float) val;
		}

		// Se imprime los elementos de la matriz `x` junto con sus índices. Comienza imprimiendo la
		// cadena "Arreglo" y luego itera sobre la matriz usando un bucle for. Dentro del bucle, imprime el
		// índice `ii` y luego el valor de `x[ii]`. Esto mostrará cada elemento de la matriz
		// junto con su índice correspondiente.
		System.out.println("Arreglo");
		for (ii = 0; ii < x.length; ii++) {
			System.out.println((ii+1) + ".- " + x[ii]);
		}

		// Se agregan 50 a cada elemento de la matriz `x` y 
		// luego imprime los valores actualizados.
		System.out.println("\n  +50");
		for (ii = 0; ii < x.length; ii++) {
			x[ii] = x[ii] + 50;
			System.out.println((ii+1) + ".- " + x[ii]);
		}

		// Se ordenan los elementos de la matriz `x` en orden ascendente utilizando el
		// método `Arrays.sort()`. Después de ordenar, agrega 50 a cada elemento de la matriz y luego imprime
		// los valores actualizados. También imprime el valor más pequeño de la matriz (`x[0]`) y el valor
		// más grande de la matriz (`x[x.length - 1]`).
		System.out.println("\n ordenado +50");
		Arrays.sort(x);
		for (ii = 0; ii < x.length; ii++) {
			x[ii] = x[ii] + 50;
			System.out.println((ii+1) + ".- " + x[ii]);
		}
		System.out.println("Valor menor " + x[0]);
		System.out.println("Valor mayor " + x[x.length - 1]);

		// Se calcula la suma de todos los elementos en la
		// matriz `x` y luego imprime el resultado.
		for (ii = 0; ii < x.length; ii++) {
			s += x[ii];
		}
		System.out.println("Sumatoria: " + s);

		// Buscamos números primos en la matriz "x" y los imprime junto con sus índices.
		System.out.println("\n numeros primos ");
		int a;
		int div = 0;
		float cont = 0;
		for (ii = 0; ii < x.length; ii++) {
			for (a = 1; a <= x[ii]; a++) {
				if (x[ii] % a == 0) {
					div++;
				}
			}
			if (div == 2) {
				System.out.println((ii+1) + ".- " + x[ii]);
				cont++;
			}
		}
		System.out.println(cont);

		// Calculamos la suma de los elementos de la matriz `x` de los números primos.
		float ss = 0;
		for (ii = 0; ii < x.length; ii++) {
			cont = ss;
			cont += x[ii];
		}
		System.out.println("Sumatoria arreglo primos: " + ss);

		// Se crea una nueva matriz `z` y se inicializa con los elementos de la matriz `x`
		// en orden inverso. Luego imprime el índice y el valor de cada elemento en la matriz `z` usando un
		// bucle for. Esto mostrará los elementos de la matriz `z` en orden inverso.
		System.out.println("\n acomodado inverso");
		float[] z = { x[19], x[18], x[17], x[16], x[15], x[14], x[13], x[12], x[11], x[10], x[9], x[8], x[7], x[6],
				x[5], x[4], x[3], x[2], x[1], x[0] };
		for (ii = 0; ii < z.length; ii++) {
			System.out.println((ii+1) + ".- " + z[ii]);
		}
	}
}