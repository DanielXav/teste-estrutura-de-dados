package br.com.springboot.airbnbanalyses.app;

import br.com.springboot.airbnbanalyses.entities.AirBnbListings;
import com.opencsv.CSVWriter;
import com.opencsv.bean.CsvToBean;
import com.opencsv.bean.CsvToBeanBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import static br.com.springboot.airbnbanalyses.app.CsvManipulation.convertDate;
import static br.com.springboot.airbnbanalyses.app.CsvManipulation.writeCsv;

public class AirBnbAnalysesApplication {

    public static void main (String []args) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, ParseException {
        try {
            Reader reader = Files.newBufferedReader(Paths.get("c:\\Workspace\\listings_review_date.csv"));
            CsvToBean csvToBean = new CsvToBeanBuilder(reader).withType(AirBnbListings.class).build();
            List<AirBnbListings> list = csvToBean.parse();
            int vetor[] = new int[list.size()];
            int vetorPriceSelectionSort[] = new int[list.size()];
            int vetorPriceInsertionSort[] = new int[list.size()];
            int vetorPriceMergeSort[] = new int[list.size()];
            int vetorPriceQuickSort[] = new int[list.size()];
            
            int id[] = new int[list.size()];
            int availability_365[] = new int[list.size()];
            int calculated_host[] = new int[list.size()];
            int host_id[] = new int[list.size()];
            int minimun_nights[] = new int[list.size()];
            int number_reviews[] = new int[list.size()];
            String neighbourhood_group[] = new String[list.size()];
            String neighbourhood[] = new String[list.size()];
            String host_name[] = new String[list.size()];
            String last_review[] = new String[list.size()];
            String name[] = new String[list.size()];
            String room_type[] = new String[list.size()];
            double longitude[] = new double[list.size()];
            double latitude[] = new double[list.size()];
            
            // CRIANDO UMA MATRIZ PARA TESTE
//            String [][]matriz = new String[list.size()][16];
//            
//            int j = 0;
//	         for(AirBnbListings i : list) {
//	          	matriz[j][0] = i.getId();
//	          	matriz[j][1] = i.getName();
//	          	matriz[j][2] = i.getHost_id();
//	          	matriz[j][3] = i.getHost_name();
//	          	matriz[j][4] = i.getNeighbourhood_group();
//	          	matriz[j][5] = i.getNeighbourhood();
//	          	matriz[j][6] = i.getLatitude();
//	          	matriz[j][7] = i.getLongitude();
//	          	matriz[j][8] = i.getRoom_type();
//	          	matriz[j][9] = i.getPrice();
//	          	matriz[j][10] = i.getMinimum_nights();
//	          	matriz[j][11] = i.getNumber_of_reviews();
//	          	matriz[j][12] = i.getLast_review();
//	          	matriz[j][13] = i.getReviews_per_month();
//	          	matriz[j][14] = i.getCalculated_host_listings_count();
//	        	matriz[j][15] = i.getAvailability_365();
//	          	j++;
//	         }
	         
            System.out.println("LISTA LIDA DO ARQUIVO LISTINGS_REVIEW_DATE.CSV");
            
            // Colocando todos os prices do arrayList em um vetor simples.
            int j = 0;
            for(AirBnbListings i : list) {
            	vetor[j] = Integer.parseInt(i.getPrice());
            	id[j] = Integer.parseInt(i.getId());
            	availability_365[j] = Integer.parseInt(i.getAvailability_365());
            	calculated_host[j] = Integer.parseInt(i.getCalculated_host_listings_count());
            	host_id[j] = Integer.parseInt(i.getHost_id());
            	minimun_nights[j] = Integer.parseInt(i.getMinimum_nights());
            	number_reviews[j] = Integer.parseInt(i.getNumber_of_reviews());
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
            
            // Transformando todos os strings em inteiro para realizar sort do price.
            for (int i = 0; i < vetor.length; i++) {
            	vetorPriceSelectionSort[i] = vetor[i];
            }
            
            //listings_price_selectionSort_medioCaso.csv
            selectionSort(vetorPriceSelectionSort);
            
            //listings_price_selectionSort_melhorCaso.csv
            selectionSort(vetorPriceSelectionSort);
                  
            //listings_price_selectionSort_piorCaso.csv
            ordenarDecrescente(vetorPriceSelectionSort); // Deixa o vetor do maior para o menor
            selectionSort(vetorPriceSelectionSort); // E novamente ordena do menor para o maior
            
            // INSERTION SORT --------------------------------------------------------------------------
            
            // Transformando todos os strings em inteiro para realizar sort do price.
            for (int i = 0; i < vetor.length; i++) {
            	vetorPriceInsertionSort[i] = vetor[i];
            }
            
            System.out.println("ANTESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
            System.out.println(id[0]);
            System.out.println(vetorPriceInsertionSort[0]);
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
            
            System.out.println("DEPOISSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
            //listings_price_insertionSort_medioCaso.csv
            insertionSort(vetorPriceInsertionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);
            System.out.println(id[0]);
            System.out.println(vetorPriceInsertionSort[0]);
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
            
            
            //listings_price_insertionSort_melhorCaso.csv
            insertionSort(vetorPriceInsertionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);
            
            
            //listings_price_insertionSort_piorCaso.csv
            ordenarDecrescente(vetorPriceInsertionSort);
            insertionSort(vetorPriceInsertionSort, id, availability_365, calculated_host, host_id, minimun_nights, number_reviews, neighbourhood_group, neighbourhood, host_name, last_review, name, room_type, longitude, latitude);
            //System.out.println(vetorPriceInsertionSort[0]);
            //printarArrayInt(vetorPriceInsertionSort);
            
            // MERGE SORT -----------------------------------------------------------------------------
            
            for (int i = 0; i < vetor.length; i++) {
            	vetorPriceMergeSort[i] = vetor[i];
            }
            
            //listings_price_mergeSort_medioCaso.csv
            int vetorAux[] = new int[vetorPriceMergeSort.length];
            mergeSort(vetorPriceMergeSort, vetorAux, 0, vetorPriceMergeSort.length-1);
            
            //listings_price_mergeSort_melhorCaso.csv
            int vetorAux2[] = new int[vetorPriceMergeSort.length];
            mergeSort(vetorPriceMergeSort, vetorAux2, 0, vetorPriceMergeSort.length-1);
            
            //listings_price_mergeSort_piorCaso.csv
            int vetorAux3[] = new int[vetorPriceMergeSort.length];
            ordenarDecrescente(vetorPriceMergeSort);
            mergeSort(vetorPriceMergeSort, vetorAux3, 0, vetorPriceMergeSort.length-1);
            
            // QUICK SORT ---------------------------------------------------------------------------
            
            for (int i = 0; i < vetor.length; i++) {
            	vetorPriceQuickSort[i] = vetor[i];
            }
             
            //listings_price_quickSort_medioCaso.csv
            quickSort(vetorPriceQuickSort, 0, vetorPriceQuickSort.length-1);

            //listings_price_quickSort_medioCaso.csv
            quickSort(vetorPriceQuickSort, 0, vetorPriceQuickSort.length-1);
            
            //listings_price_quickSort_medioCaso.csv
            ordenarDecrescente(vetorPriceQuickSort);
            quickSort(vetorPriceQuickSort, 0, vetorPriceQuickSort.length-1);
            //printarArrayInt(vetorPriceQuickSort);
            
            // QUICK SORT MEDIANA DE TRES ----------------------------------------------------------
            
            //quicksortMedianaDeTres(A, 0, A.length - 1);
            
        } catch (IOException e) {
            e.printStackTrace();
        }
  
    }
   
	public static void selectionSort(int[] v) {	
    	for (int i = 0; i < v.length; i++) {
    		
    		int i_menor = i;
    		for (int j = i + 1; j < v.length; j++)
    			if (v[j] < v[i_menor])
    				i_menor = j;
    		
    		int aux = v[i];
    		v[i] = v[i_menor];
    		v[i_menor] = aux;
    	
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
    
    public static void insertionSort(int array[], int array2[], int array3[], int array4[], int array5[], int array6[], int array7[], String array8[],
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
    
    private static void mergeSort(int[] vetor, int[] vetorAux, int ini, int fim) {
		
		if (ini < fim) {
			int meio = (ini + fim) / 2;
			mergeSort(vetor, vetorAux, ini, meio);
			mergeSort(vetor, vetorAux, meio+1, fim);
			intercalar(vetor, vetorAux, ini, meio, fim);
		}
	}

	private static void intercalar(int[] vetor, int[] vetorAux, int ini, int meio, int fim) {
		
		for(int k = ini; k <= fim; k++) {
			vetorAux[k] = vetor[k];
		}
			int i = ini;
			int j = meio + 1;
			
		for(int k = ini; k <= fim; k++) {
			if (i > meio) vetor[k] = vetorAux[j++];
			else if (j > fim) vetor[k] = vetorAux[i++];
			else if (vetorAux[i] < vetorAux[j]) vetor[k] = vetorAux[i++];
			else vetor[k] = vetorAux[j++];
		}
		
	}
	
	private static void quickSort(int[] vetor, int inicio, int fim) {
        if (inicio < fim) {
               int posicaoPivo = separar(vetor, inicio, fim);
               quickSort(vetor, inicio, posicaoPivo - 1);
               quickSort(vetor, posicaoPivo + 1, fim);
        }
  }

  private static int separar(int[] vetor, int inicio, int fim) {
        int pivo = vetor[inicio];
        int i = inicio + 1, f = fim;
        while (i <= f) {
               if (vetor[i] <= pivo)
                      i++;
               else if (pivo < vetor[f])
                      f--;
               else {
                      int troca = vetor[i];
                      vetor[i] = vetor[f];
                      vetor[f] = troca;
                      i++;
                      f--;
               }
        }
        vetor[inicio] = vetor[f];
        vetor[f] = pivo;
        return f;
  }
  
  // quick sort mediana de tres
  
  // couting?
  
  // 
  
  
}
