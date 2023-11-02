import java.util.Arrays; 

public class Arregaleat {
    public static void main(String[] args) {
        int i;
        int k;
        int j;
        float[] x = new float[100]; // New para tamaño del arreglo

        // Un arreglo es conjunto de valores del mismo tipo que utilizan un mismo nombre
        // de variable, para diferenciar cada uno de los elemntos se utiliza un valor
        // del indice dentro del corchete, siempre iniciara por el elemento cero

        double val;

        for (i = 0; i < x.length; i++) // Almacena valores aleatorios entre 1 y 100
        {
            val = Math.random() * 500 + 1;
            x[i] = (float) val; // Transforma de double a float
        }
        for (k = 0; k < x.length; k++) // Muestra los valores almacenados en x (Primera Fase)
        {
            /* System.out.println(k+" "+x[k]); */
        }
        for (k = 0; k < x.length; k++) // Suma 50 a los numeros aleatorios del arreglo
        {
            x[k] = x[k] + 50;
        }
        System.out.println("ARREGLO ALEATORIO\n");
        for (j = 0; j < x.length; j++) // Imprime el resultado de la suma (Segunda Fase)
        {
            System.out.println(j+1 + " => " + x[j]);
        }
        System.out.println("\nARREGLO DE MENOR A MAYOR\n");
        Arrays.sort(x); // Ordena valores del arreglo x de menor a mayor
        for (j = 0; j < x.length; j++) // Imprime los valores ordenados (Tercera fase)
        {
            System.out.println(j+1 + " => " + x[j]);
        }
        System.out.println("\nEl valor menor " + x[0]);
        System.out.println("El valor menor " + x[x.length - 1]);
    } 
}