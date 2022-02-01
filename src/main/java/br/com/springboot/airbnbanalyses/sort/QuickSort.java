package br.com.springboot.airbnbanalyses.sort;

public class QuickSort {

	public static void quickSort(int[] array, int a, int b) {
		
		if (a < b) {
			int q = particiona(array, a, b);
			quickSort(array, a, q - 1);
			quickSort(array, q + 1, b);
		}
	}

	public static int particiona(int[] array, int p, int r) {
		int i = p - 1;
		int x = array[r];
		int aux;
		//String auxStr;

		for (int j = p; j < r; j++) {
			if (array[j] <= x) { 
				i++;

				aux = array[i];
				array[i] = array[j];
				array[j] = aux;

			}

		}
		
		aux = array[i + 1];
		array[i + 1] = array[r];
		array[r] = aux;

		return i + 1;

	}
}
