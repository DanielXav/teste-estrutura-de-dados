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
	
	public static void mergeSortString(String[] arrayName, String[] auxArrayName, Integer[] arrayPrice, Integer[] auxArrayPrice, Integer[] arrayId, Integer[] auxArrayId, Integer[] arrayHostId, Integer[] auxArrayHostId, Integer[] arrayMinimumNights, Integer[] auxArrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] auxArrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] auxArrayCalculatedHostListingsCount, Integer[] arrayAvailability365 , Integer[] auxArrayAvailability365 ,
            String[] arrayHostName, String[] auxArrayHostName, String[] arrayNeighbourhoodGroup, String[] auxArrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] auxArrayNeighbourhood, String[] arrayRoomType, String[] auxArrayRoomType, String[] arrayLastReview, String[] auxArrayLastReview, Double[] arrayLatitude, Double[] auxArrayLatitude, Double[] arrayLongitude, Double[] auxArrayLongitude, int ini, int fim) {
		if(ini<fim) {
			int meio= (ini+fim)/2;
			mergeSortString(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId, arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, arrayAvailability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup, auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType, arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, ini,meio);
			mergeSortString(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId, arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, arrayAvailability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup, auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType, arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,meio+1,fim);
			intercarlaStrings(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId, arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount, arrayAvailability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup, auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood, arrayRoomType, auxArrayRoomType, arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude,ini,meio,fim);
		
		}
	}
	public static void intercarlaStrings(String[] arrayName, String[] auxArrayName, Integer[] arrayPrice, Integer[] auxArrayPrice, Integer[] arrayId, Integer[] auxArrayId, Integer[] arrayHostId, Integer[] auxArrayHostId, Integer[] arrayMinimumNights, Integer[] auxArrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] auxArrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] auxArrayCalculatedHostListingsCount, Integer[] arrayAvailability365 , Integer[] auxArrayAvailability365 ,
            String[] arrayHostName, String[] auxArrayHostName, String[] arrayNeighbourhoodGroup, String[] auxArrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] auxArrayNeighbourhood, String[] arrayRoomType, String[] auxArrayRoomType, String[] arrayLastReview, String[] auxArrayLastReview, Double[] arrayLatitude, Double[] auxArrayLatitude, Double[] arrayLongitude, Double[] auxArrayLongitude, int ini, int meio, int fim) {

		for(int k=ini;k<=fim;k++) {
			auxArrayName[k]=arrayName[k];
			auxArrayPrice[k]=arrayPrice[k];
			auxArrayId[k]=arrayId[k];
			auxArrayHostId[k]=arrayHostId[k];
			auxArrayMinimumNights[k]=arrayMinimumNights[k];
			auxArrayNumberOfReviews[k]=arrayNumberOfReviews[k];
			auxArrayCalculatedHostListingsCount[k]=arrayCalculatedHostListingsCount[k];
			auxArrayAvailability365[k]=arrayAvailability365[k];
			auxArrayHostName[k]=arrayHostName[k];
			auxArrayNeighbourhoodGroup[k]=arrayNeighbourhoodGroup[k];
			auxArrayNeighbourhood[k]=arrayNeighbourhood[k];
			auxArrayRoomType[k]=arrayRoomType[k];
			auxArrayLastReview[k]=arrayLastReview[k];
			auxArrayLatitude[k]=arrayLatitude[k];
			auxArrayLongitude[k]=arrayLongitude[k];
			
		}
		
		int i=ini;
		int j=meio+1;
			for(int k=ini;k<=fim;k++) {
				if(i>meio) {
					
					arrayName[k]=auxArrayName[j];
					arrayPrice[k]=auxArrayId[j];
					arrayId[k]=auxArrayPrice[j];
					arrayHostId[k]=auxArrayHostId[j];
					arrayMinimumNights[k]=auxArrayMinimumNights[j];
					arrayNumberOfReviews[k]=auxArrayNumberOfReviews[j];
					arrayCalculatedHostListingsCount[k]=auxArrayCalculatedHostListingsCount[j];
					arrayAvailability365[k]=auxArrayAvailability365[j];
					arrayHostName[k]=auxArrayHostName[j];
					arrayNeighbourhoodGroup[k]=auxArrayNeighbourhoodGroup[j];
					arrayNeighbourhood[k]=auxArrayNeighbourhood[j];
					arrayRoomType[k]=auxArrayRoomType[j];
					arrayLastReview[k]=auxArrayLastReview[j];
					arrayLatitude[k]=auxArrayLatitude[j];
					arrayLongitude[k]=auxArrayLongitude[j];
					j++;
				}
				else if(j>fim) {
					arrayName[k]=auxArrayName[i];
					arrayPrice[k]=auxArrayId[i];
					arrayId[k]=auxArrayPrice[i];
					arrayHostId[k]=auxArrayHostId[i];
					arrayMinimumNights[k]=auxArrayMinimumNights[i];
					arrayNumberOfReviews[k]=auxArrayNumberOfReviews[i];
					arrayCalculatedHostListingsCount[k]=auxArrayCalculatedHostListingsCount[i];
					arrayAvailability365[k]=auxArrayAvailability365[i];
					arrayHostName[k]=auxArrayHostName[i];
					arrayNeighbourhoodGroup[k]=auxArrayNeighbourhoodGroup[i];
					arrayNeighbourhood[k]=auxArrayNeighbourhood[i];
					arrayRoomType[k]=auxArrayRoomType[i];
					arrayLastReview[k]=auxArrayLastReview[i];
					arrayLatitude[k]=auxArrayLatitude[i];
					arrayLongitude[k]=auxArrayLongitude[i];
					i++;
				}
				else if(auxArrayName[i].compareTo(auxArrayName[j])<0) {
					arrayName[k]=auxArrayName[i];
					arrayPrice[k]=auxArrayId[i];
					arrayId[k]=auxArrayPrice[i];
					arrayHostId[k]=auxArrayHostId[i];
					arrayMinimumNights[k]=auxArrayMinimumNights[i];
					arrayNumberOfReviews[k]=auxArrayNumberOfReviews[i];
					arrayCalculatedHostListingsCount[k]=auxArrayCalculatedHostListingsCount[i];
					arrayAvailability365[k]=auxArrayAvailability365[i];
					arrayHostName[k]=auxArrayHostName[i];
					arrayNeighbourhoodGroup[k]=auxArrayNeighbourhoodGroup[i];
					arrayNeighbourhood[k]=auxArrayNeighbourhood[i];
					arrayRoomType[k]=auxArrayRoomType[i];
					arrayLastReview[k]=auxArrayLastReview[i];
					arrayLatitude[k]=auxArrayLatitude[i];
					arrayLongitude[k]=auxArrayLongitude[i];
					i++;
				}
				else {
					arrayName[k]=auxArrayName[j];
					arrayPrice[k]=auxArrayId[j];
					arrayId[k]=auxArrayPrice[j];
					arrayHostId[k]=auxArrayHostId[j];
					arrayMinimumNights[k]=auxArrayMinimumNights[j];
					arrayNumberOfReviews[k]=auxArrayNumberOfReviews[j];
					arrayCalculatedHostListingsCount[k]=auxArrayCalculatedHostListingsCount[j];
					arrayAvailability365[k]=auxArrayAvailability365[j];
					arrayHostName[k]=auxArrayHostName[j];
					arrayNeighbourhoodGroup[k]=auxArrayNeighbourhoodGroup[j];
					arrayNeighbourhood[k]=auxArrayNeighbourhood[j];
					arrayRoomType[k]=auxArrayRoomType[j];
					arrayLastReview[k]=auxArrayLastReview[j];
					arrayLatitude[k]=auxArrayLatitude[j];
					arrayLongitude[k]=auxArrayLongitude[j];
					j++;
				}
			}
	}
}
	

