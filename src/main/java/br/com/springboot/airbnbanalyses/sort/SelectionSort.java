package br.com.springboot.airbnbanalyses.sort;

public class SelectionSort {

	public static void SelectSort(int array[], int array2[], int array3[], int array4[], int array5[], int array6[], int array7[], String array8[],
    		String array9[], String array10[], String array11[], String array12[], String array13[], double array14[], double array15[]) {
		
		for (int j = 0; j < array.length; j++) {
			int j_menor = j;
				for (int k = j + 1; k < array.length; k++){
					if (array[k] < array[j_menor])
						j_menor = k;
					}
				
				int key1 = array[j];
				int key2 = array2[j];
				int key3 = array3[j];
				int key4 = array4[j];
				int key5 = array5[j];
				int key6 = array6[j];
				int key7 = array7[j];
				String key8 = array8[j];
				String key9 = array9[j];
				String key10 = array10[j];
				String key11 = array11[j];
				String key12 = array12[j];
				String key13 = array13[j];
				double key14 = array14[j];
				double key15 = array15[j];
				
				array[j]=array[j_menor];
				array2[j]=array2[j_menor];
				array3[j]=array3[j_menor];
				array4[j]=array4[j_menor];
				array5[j]=array5[j_menor];
				array6[j]=array6[j_menor];
				array7[j]=array7[j_menor];
				array8[j]=array8[j_menor];
				array9[j]=array9[j_menor];
				array10[j]=array10[j_menor];
				array11[j]=array11[j_menor];
				array12[j]=array12[j_menor];
				array13[j]=array13[j_menor];
				array14[j]=array14[j_menor];
				array15[j]=array15[j_menor];
				
				array[j_menor]=key1;
				array2[j_menor]=key2;
				array3[j_menor]=key3;
				array4[j_menor]=key4;
				array5[j_menor]=key5;
				array6[j_menor]=key6;
				array7[j_menor]=key7;
				array8[j_menor]=key8;
				array9[j_menor]=key9;
				array10[j_menor]=key10;
				array11[j_menor]=key11;
				array12[j_menor]=key12;
				array13[j_menor]=key13;
				array14[j_menor]=key14;
				array15[j_menor]=key15;
             		
	  	}
	}
}
