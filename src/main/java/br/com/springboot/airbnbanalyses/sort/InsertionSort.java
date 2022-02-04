package br.com.springboot.airbnbanalyses.sort;

public class InsertionSort {

	public static void insertSort(int array[], int array2[], int array3[], int array4[], int array5[], int array6[], int array7[], String array8[],
    		String array9[], String array10[], String array11[], String array12[], String array13[], double array14[], double array15[]) {  
        int n = array.length;  
        for (int j = 1; j < n; j++) {  
            int key = array[j];  
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
            int i = j-1;  
            while ( (i > -1) && ( array [i] > key ) ) {  
                array [i+1] = array [i];  
                array2[i + 1] = array2[i];
                array3[i + 1] = array3[i];
                array4[i + 1] = array4[i];
                array5[i + 1] = array5[i];
                array6[i + 1] = array6[i];
                array7[i + 1] = array7[i];
                array8[i + 1] = array8[i];
                array9[i + 1] = array9[i];
                array10[i + 1] = array10[i];
                array11[i + 1] = array11[i];
                array12[i + 1] = array12[i];
                array13[i + 1] = array13[i];
                array14[i + 1] = array14[i];
                array15[i + 1] = array15[i];
                i--;  
            }  
            array[i+1] = key;  
            array2[i+1] = key2;
            array3[i+1] = key3;
            array4[i+1] = key4;
            array5[i+1] = key5;
            array6[i+1] = key6;
            array7[i+1] = key7;
            array8[i+1] = key8;
            array9[i+1] = key9;
            array10[i+1] = key10;
            array11[i+1] = key11;
            array12[i+1] = key12;
            array13[i+1] = key13;
            array14[i+1] = key14;
            array15[i+1] = key15;
        }  
    }
	
	public static void insertSortStr(String[] v0, Integer[] v1, Integer[] v2) {
		int n = v0.length;
		String key0 = "";
		int key1 = 0;
		int key2 = 0;
		System.out.println("Por favor aguarde executando insertSortStr...");
		for (int i = 0; i < n; i++) {
			for (int j = 1; j < n; j++) {			
				if(v0[i].compareToIgnoreCase(v0[j])<0) { 									
					key0 = v0[i];
					v0[i] = v0[j];
					v0[j] = key0;
					
					key1 = v1[i];
					v1[i] = v1[j];
					v1[j] = key1;

					key2 = v2[i];
					v2[i] = v2[j];
					v2[j] = key2;									
				}
			}
		}
	}
	
	public static void insertionSortStringTeste(String[] arrayName, Integer[] arrayPrice, Integer[] arrayId, Integer[] arrayHostId, Integer[] arrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] arrayAvailability365 ,
            String[] arrayHostName, String[] arrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] arrayRoomType, String[] arrayLastReview, Double[] arrayLatitude, Double[] arrayLongitude) { 
        int i,j;  
        String aux1;
        int aux2;
        int aux3;
        int aux4;
        int aux5;
        int aux6;
        int aux7;
        int aux8;
        String aux9;
        String aux10;
        String aux11;
        String aux12;
        String aux13;
        double aux14;
        double aux15;
        
        for (j = 1; j < arrayName.length; j++) {       
        	aux1 = arrayName[j]; 
        	aux2 = arrayPrice[j]; 
        	aux3 = arrayId[j]; 
        	aux4 = arrayHostId[j]; 
        	aux5 = arrayMinimumNights[j]; 
        	aux6 = arrayNumberOfReviews[j]; 
        	aux7 = arrayCalculatedHostListingsCount[j]; 
        	aux8 = arrayAvailability365[j]; 
        	aux9 = arrayHostName[j]; 
        	aux10 = arrayNeighbourhoodGroup[j]; 
        	aux11 = arrayNeighbourhood[j]; 
        	aux12 = arrayRoomType[j]; 
        	aux13 = arrayLastReview[j]; 
        	aux14 = arrayLatitude[j]; 
        	aux15 = arrayLongitude[j]; 
        	
            i = j - 1;

            while (i >= 0) {
                if (aux1.compareTo(arrayName[i]) > 0) {
                    break;
                }
                arrayName[i + 1] = arrayName[i];
                arrayPrice[i + 1] = arrayPrice[i];
                arrayId[i + 1] = arrayId[i];
                arrayHostId[i + 1] = arrayHostId[i];
                arrayMinimumNights[i + 1] = arrayMinimumNights[i];
                arrayNumberOfReviews[i + 1] = arrayNumberOfReviews[i];
                arrayCalculatedHostListingsCount[i + 1] = arrayCalculatedHostListingsCount[i];
                arrayAvailability365[i + 1] = arrayAvailability365[i];
                arrayHostName[i + 1] = arrayHostName[i];
                arrayNeighbourhoodGroup[i + 1] = arrayNeighbourhoodGroup[i];
                arrayNeighbourhood[i + 1] = arrayNeighbourhood[i];
                arrayRoomType[i + 1] = arrayRoomType[i];
                arrayLastReview[i + 1] = arrayLastReview[i];
                arrayLatitude[i + 1] = arrayLatitude[i];
                arrayLongitude[i + 1] = arrayLongitude[i];
                
                i--;
            }
            arrayName[i + 1] = aux1;
            arrayPrice[i + 1] = aux2;
            arrayId[i + 1] = aux3;
            arrayHostId[i + 1] = aux4;
            arrayMinimumNights[i + 1] = aux5;
            arrayNumberOfReviews[i + 1] = aux6;
            arrayCalculatedHostListingsCount[i + 1] = aux7;
            arrayAvailability365[i + 1] = aux8;
            arrayHostName[i + 1] = aux9;
            arrayNeighbourhoodGroup[i + 1] = aux10;
            arrayNeighbourhood[i + 1] = aux11;
            arrayRoomType[i + 1] = aux12;
            arrayLastReview[i + 1] = aux13;
            arrayLatitude[i + 1] = aux14;
            arrayLongitude[i + 1] = aux15;
            
        }

}
}
