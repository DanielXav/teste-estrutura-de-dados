package br.com.springboot.airbnbanalyses.sort;

public class QuickSort {

	public static void quickSort(int[] array, int[] array2, int[] array3, int[] array4, int[] array5, int[] array6, int[] array7, int[] array8,
			String[] array9, String[] array10, String[] array11, String[] array12, String[] array13, String[] array14, double[] array15, double[] array16, int a, int b) {
		
		if (a < b) {
			int q = particiona(array, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15, array16, a, b);
			quickSort(array, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15, array16, a, q - 1);
			quickSort(array, array2, array3, array4, array5, array6, array7, array8, array9, array10, array11, array12, array13, array14, array15, array16, q + 1, b);
		}
	}

	public static int particiona(int[] array, int[] array2, int[] array3, int[] array4, int[] array5, int[] array6, int[] array7, int[] array8,
			String[] array9, String[] array10, String[] array11, String[] array12, String[] array13, String[] array14, double[] array15, double[] array16, int p, int r) {
		int i = p - 1;
		int x = array[r];
		int aux;
		String auxStr;
		double auxDouble;

		for (int j = p; j < r; j++) {
			if (array[j] <= x) { 
				i++;

				aux = array[i];
				array[i] = array[j];
				array[j] = aux;
				
				aux = array2[i];
				array2[i] = array2[j];
				array2[j] = aux;
				
				aux = array3[i];
				array3[i] = array3[j];
				array3[j] = aux;
				
				aux = array4[i];
				array4[i] = array4[j];
				array4[j] = aux;
				
				aux = array5[i];
				array5[i] = array5[j];
				array5[j] = aux;
				
				aux = array6[i];
				array6[i] = array6[j];
				array6[j] = aux;
				
				aux = array7[i];
				array7[i] = array7[j];
				array7[j] = aux;
				
				aux = array8[i];
				array8[i] = array8[j];
				array8[j] = aux;
				
				auxStr = array9[i];
				array9[i] = array9[j];
				array9[j] = auxStr;
				
				auxStr = array10[i];
				array10[i] = array10[j];
				array10[j] = auxStr;
				
				auxStr = array11[i];
				array11[i] = array11[j];
				array11[j] = auxStr;
				
				auxStr = array12[i];
				array12[i] = array12[j];
				array12[j] = auxStr;
				
				auxStr = array13[i];
				array13[i] = array13[j];
				array13[j] = auxStr;
				
				auxStr = array14[i];
				array14[i] = array14[j];
				array14[j] = auxStr;
				
				auxDouble = array15[i];
				array15[i] = array15[j];
				array15[j] = auxDouble;
				
				auxDouble = array16[i];
				array16[i] = array16[j];
				array16[j] = auxDouble;

			}

		}
		
		aux = array[i + 1];
		array[i + 1] = array[r];
		array[r] = aux;

		aux = array2[i + 1];
		array2[i + 1] = array2[r];
		array2[r] = aux;
		
		aux = array3[i + 1];
		array3[i + 1] = array3[r];
		array3[r] = aux;
		
		aux = array4[i + 1];
		array4[i + 1] = array4[r];
		array4[r] = aux;
		
		aux = array5[i + 1];
		array5[i + 1] = array5[r];
		array5[r] = aux;
		
		aux = array6[i + 1];
		array6[i + 1] = array6[r];
		array6[r] = aux;
		
		aux = array7[i + 1];
		array7[i + 1] = array7[r];
		array7[r] = aux;
		
		aux = array8[i + 1];
		array8[i + 1] = array8[r];
		array8[r] = aux;
		
		auxStr = array9[i + 1];
		array9[i + 1] = array9[r];
		array9[r] = auxStr;
		
		auxStr = array10[i + 1];
		array10[i + 1] = array10[r];
		array10[r] = auxStr;
		
		auxStr = array11[i + 1];
		array11[i + 1] = array11[r];
		array11[r] = auxStr;
		
		auxStr = array12[i + 1];
		array12[i + 1] = array12[r];
		array12[r] = auxStr;
		
		auxStr = array13[i + 1];
		array13[i + 1] = array13[r];
		array13[r] = auxStr;
		
		auxStr = array14[i + 1];
		array14[i + 1] = array14[r];
		array14[r] = auxStr;
		
		auxDouble = array15[i + 1];
		array15[i + 1] = array15[r];
		array15[r] = auxDouble;
		
		auxDouble = array16[i + 1];
		array16[i + 1] = array16[r];
		array16[r] = auxDouble;

		return i + 1;

	}
}
