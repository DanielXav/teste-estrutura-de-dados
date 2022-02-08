package br.com.springboot.airbnbanalyses.app;

import java.io.IOException;
import java.util.List;
import java.util.Scanner;

import br.com.springboot.airbnbanalyses.entities.AirBnbListings;
import br.com.springboot.airbnbanalyses.sort.MergeSort;
import br.com.springboot.airbnbanalyses.sort.SelectionSort;

public class AirBnbAnalysesApplication {

	public static void main (String []args) {
        try {
            /*List<AirBnbListings> list = readCsv(CSV_LISTINGS).parse();
            convertDate(list);
            List<Integer> priceList = createPriceList(list);
            writeCsvFiles(CSV_LISTINGS_REVIEW_DATE, CSV_LISTINGS_GT_AVG_PRICES, CSV_LISTINGS_LT_AVG_PRICES, list, returnAvgPrice(priceList));
            System.out.println("Arquivos .csv criados com sucesso.");*/

            List<AirBnbListings> listings_review_date = CsvManipulation.readCsv("c:\\Workspace\\listings_review_date.csv").parse();

            Integer[] arrayId = new Integer[listings_review_date.size()];
            String[] arrayName = new String[listings_review_date.size()];
            Integer[] arrayHostId = new Integer[listings_review_date.size()];
            String[] arrayHostName = new String[listings_review_date.size()];
            String[] arrayNeighbourhoodGroup = new String[listings_review_date.size()];
            String[] arrayNeighbourhood = new String[listings_review_date.size()];
            Double[] arrayLatitude = new Double[listings_review_date.size()];
            Double[] arrayLongitude = new Double[listings_review_date.size()];
            String[] arrayRoomType = new String[listings_review_date.size()];
            Integer[] arrayPrice = new Integer[listings_review_date.size()];
            Integer[] arrayMinimumNights = new Integer[listings_review_date.size()];
            Integer[] arrayNumberOfReviews = new Integer[listings_review_date.size()];
            String[] arrayLastReview= new String[listings_review_date.size()];
            Double[] arrayReviewsPerMonth = new Double[listings_review_date.size()];
            Integer[] arrayCalculatedHostListingsCount = new Integer[listings_review_date.size()];
            Integer[] arrayAvaiability365 = new Integer[listings_review_date.size()];
            
            int j = 0;
            for (AirBnbListings i : listings_review_date) {
                arrayId[j] = i.getId();
                arrayName[j] = i.getName();
                arrayHostId[j] = i.getHost_id();
                arrayHostName[j] = i.getHost_name();
                arrayNeighbourhoodGroup[j] = i.getNeighbourhood_group();
                arrayNeighbourhood[j] = i.getNeighbourhood();
                arrayLatitude[j] = i.getLatitude();
                arrayLongitude[j] = i.getLongitude();
                arrayRoomType[j] = i.getRoom_type();
                arrayPrice[j] = i.getPrice();
                arrayMinimumNights[j] = i.getMinimum_nights();
                arrayNumberOfReviews[j] = i.getNumber_of_reviews();
                arrayLastReview[j] = i.getLast_review();
                arrayReviewsPerMonth[j] = i.getReviews_per_month();
                arrayCalculatedHostListingsCount[j] = i.getCalculated_host_listings_count();
                arrayAvaiability365[j] = i.getAvailability_365();
                j++;
            }
            
//            Scanner sc = new Scanner(System.in);
//            int opcao = 0;
//            
//            while (opcao != 8) {
//            	System.out.println("ESCOLHA SUA OPÇÃO: ");
//                System.out.println("1. Selection Sort");
//                System.out.println("2. Insertion Sort");
//                System.out.println("3. Merge Sort");
//                System.out.println("4. Quick Sort");
//                System.out.println("5. Quick Sort com Mediana de 3");
//                System.out.println("6. Counting Sort");
//                System.out.println("7. Heap Sort");
//                System.out.println("8. Sair");
//                opcao = sc.nextInt();
//            }
            
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
            System.out.println(arrayAvaiability365[0]);
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


            
            //MERGE SORTE

    	    String auxArrayName[] = new String[arrayName.length];
    	    Integer auxArrayPrice[] = new Integer[arrayPrice.length];
    	    Integer auxArrayId[] = new Integer[arrayId.length];
    	    Integer auxArrayHostId[] = new Integer[arrayHostId.length];
    	    Integer auxArrayMinimumNights[] = new Integer[arrayMinimumNights.length];
    	    Integer auxArrayNumberOfReviews[] = new Integer[arrayNumberOfReviews.length];
    	    Integer auxArrayCalculatedHostListingsCount[] = new Integer[arrayCalculatedHostListingsCount.length];
    	    Integer auxArrayAvailability365[] = new Integer[arrayAvaiability365.length];
    	    String auxArrayHostName[] = new String[arrayHostName.length];
    	    String auxArrayNeighbourhoodGroup[] = new String[arrayNeighbourhoodGroup.length];
    	    String auxArrayNeighbourhood[] = new String[arrayNeighbourhood.length];
    	    String auxArrayRoomType[] = new String[arrayRoomType.length];
    	    String auxArrayLastReview[] = new String[arrayLastReview.length];
    	    Double auxArrayLatitude[] = new Double[arrayLatitude.length];
    	    Double auxArrayLongitude[] = new Double[arrayLongitude.length];
    	        
    	        MergeSort.mergeSortString(arrayName, auxArrayName, arrayPrice, auxArrayPrice, arrayId, auxArrayId,
    	        		arrayHostId, auxArrayHostId, arrayMinimumNights, auxArrayMinimumNights, arrayNumberOfReviews, 
    	        		auxArrayNumberOfReviews, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount,
    	        		arrayAvaiability365, auxArrayAvailability365, arrayHostName, auxArrayHostName, arrayNeighbourhoodGroup,
    	        		auxArrayNeighbourhoodGroup, arrayNeighbourhood, auxArrayNeighbourhood,  arrayRoomType, auxArrayRoomType,
    	        		arrayLastReview, auxArrayLastReview, arrayLatitude, auxArrayLatitude, arrayLongitude, auxArrayLongitude, 0, arrayName.length-1);
    	        
                

    	        
    	    String auxArrayName2[] = new String[arrayName.length];
    	    Integer auxArrayPrice2[] = new Integer[arrayPrice.length];
    	    Integer auxArrayId2[] = new Integer[arrayId.length];
    	    Integer auxArrayHostId2[] = new Integer[arrayHostId.length];
    	    Integer auxArrayMinimumNights2[] = new Integer[arrayMinimumNights.length];
    	    Integer auxArrayNumberOfReviews2[] = new Integer[arrayNumberOfReviews.length];
    	    Integer auxArrayCalculatedHostListingsCount2[] = new Integer[arrayCalculatedHostListingsCount.length];
    	    Integer auxArrayAvailability3652[] = new Integer[arrayAvaiability365.length];
    	    String auxArrayHostName2[] = new String[arrayHostName.length];
    	    String auxArrayNeighbourhoodGroup2[] = new String[arrayNeighbourhoodGroup.length];
    	    String auxArrayNeighbourhood2[] = new String[arrayNeighbourhood.length];
    	    String auxArrayRoomType2[] = new String[arrayRoomType.length];
    	    String auxArrayLastReview2[] = new String[arrayLastReview.length];
    	    Double auxArrayLatitude2[] = new Double[arrayLatitude.length];
    	    Double auxArrayLongitude2[] = new Double[arrayLongitude.length];
    	    
    	    MergeSort.mergeSortString(arrayName, auxArrayName2, arrayPrice, auxArrayPrice2, arrayId, auxArrayId2,
	        		arrayHostId, auxArrayHostId2, arrayMinimumNights, auxArrayMinimumNights2, arrayNumberOfReviews, 
	        		auxArrayNumberOfReviews2, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount2,
	        		arrayAvaiability365, auxArrayAvailability3652, arrayHostName, auxArrayHostName2, arrayNeighbourhoodGroup,
	        		auxArrayNeighbourhoodGroup2, arrayNeighbourhood, auxArrayNeighbourhood2,  arrayRoomType, auxArrayRoomType2,
	        		arrayLastReview, auxArrayLastReview2, arrayLatitude, auxArrayLatitude2, arrayLongitude, auxArrayLongitude2, 0, arrayName.length-1);
	        
            

            
    	    String auxArrayName3[] = new String[arrayName.length];
    	    Integer auxArrayPrice3[] = new Integer[arrayPrice.length];
    	    Integer auxArrayId3[] = new Integer[arrayId.length];
    	    Integer auxArrayHostId3[] = new Integer[arrayHostId.length];
    	    Integer auxArrayMinimumNights3[] = new Integer[arrayMinimumNights.length];
    	    Integer auxArrayNumberOfReviews3[] = new Integer[arrayNumberOfReviews.length];
    	    Integer auxArrayCalculatedHostListingsCount3[] = new Integer[arrayCalculatedHostListingsCount.length];
    	    Integer auxArrayAvailability3653[] = new Integer[arrayAvaiability365.length];
    	    String auxArrayHostName3[] = new String[arrayHostName.length];
    	    String auxArrayNeighbourhoodGroup3[] = new String[arrayNeighbourhoodGroup.length];
    	    String auxArrayNeighbourhood3[] = new String[arrayNeighbourhood.length];
    	    String auxArrayRoomType3[] = new String[arrayRoomType.length];
    	    String auxArrayLastReview3[] = new String[arrayLastReview.length];
    	    Double auxArrayLatitude3[] = new Double[arrayLatitude.length];
    	    Double auxArrayLongitude3[] = new Double[arrayLongitude.length];
    	    
    	  SelectionSort.SelectionStringInverse(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);

    	  MergeSort.mergeSortString(arrayName, auxArrayName3, arrayPrice, auxArrayPrice3, arrayId, auxArrayId3,
	        		arrayHostId, auxArrayHostId3, arrayMinimumNights, auxArrayMinimumNights3, arrayNumberOfReviews, 
	        		auxArrayNumberOfReviews3, arrayCalculatedHostListingsCount, auxArrayCalculatedHostListingsCount3,
	        		arrayAvaiability365, auxArrayAvailability3653, arrayHostName, auxArrayHostName3, arrayNeighbourhoodGroup,
	        		auxArrayNeighbourhoodGroup3, arrayNeighbourhood, auxArrayNeighbourhood3,  arrayRoomType, auxArrayRoomType3,
	        		arrayLastReview, auxArrayLastReview3, arrayLatitude, auxArrayLatitude3, arrayLongitude, auxArrayLongitude3, 0, arrayName.length-1);
	        
            
    	  
    	    System.out.println("DEPOISSSSSSSSSSS");
    	    System.out.println(arrayName[10000]);
            System.out.println(arrayPrice[0]);
            System.out.println(arrayId[0]);
            System.out.println(arrayHostId[0]);
            System.out.println(arrayMinimumNights[0]);
            System.out.println(arrayNumberOfReviews[0]);
            System.out.println(arrayCalculatedHostListingsCount[0]);
            System.out.println(arrayAvaiability365[0]);
            System.out.println(arrayHostName[0]);
            System.out.println(arrayNeighbourhoodGroup[0]);
            System.out.println(arrayNeighbourhood[0]);
            System.out.println(arrayRoomType[0]);
            System.out.println(arrayLastReview[0]);
            System.out.println(arrayLatitude[0]);
            System.out.println(arrayLongitude[0]);
    	    
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
            
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }

}