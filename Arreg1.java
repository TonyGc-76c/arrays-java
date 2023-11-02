public class Arreg1 {
	public static void main(String[] args) {
		// El código está creando un array de números flotantes con los valores 90, 89, 78, 70, 89
		// Lista los números dentro del array de mayor a menor valor para sumarlos al final.
		float[] p = { 90, 89, 78, 70, 89, };
		int i;
		float a = 0;
		String cad = "";

		for (i = 0; i < 5; i++) {
			cad = cad + (i + 1) + "  =>  " + p[i] + "\n";
			/*
			 * a=p[0]+p[1]+p[2]+p[3]+p[4]; // Forma Tecnica
			 */
			a = a + p[i]; // Forma automatica
		}

		System.out.println(cad);
		System.out.println("Total: "+a);
	}
}