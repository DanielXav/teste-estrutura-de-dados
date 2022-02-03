package br.com.springboot.airbnbanalyses.ordered;

import java.io.IOException;
import java.util.List;

import br.com.springboot.airbnbanalyses.entities.AirBnbListings;
import br.com.springboot.airbnbanalyses.sort.SelectionSort;

public class Price {

	public static void byPrice(List<AirBnbListings> list, int [] vetor, int[] id, int[] availability_365, int[] calculated_host,
			int[] host_id, int[] minimun_nights, int[] number_reviews, int[] reviews_month, String[] neighbourhood_group,
			String[] neighbourhood, String[] host_name, String[] last_review, String[] name, String[] room_type,
			double[] longitude, double[] latitude) {
		// Preenchendo um vetor com cada atributo da classe
		
		int vetorPriceSelectionSort[] = new int[list.size()];
        int vetorPriceInsertionSort[] = new int[list.size()];
        int vetorPriceMergeSort[] = new int[list.size()];
        int vetorPriceQuickSort[] = new int[list.size()];
        int vetorPriceQuickMedia3[] = new int[list.size()];
        int vetorPriceCountingSort[] = new int[list.size()];
        int vetorPriceHeapSort[] = new int[list.size()];
		
       
        
        // SELECTION SORT ---------------------------------------------------------------------------

        for (int i = 0; i < vetor.length; i++) {
        	vetorPriceSelectionSort[i] = vetor[i];
        }
        
        //listings_price_selectionSort_medioCaso.csv
        //SelectionSort.SelectSort(vetorPriceSelectionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);
        
        //listings_price_selectionSort_melhorCaso.csv
        //SelectionSort.SelectSort(vetorPriceSelectionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);
        
        //listings_price_selectionSort_piorCaso.csv
        //SelectionSort.SelectSortInverse(vetorPriceSelectionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude); // Deixa o vetor do maior para o menor
        //SelectionSort.SelectSort(vetorPriceSelectionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);

        // INSERTION SORT --------------------------------------------------------------------------
        
        // Transformando todos os strings em inteiro para realizar sort do price.
        for (int i = 0; i < vetor.length; i++) {
        	vetorPriceInsertionSort[i] = vetor[i];
        }
        
        //listings_price_insertionSort_medioCaso.csv
        //InsertionSort.insertSort(vetorPriceInsertionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);
        
        //listings_price_insertionSort_melhorCaso.csv
        //InsertionSort.insertSort(vetorPriceInsertionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);
        
        //listings_price_insertionSort_piorCaso.csv
        //ordenarDecrescente(vetorPriceInsertionSort);
        //InsertionSort.insertSort(vetorPriceInsertionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);
       
        
        // MERGE SORT -----------------------------------------------------------------------------
        
        for (int i = 0; i < vetor.length; i++) {
        	vetorPriceMergeSort[i] = vetor[i];
        }
                   
        //listings_price_mergeSort_medioCaso.csv
        int vetorAux[] = new int[vetorPriceMergeSort.length];
        int idAux[] = new int[id.length];
        int availability_365Aux[] = new int[availability_365.length];
        int calculated_hostAux[] = new int[calculated_host.length];
        int host_idAux[] = new int[host_id.length];
        int minimun_nightsAux[] = new int[minimun_nights.length];
        int number_reviewsAux[] = new int[number_reviews.length];
        String neighbourhood_groupAux[] = new String[neighbourhood_group.length];
        String neighbourhoodAux[] = new String[neighbourhood.length];
        String host_nameAux[] = new String[host_name.length];
        String last_reviewAux[] = new String[last_review.length];
        String nameAux[] = new String[name.length];
        String room_typeAux[] = new String[room_type.length];
        double longitudeAux[] = new double[longitude.length];
        double latitudeAux[] = new double[latitude.length];
        /*MergeSort.mergeSort(vetorPriceMergeSort, vetorAux, id, idAux, availability_365, availability_365Aux, 
        		calculated_host, calculated_hostAux, host_id, host_idAux, minimun_nights, minimun_nightsAux,
        		number_reviews, number_reviewsAux, neighbourhood_group, neighbourhood_groupAux, neighbourhood, neighbourhoodAux, 
        		host_name, host_nameAux, last_review, last_reviewAux, name, nameAux, room_type, room_typeAux, 
        		longitude, longitudeAux, latitude, latitudeAux, 0, vetorPriceMergeSort.length-1);*/
        
        //listings_price_mergeSort_melhorCaso.csv
        int vetorAux2[] = new int[vetorPriceMergeSort.length];
        int idAux2[] = new int[id.length];
        int availability_365Aux2[] = new int[availability_365.length];
        int calculated_hostAux2[] = new int[calculated_host.length];
        int host_idAux2[] = new int[host_id.length];
        int minimun_nightsAux2[] = new int[minimun_nights.length];
        int number_reviewsAux2[] = new int[number_reviews.length];
        String neighbourhood_groupAux2[] = new String[neighbourhood_group.length];
        String neighbourhoodAux2[] = new String[neighbourhood.length];
        String host_nameAux2[] = new String[host_name.length];
        String last_reviewAux2[] = new String[last_review.length];
        String nameAux2[] = new String[name.length];
        String room_typeAux2[] = new String[room_type.length];
        double longitudeAux2[] = new double[longitude.length];
        double latitudeAux2[] = new double[latitude.length];
        /*MergeSort.mergeSort(vetorPriceMergeSort, vetorAux2, id, idAux2, availability_365, availability_365Aux2, 
        		calculated_host, calculated_hostAux2, host_id, host_idAux2, minimun_nights, minimun_nightsAux2,
        		number_reviews, number_reviewsAux2, neighbourhood_group, neighbourhood_groupAux2, neighbourhood, neighbourhoodAux2, 
        		host_name, host_nameAux2, last_review, last_reviewAux2, name, nameAux2, room_type, room_typeAux2, 
        		longitude, longitudeAux2, latitude, latitudeAux2, 0, vetorPriceMergeSort.length-1);*/
        
        //listings_price_mergeSort_piorCaso.csv
        int vetorAux3[] = new int[vetorPriceMergeSort.length];
        int idAux3[] = new int[id.length];
        int availability_365Aux3[] = new int[availability_365.length];
        int calculated_hostAux3[] = new int[calculated_host.length];
        int host_idAux3[] = new int[host_id.length];
        int minimun_nightsAux3[] = new int[minimun_nights.length];
        int number_reviewsAux3[] = new int[number_reviews.length];
        String neighbourhood_groupAux3[] = new String[neighbourhood_group.length];
        String neighbourhoodAux3[] = new String[neighbourhood.length];
        String host_nameAux3[] = new String[host_name.length];
        String last_reviewAux3[] = new String[last_review.length];
        String nameAux3[] = new String[name.length];
        String room_typeAux3[] = new String[room_type.length];
        double longitudeAux3[] = new double[longitude.length];
        double latitudeAux3[] = new double[latitude.length];
        //ordenarDecrescente(vetorPriceMergeSort);
        /*MergeSort.mergeSort(vetorPriceMergeSort, vetorAux3, id, idAux3, availability_365, availability_365Aux3, 
        		calculated_host, calculated_hostAux3, host_id, host_idAux3, minimun_nights, minimun_nightsAux3,
        		number_reviews, number_reviewsAux3, neighbourhood_group, neighbourhood_groupAux3, neighbourhood, neighbourhoodAux3, 
        		host_name, host_nameAux3, last_review, last_reviewAux3, name, nameAux3, room_type, room_typeAux3, 
        		longitude, longitudeAux3, latitude, latitudeAux3, 0, vetorPriceMergeSort.length-1);*/
        
        // QUICK SORT ---------------------------------------------------------------------------
        
        for (int i = 0; i < vetor.length; i++) {
        	vetorPriceQuickSort[i] = vetor[i];
        }
         
        //listings_price_quickSort_medioCaso.csv
        /*QuickSort.quickSort(vetorPriceQuickSort, id, availability_365, calculated_host, host_id,
        		minimun_nights, number_reviews, reviews_month, neighbourhood_group, neighbourhood, 
        		host_name, last_review, name, room_type, longitude, latitude, 0, vetorPriceQuickSort.length-1);*/
        
        //listings_price_quickSort_melhorCaso.csv
        //QuickSort.quickSort(neighbourhood, vetorPriceQuickSort, id, 0, vetorPriceQuickSort.length-1);
       
        //listings_price_quickSort_piorCaso.csv
        //ordenarDecrescente(vetorPriceQuickSort);
        //QuickSort.quickSort(neighbourhood, vetorPriceQuickSort, id, 0, vetorPriceQuickSort.length-1);
        //printarArrayInt(vetorPriceQuickSort);
        
        // QUICK SORT MEDIANA DE TRES ----------------------------------------------------------
        for (int i = 0; i < vetor.length; i++) {
        	vetorPriceQuickMedia3[i] = vetor[i];
        }
        
        //listings_price_quickSortMediana3_medioCaso.csv
        /*QuickMediana3.quickSort(vetorPriceQuickMedia3, id, availability_365, calculated_host, host_id,
        		minimun_nights, number_reviews, reviews_month, neighbourhood_group, neighbourhood, 
        		host_name, last_review, name, room_type, longitude, latitude, 0, vetorPriceQuickMedia3.length-1);*/
        
        //listings_price_quickSortMediana3_melhorCaso.csv
        /*QuickMediana3.quickSort(vetorPriceQuickMedia3, id, availability_365, calculated_host, host_id,
        		minimun_nights, number_reviews, reviews_month, neighbourhood_group, neighbourhood, 
        		host_name, last_review, name, room_type, longitude, latitude, 0, vetorPriceQuickMedia3.length-1);*/
        
        //listings_price_quickSortMediana3_piorCaso.csv
        /*QuickMediana3.quickSort(vetorPriceQuickMedia3, id, availability_365, calculated_host, host_id,
  		minimun_nights, number_reviews, reviews_month, neighbourhood_group, neighbourhood, 
  		host_name, last_review, name, room_type, longitude, latitude, 0, vetorPriceQuickMedia3.length-1);*/
        
        // COUTING SORT ----------------------------------------------------------
        
        for (int i = 0; i < vetor.length; i++) {
        	vetorPriceCountingSort[i] = vetor[i];
        }
        
        //listings_price_coutingSortMediana3_medioCaso.csv
        /*CountingSort.countSort(vetorPriceCountingSort, id, availability_365, calculated_host, host_id,
          		minimun_nights, number_reviews, reviews_month, neighbourhood_group, neighbourhood, 
          		host_name, last_review, name, room_type, longitude, latitude, vetorPriceQuickMedia3.length-1);*/
        
        //listings_price_coutingSortMediana3_medioCaso.csv
        /*CountingSort.countSort(vetorPriceCountingSort, id, availability_365, calculated_host, host_id,
          		minimun_nights, number_reviews, reviews_month, neighbourhood_group, neighbourhood, 
          		host_name, last_review, name, room_type, longitude, latitude, vetorPriceQuickMedia3.length-1);*/
        
        //listings_price_coutingSortMediana3_medioCaso.csv
        
        // HEAP SORT ---------------------------------------------------------------------
        
        for (int i = 0; i < vetor.length; i++) {
        	vetorPriceHeapSort[i] = vetor[i];
        }
        
        //listings_price_heapSort_medioCaso.csv
        /*HeapSort.heap(vetorPriceHeapSort, id, availability_365, calculated_host, host_id,
          		minimun_nights, number_reviews, reviews_month, neighbourhood_group, neighbourhood, 
          		host_name, last_review, name, room_type, longitude, latitude);*/
        
        //listings_price_heapSort_medioCaso.csv
        /*HeapSort.heap(vetorPriceHeapSort, id, availability_365, calculated_host, host_id,
          		minimun_nights, number_reviews, reviews_month, neighbourhood_group, neighbourhood, 
          		host_name, last_review, name, room_type, longitude, latitude);*/
        
    
	}
}
