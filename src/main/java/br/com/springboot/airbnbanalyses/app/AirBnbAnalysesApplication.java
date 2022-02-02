package br.com.springboot.airbnbanalyses.app;

import java.io.IOException;
import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.ParseException;
import java.util.List;

import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import br.com.springboot.airbnbanalyses.entities.AirBnbListings;
import br.com.springboot.airbnbanalyses.sort.CountingSort;
import br.com.springboot.airbnbanalyses.sort.HeapSort;
import br.com.springboot.airbnbanalyses.sort.InsertionSort;
import br.com.springboot.airbnbanalyses.sort.MergeSort;
import br.com.springboot.airbnbanalyses.sort.QuickMediana3;
import br.com.springboot.airbnbanalyses.sort.QuickSort;
import br.com.springboot.airbnbanalyses.sort.SelectionSort;

public class AirBnbAnalysesApplication {

    public static void main (String []args) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, ParseException {
        try {
            Reader reader = Files.newBufferedReader(Paths.get("c:\\Workspace\\listings_review_date.csv"));
            CsvToBean csvToBean = new CsvToBeanBuilder(reader).withType(AirBnbListings.class).build();
            List<AirBnbListings> list = csvToBean.parse();
            
            int vetorPriceSelectionSort[] = new int[list.size()];
            int vetorPriceInsertionSort[] = new int[list.size()];
            int vetorPriceMergeSort[] = new int[list.size()];
            int vetorPriceQuickSort[] = new int[list.size()];
            int vetorPriceQuickMedia3[] = new int[list.size()];
            int vetorPriceCountingSort[] = new int[list.size()];
            int vetorPriceHeapSort[] = new int[list.size()];
            
            int vetor[] = new int[list.size()];
            int id[] = new int[list.size()];
            int availability_365[] = new int[list.size()];
            int calculated_host[] = new int[list.size()];
            int host_id[] = new int[list.size()];
            int minimun_nights[] = new int[list.size()];
            int number_reviews[] = new int[list.size()];
            int reviews_month[] = new int[list.size()];
            String neighbourhood_group[] = new String[list.size()];
            String neighbourhood[] = new String[list.size()];
            String host_name[] = new String[list.size()];
            String last_review[] = new String[list.size()];
            String name[] = new String[list.size()];
            String room_type[] = new String[list.size()];
            double longitude[] = new double[list.size()];
            double latitude[] = new double[list.size()];
            	             
            // Preenchendo um vetor com cada atributo da classe
            int j = 0;
            for(AirBnbListings i : list) {
            	vetor[j] = Integer.parseInt(i.getPrice());
            	id[j] = Integer.parseInt(i.getId());
            	availability_365[j] = Integer.parseInt(i.getAvailability_365());
            	calculated_host[j] = Integer.parseInt(i.getCalculated_host_listings_count());
            	host_id[j] = Integer.parseInt(i.getHost_id());
            	minimun_nights[j] = Integer.parseInt(i.getMinimum_nights());
            	number_reviews[j] = Integer.parseInt(i.getNumber_of_reviews());
            	reviews_month[j] = Integer.parseInt(i.getNumber_of_reviews());
            	neighbourhood_group[j] = i.getNeighbourhood_group();
            	neighbourhood[j] = i.getNeighbourhood();
            	host_name[j] = i.getHost_name();
            	last_review[j] = i.getLast_review();
            	name[j] = i.getName();
            	room_type[j] = i.getRoom_type();
            	longitude[j] = Double.parseDouble(i.getLongitude());
            	latitude[j] = Double.parseDouble(i.getLatitude());
            	j++;
            }
            
            // SELECTION SORT ---------------------------------------------------------------------------
            

            
            for (int i = 0; i < vetor.length; i++) {
            	vetorPriceSelectionSort[i] = vetor[i];
            }
            
            //listings_price_selectionSort_medioCaso.csv
            //SelectionSort.SelectSort(vetorPriceSelectionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);
            
            //listings_price_selectionSort_melhorCaso.csv
            //SelectionSort.SelectSort(vetorPriceSelectionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);
            
            //listings_price_selectionSort_piorCaso.csv
            //ordenarDecrescente(vetorPriceSelectionSort); // Deixa o vetor do maior para o menor
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
            ordenarDecrescente(vetorPriceMergeSort);
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
            ordenarDecrescente(vetorPriceQuickSort);
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
            
	          System.out.println("ANTESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
	          System.out.println(id[0]);
	          System.out.println(vetorPriceHeapSort[0]);
	          System.out.println(availability_365[0]);
	          System.out.println(calculated_host[0]);
	          System.out.println(host_id[0]);
	          System.out.println(minimun_nights[0]);
	          System.out.println(number_reviews[0]);
	          System.out.println(neighbourhood_group[0]);
	          System.out.println(neighbourhood[0]);
	          System.out.println(host_name[0]);
	          System.out.println(last_review[0]);
	          System.out.println(name[0]);
	          System.out.println(room_type[0]);
	          System.out.println(longitude[0]);
	          System.out.println(latitude[0]);
            
            HeapSort.heap(vetorPriceHeapSort, id, availability_365, calculated_host, host_id,
              		minimun_nights, number_reviews, reviews_month, neighbourhood_group, neighbourhood, 
              		host_name, last_review, name, room_type, longitude, latitude);
            
            HeapSort.heap(vetorPriceHeapSort, id, availability_365, calculated_host, host_id,
              		minimun_nights, number_reviews, reviews_month, neighbourhood_group, neighbourhood, 
              		host_name, last_review, name, room_type, longitude, latitude);
            
            System.out.println("DEPOOISSSSSSSSSSSSSSSSSSSSS");
	          System.out.println(id[0]);
	          System.out.println(vetorPriceHeapSort[0]);
	          System.out.println(availability_365[0]);
	          System.out.println(calculated_host[0]);
	          System.out.println(host_id[0]);
	          System.out.println(minimun_nights[0]);
	          System.out.println(number_reviews[0]);
	          System.out.println(neighbourhood_group[0]);
	          System.out.println(neighbourhood[0]);
	          System.out.println(host_name[0]);
	          System.out.println(last_review[0]);
	          System.out.println(name[0]);
	          System.out.println(room_type[0]);
	          System.out.println(longitude[0]);
	          System.out.println(latitude[0]);
        } catch (IOException e) {
            e.printStackTrace();
        }
  
    }
  
    public static void ordenarDecrescente(int[] v) {	
    	for (int i = 0; i < v.length; i++) {
    		
    		int i_maior = i;
    		for (int j = i + 1; j < v.length; j++)
    			if (v[j] > v[i_maior])
    				i_maior = j;
    		
    		int aux = v[i];
    		v[i] = v[i_maior];
    		v[i_maior] = aux;
    	
    	}		
    }
    
    public static void printarArrayInt(int[] v) {
      for (int i = 0; i < v.length; i++) {
    	System.out.println(v[i]);
      }
    }
  
  // couting?
  
  // 
  
  
}
