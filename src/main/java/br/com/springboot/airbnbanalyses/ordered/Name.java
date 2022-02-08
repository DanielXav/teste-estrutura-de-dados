package br.com.springboot.airbnbanalyses.ordered;

import java.util.List;

import br.com.springboot.airbnbanalyses.entities.AirBnbListings;

public class Name {

	public static void byName(List<AirBnbListings> list, String[] arrayName, Integer[] arrayPrice, Integer[] arrayId, Integer[] arrayHostId, Integer[] arrayMinimumNights, Integer[] arrayNumberOfReviews, Integer[] arrayCalculatedHostListingsCount, Integer[] arrayAvailability365 ,
            String[] arrayHostName, String[] arrayNeighbourhoodGroup, String[] arrayNeighbourhood, String[] arrayRoomType, String[] arrayLastReview, Double[] arrayLatitude, Double[] arrayLongitude) {
		
		//SELECTION SORT ---------------------------------------------------------------------
        
        //listings_names_selectionSort_medioCaso.csv
        //SelectionSort.SelectionString(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
            
        //listings_names_selectionSort_melhorCaso.csv
        //SelectionSort.SelectionString(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
         
        //listings_names_selectionSort_piorCaso.csv
        //SelectionSort.SelectionStringInverse(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
        //SelectionSort.SelectionString(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
         
        
        //INSERTION SORT ---------------------------------------------------------------------
        
	    System.out.println("ANTESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	    System.out.println(arrayName[0]);
        System.out.println(arrayPrice[0]);
        System.out.println(arrayId[0]);
        System.out.println(arrayHostId[0]);
        System.out.println(arrayMinimumNights[0]);
        System.out.println(arrayNumberOfReviews[0]);
        System.out.println(arrayCalculatedHostListingsCount[0]);
        System.out.println(arrayAvailability365[0]);
        System.out.println(arrayHostName[0]);
        System.out.println(arrayNeighbourhoodGroup[0]);
        System.out.println(arrayNeighbourhood[0]);
        System.out.println(arrayRoomType[0]);
        System.out.println(arrayLastReview[0]);
        System.out.println(arrayLatitude[0]);
        System.out.println(arrayLongitude[0]);
        
        //InsertionSort.insertSortStr(arrayName, arrayId, arrayPrice);  
        //InsertionSort.insertionSortStringTeste(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
        //InsertionSort.insertionSortStringTeste(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
	    //SelectionSort.SelectionStringInverse(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
        //InsertionSort.insertionSortStringTeste(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);

        
	    System.out.println("DEPOISSSSSSSSSSS");
	    System.out.println(arrayName[10000]);
        System.out.println(arrayPrice[0]);
        System.out.println(arrayId[0]);
        System.out.println(arrayHostId[0]);
        System.out.println(arrayMinimumNights[0]);
        System.out.println(arrayNumberOfReviews[0]);
        System.out.println(arrayCalculatedHostListingsCount[0]);
        System.out.println(arrayAvailability365[0]);
        System.out.println(arrayHostName[0]);
        System.out.println(arrayNeighbourhoodGroup[0]);
        System.out.println(arrayNeighbourhood[0]);
        System.out.println(arrayRoomType[0]);
        System.out.println(arrayLastReview[0]);
        System.out.println(arrayLatitude[0]);
        System.out.println(arrayLongitude[0]);
        
        //MERGE SORTE

	    String auxArrayName[] = new String[arrayName.length];
	    Integer auxArrayPrice[] = new Integer[arrayPrice.length];
	    Integer auxArrayId[] = new Integer[arrayId.length];
	    Integer auxArrayHostId[] = new Integer[arrayHostId.length];
	    Integer auxArrayMinimumNights[] = new Integer[arrayMinimumNights.length];
	    Integer auxArrayNumberOfReviews[] = new Integer[arrayNumberOfReviews.length];
	    Integer auxArrayCalculatedHostListingsCount[] = new Integer[arrayCalculatedHostListingsCount.length];
	    Integer auxArrayAvailability365[] = new Integer[arrayAvailability365.length];
	    String auxArrayHostName[] = new String[arrayHostName.length];
	    String auxArrayNeighbourhoodGroup[] = new String[arrayNeighbourhoodGroup.length];
	    String auxArrayNeighbourhood[] = new String[arrayNeighbourhood.length];
	    String auxArrayRoomType[] = new String[arrayRoomType.length];
	    String auxArrayLastReview[] = new String[arrayLastReview.length];
	    Double auxArrayLatitude[] = new Double[arrayLatitude.length];
	    Double auxArrayLongitude[] = new Double[arrayLongitude.length];
	        
	        /*MergeSort.mergeSortString(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
	        		arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, 
	        		auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
	        		arrayAvaiability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
	        		auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
	        		arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, 0, arrayName.length-1);*/
	        
	    String auxArrayName2[] = new String[arrayName.length];
	    Integer auxArrayPrice2[] = new Integer[arrayPrice.length];
	    Integer auxArrayId2[] = new Integer[arrayId.length];
	    Integer auxArrayHostId2[] = new Integer[arrayHostId.length];
	    Integer auxArrayMinimumNights2[] = new Integer[arrayMinimumNights.length];
	    Integer auxArrayNumberOfReviews2[] = new Integer[arrayNumberOfReviews.length];
	    Integer auxArrayCalculatedHostListingsCount2[] = new Integer[arrayCalculatedHostListingsCount.length];
	    Integer auxArrayAvailability3652[] = new Integer[arrayAvailability365.length];
	    String auxArrayHostName2[] = new String[arrayHostName.length];
	    String auxArrayNeighbourhoodGroup2[] = new String[arrayNeighbourhoodGroup.length];
	    String auxArrayNeighbourhood2[] = new String[arrayNeighbourhood.length];
	    String auxArrayRoomType2[] = new String[arrayRoomType.length];
	    String auxArrayLastReview2[] = new String[arrayLastReview.length];
	    Double auxArrayLatitude2[] = new Double[arrayLatitude.length];
	    Double auxArrayLongitude2[] = new Double[arrayLongitude.length];
	    //MergeSort.mergeSortString(arrayId, auxArrayId2, arrayPrice, arrayName, auxArrayPrice2, auxArrayName2, 0, arrayName.length-1);
	        
	    String auxArrayName3[] = new String[arrayName.length];
	    Integer auxArrayPrice3[] = new Integer[arrayPrice.length];
	    Integer auxArrayId3[] = new Integer[arrayId.length];
	    Integer auxArrayHostId3[] = new Integer[arrayHostId.length];
	    Integer auxArrayMinimumNights3[] = new Integer[arrayMinimumNights.length];
	    Integer auxArrayNumberOfReviews3[] = new Integer[arrayNumberOfReviews.length];
	    Integer auxArrayCalculatedHostListingsCount3[] = new Integer[arrayCalculatedHostListingsCount.length];
	    Integer auxArrayAvailability3653[] = new Integer[arrayAvailability365.length];
	    String auxArrayHostName3[] = new String[arrayHostName.length];
	    String auxArrayNeighbourhoodGroup3[] = new String[arrayNeighbourhoodGroup.length];
	    String auxArrayNeighbourhood3[] = new String[arrayNeighbourhood.length];
	    String auxArrayRoomType3[] = new String[arrayRoomType.length];
	    String auxArrayLastReview3[] = new String[arrayLastReview.length];
	    Double auxArrayLatitude3[] = new Double[arrayLatitude.length];
	    Double auxArrayLongitude3[] = new Double[arrayLongitude.length];
	    //SelectionSort.SelectionStringInverse(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
	    //MergeSort.mergeSortString(arrayId, auxArrayId, arrayPrice, arrayName, auxArrayPrice, auxArrayName, 0, arrayName.length-1);

	    // QUICKSORT
	    		    
	    //QuickSort.quickSortStr(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, 0, arrayName.length-1);
	        
	    // QUICKSORT MEDIANA DE 3
	    

	    //QuickMediana3.quickSortStr(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, 0, arrayName.length-1);
	    //QuickMediana3.quickSortStr(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, 0, arrayName.length-1);
	    //SelectionSort.SelectionStringInverse(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
	    //QuickMediana3.quickSortStr(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude, 0, arrayName.length-1);

        // COUTING SORT - NÃO
	    
	    // HEAP SORT
	    
	    //HeapSort.HeapStr(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
        
	    //HeapSort.HeapStr(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
	    //SelectionSort.SelectionStringInverse(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
	    //HeapSort.HeapStr(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
        

	}
}
