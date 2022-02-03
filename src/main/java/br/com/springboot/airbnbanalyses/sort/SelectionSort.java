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
	
	public static void SelectSortInverse(int array[], int array2[], int array3[], int array4[], int array5[], int array6[], int array7[], String array8[],
    		String array9[], String array10[], String array11[], String array12[], String array13[], double array14[], double array15[]) {
		
		for (int j = 0; j < array.length; j++) {
			int j_maior = j;
				for (int k = j + 1; k < array.length; k++){
					if (array[k] > array[j_maior])
						j_maior = k;
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
				
				array[j]=array[j_maior];
				array2[j]=array2[j_maior];
				array3[j]=array3[j_maior];
				array4[j]=array4[j_maior];
				array5[j]=array5[j_maior];
				array6[j]=array6[j_maior];
				array7[j]=array7[j_maior];
				array8[j]=array8[j_maior];
				array9[j]=array9[j_maior];
				array10[j]=array10[j_maior];
				array11[j]=array11[j_maior];
				array12[j]=array12[j_maior];
				array13[j]=array13[j_maior];
				array14[j]=array14[j_maior];
				array15[j]=array15[j_maior];
				
				array[j_maior]=key1;
				array2[j_maior]=key2;
				array3[j_maior]=key3;
				array4[j_maior]=key4;
				array5[j_maior]=key5;
				array6[j_maior]=key6;
				array7[j_maior]=key7;
				array8[j_maior]=key8;
				array9[j_maior]=key9;
				array10[j_maior]=key10;
				array11[j_maior]=key11;
				array12[j_maior]=key12;
				array13[j_maior]=key13;
				array14[j_maior]=key14;
				array15[j_maior]=key15;
             		
	  	}
	}
	
	public static void SelectionString(String[] arrayName, Integer[] arrayPrice, Integer[] arrayId, Integer[] arrayHostId, Integer[] arrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] arrayAvailability365 ,
            String[] arrayHostName, String[] arrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] arrayRoomType, String[] arrayLastReview, Double[] arrayLatitude, Double[] arrayLongitude){
		
		for (int j = 0; j < arrayName.length; j++) {
			int j_menor = j;
				for (int k = j + 1; k < arrayName.length; k++){
					if (arrayName[k].compareTo(arrayName[j_menor])<0)
						j_menor = k;
					}
				
				String key1 = arrayName[j];
				int key2 = arrayPrice[j];
				int key3 = arrayId[j];
				int key4 = arrayHostId[j];
				int key5 = arrayMinimumNights[j];
				int key6 = arrayNumberOfReviews[j];
				int key7 = arrayCalculatedHostListingsCount[j];
				int key8 = arrayAvailability365[j];
	            String key9 = arrayHostName[j];
	            String key10 = arrayNeighbourhoodGroup[j];
	            String key11 = arrayNeighbourhood[j];
	            String key12 = arrayRoomType[j];
	            String key13 = arrayLastReview[j];
	            double key14 = arrayLatitude[j];
	            double key15 = arrayLongitude[j];
//	            double key16 = arrayReviewsPerMonth[j];
				
	            arrayName[j] = arrayName[j_menor];
	            arrayPrice[j]=arrayPrice[j_menor];
	            arrayId[j]=arrayId[j_menor];
	            arrayHostId[j]=arrayHostId[j_menor];
	            arrayMinimumNights[j]=arrayMinimumNights[j_menor];
	            arrayNumberOfReviews[j]=arrayNumberOfReviews[j_menor];
	            arrayCalculatedHostListingsCount[j]=arrayCalculatedHostListingsCount[j_menor];
	            arrayAvailability365[j]=arrayAvailability365[j_menor];
	            arrayHostName[j]=arrayHostName[j_menor];
	            arrayNeighbourhoodGroup[j]=arrayNeighbourhoodGroup[j_menor];
	            arrayNeighbourhood[j]=arrayNeighbourhood[j_menor];
	            arrayRoomType[j]=arrayRoomType[j_menor];
	            arrayLastReview[j]=arrayLastReview[j_menor];
	            arrayLatitude[j]=arrayLatitude[j_menor];
	            arrayLongitude[j]=arrayLongitude[j_menor];
//	            arrayReviewsPerMonth[j]=arrayReviewsPerMonth[j_menor];
				
				arrayName[j_menor]=key1;
				arrayPrice[j_menor]=key2;
	            arrayId[j_menor]=key3;
	            arrayHostId[j_menor]=key4;
	            arrayMinimumNights[j_menor]=key5;
	            arrayNumberOfReviews[j_menor]=key6;
	            arrayCalculatedHostListingsCount[j_menor]=key7;
	            arrayAvailability365[j_menor]=key8;
	            arrayHostName[j_menor]=key9;
	            arrayNeighbourhoodGroup[j_menor]=key10;
	            arrayNeighbourhood[j_menor]=key11;
	            arrayRoomType[j_menor]=key12;
	            arrayLastReview[j_menor]=key13;
	            arrayLatitude[j_menor]=key14;
	            arrayLongitude[j_menor]=key15;
//	            arrayReviewsPerMonth[j_menor]=key16;

		  	}

	}
	
	public static void SelectionStringInverse(String[] arrayName, Integer[] arrayPrice, Integer[] arrayId, Integer[] arrayHostId, Integer[] arrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] arrayAvailability365 ,
            String[] arrayHostName, String[] arrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] arrayRoomType, String[] arrayLastReview, Double[] arrayLatitude, Double[] arrayLongitude){
		
		for (int j = 0; j < arrayName.length; j++) {
			int j_maior = j;
				for (int k = j + 1; k < arrayName.length; k++){
					if (arrayName[k].compareTo(arrayName[j_maior])>0)
						j_maior = k;
					}
				
				String key1 = arrayName[j];
				int key2 = arrayPrice[j];
				int key3 = arrayId[j];
				int key4 = arrayHostId[j];
				int key5 = arrayMinimumNights[j];
				int key6 = arrayNumberOfReviews[j];
				int key7 = arrayCalculatedHostListingsCount[j];
				int key8 = arrayAvailability365[j];
	            String key9 = arrayHostName[j];
	            String key10 = arrayNeighbourhoodGroup[j];
	            String key11 = arrayNeighbourhood[j];
	            String key12 = arrayRoomType[j];
	            String key13 = arrayLastReview[j];
	            double key14 = arrayLatitude[j];
	            double key15 = arrayLongitude[j];
//	            double key16 = arrayReviewsPerMonth[j];
				
	            arrayName[j] = arrayName[j_maior];
	            arrayPrice[j]=arrayPrice[j_maior];
	            arrayId[j]=arrayId[j_maior];
	            arrayHostId[j]=arrayHostId[j_maior];
	            arrayMinimumNights[j]=arrayMinimumNights[j_maior];
	            arrayNumberOfReviews[j]=arrayNumberOfReviews[j_maior];
	            arrayCalculatedHostListingsCount[j]=arrayCalculatedHostListingsCount[j_maior];
	            arrayAvailability365[j]=arrayAvailability365[j_maior];
	            arrayHostName[j]=arrayHostName[j_maior];
	            arrayNeighbourhoodGroup[j]=arrayNeighbourhoodGroup[j_maior];
	            arrayNeighbourhood[j]=arrayNeighbourhood[j_maior];
	            arrayRoomType[j]=arrayRoomType[j_maior];
	            arrayLastReview[j]=arrayLastReview[j_maior];
	            arrayLatitude[j]=arrayLatitude[j_maior];
	            arrayLongitude[j]=arrayLongitude[j_maior];
//	            arrayReviewsPerMonth[j]=arrayReviewsPerMonth[j_menor];
				
				arrayName[j_maior]=key1;
				arrayPrice[j_maior]=key2;
	            arrayId[j_maior]=key3;
	            arrayHostId[j_maior]=key4;
	            arrayMinimumNights[j_maior]=key5;
	            arrayNumberOfReviews[j_maior]=key6;
	            arrayCalculatedHostListingsCount[j_maior]=key7;
	            arrayAvailability365[j_maior]=key8;
	            arrayHostName[j_maior]=key9;
	            arrayNeighbourhoodGroup[j_maior]=key10;
	            arrayNeighbourhood[j_maior]=key11;
	            arrayRoomType[j_maior]=key12;
	            arrayLastReview[j_maior]=key13;
	            arrayLatitude[j_maior]=key14;
	            arrayLongitude[j_maior]=key15;
//	            arrayReviewsPerMonth[j_menor]=key16;

		  	}

	}
	
}
