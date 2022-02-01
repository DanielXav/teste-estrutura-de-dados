package br.com.springboot.airbnbanalyses.sort;

public class MergeSort {

	public static void mergeSort(int[] array, int[] auxArray,int[] array2,int[] auxArray2, int[] array3, int[] auxArray3, int[] array4, int[] auxArray4,
			int[] array5, int[] auxArray5,int[] array6, int[] auxArray6,int[] array7, int[] auxArray7,String[] array8, String[] auxArray8,String[] array9, String[] auxArray9,
			String[] array10, String[] auxArray10,String[] array11, String[] auxArray11,String[] array12, String[] auxArray12,String[] array13, String[] auxArray13,
			double[] array14, double[] auxArray14,double[] array15, double[] auxArray15,int ini, int fim) {
		if(ini<fim) {
			int meio= (ini+fim)/2;
			mergeSort(array,auxArray,array2,auxArray2,array3,auxArray3,array4,auxArray4,array5,auxArray5,array6,auxArray6,
					array7,auxArray7,array8,auxArray8,array9,auxArray9,array10,auxArray10,array11,auxArray11,array12,auxArray12,
					array13,auxArray13,array14,auxArray14,array15,auxArray15,ini,meio);
			mergeSort(array,auxArray,array2,auxArray2,array3,auxArray3,array4,auxArray4,array5,auxArray5,array6,auxArray6,
					array7,auxArray7,array8,auxArray8,array9,auxArray9,array10,auxArray10,array11,auxArray11,array12,auxArray12,
					array13,auxArray13,array14,auxArray14,array15,auxArray15,meio+1,fim);
			intercalar(array,auxArray,array2,auxArray2,array3,auxArray3,array4,auxArray4,array5,auxArray5,array6,auxArray6,
					array7,auxArray7,array8,auxArray8,array9,auxArray9,array10,auxArray10,array11,auxArray11,array12,auxArray12,
					array13,auxArray13,array14,auxArray14,array15,auxArray15,ini,meio,fim);
		
		}
	}
	
	public static void intercalar(int[] array, int[] auxArray,int[] array2,int[] auxArray2, int[] array3, int[] auxArray3, int[] array4, int[] auxArray4,
			int[] array5, int[] auxArray5,int[] array6, int[] auxArray6,int[] array7, int[] auxArray7,String[] array8, String[] auxArray8,String[] array9, String[] auxArray9,
			String[] array10, String[] auxArray10,String[] array11, String[] auxArray11,String[] array12, String[] auxArray12,String[] array13, String[] auxArray13,
			double[] array14, double[] auxArray14,double[] array15, double[] auxArray15, int ini, int meio, int fim) {
	
			for(int k=ini;k<=fim;k++) {
				auxArray[k]=array[k];
				auxArray2[k]=array2[k];
				auxArray3[k]=array3[k];
				auxArray4[k]=array4[k];
				auxArray5[k]=array5[k];
				auxArray6[k]=array6[k];
				auxArray7[k]=array7[k];
				auxArray8[k]=array8[k];
				auxArray9[k]=array9[k];
				auxArray10[k]=array10[k];
				auxArray11[k]=array11[k];
				auxArray12[k]=array12[k];
				auxArray13[k]=array13[k];
				auxArray14[k]=array14[k];
				auxArray15[k]=array15[k];
			}
			
			int i=ini;
			int j=meio+1;
				for(int k=ini;k<=fim;k++) {
					if(i>meio) {
						array[k]=auxArray[j];
						array2[k]=auxArray2[j];
						array3[k]=auxArray3[j];
						array4[k]=auxArray4[j];
						array5[k]=auxArray5[j];
						array6[k]=auxArray6[j];
						array7[k]=auxArray7[j];
						array8[k]=auxArray8[j];
						array9[k]=auxArray9[j];
						array10[k]=auxArray10[j];
						array11[k]=auxArray11[j];
						array12[k]=auxArray12[j];
						array13[k]=auxArray13[j];
						array14[k]=auxArray14[j];
						array15[k]=auxArray15[j];
						j++;
					}
					else if(j>fim) {
						array[k]= auxArray[i];
						array2[k]=auxArray2[i];
						array3[k]=auxArray3[i];
						array4[k]=auxArray4[i];
						array5[k]=auxArray5[i];
						array6[k]=auxArray6[i];
						array7[k]=auxArray7[i];
						array8[k]=auxArray8[i];
						array9[k]=auxArray9[i];
						array10[k]=auxArray10[i];
						array11[k]=auxArray11[i];
						array12[k]=auxArray12[i];
						array13[k]=auxArray13[i];
						array14[k]=auxArray14[i];
						array15[k]=auxArray15[i];
						i++;
					}
					else if(auxArray[i]<auxArray[j]) {
						array[k]=auxArray[i];
						array2[k]=auxArray2[i];
						array3[k]=auxArray3[i];
						array4[k]=auxArray4[i];
						array5[k]=auxArray5[i];
						array6[k]=auxArray6[i];
						array7[k]=auxArray7[i];
						array8[k]=auxArray8[i];
						array9[k]=auxArray9[i];
						array10[k]=auxArray10[i];
						array11[k]=auxArray11[i];
						array12[k]=auxArray12[i];
						array13[k]=auxArray13[i];
						array14[k]=auxArray14[i];
						array15[k]=auxArray15[i];
						i++;
					}
					else {
						array[k]=auxArray[j];
						array2[k]=auxArray2[j];
						array3[k]=auxArray3[j];
						array4[k]=auxArray4[j];
						array5[k]=auxArray5[j];
						array6[k]=auxArray6[j];
						array7[k]=auxArray7[j];
						array8[k]=auxArray8[j];
						array9[k]=auxArray9[j];
						array10[k]=auxArray10[j];
						array11[k]=auxArray11[j];
						array12[k]=auxArray12[j];
						array13[k]=auxArray13[j];
						array14[k]=auxArray14[j];
						array15[k]=auxArray15[j];
						j++;
					}
				}
		}
	}

