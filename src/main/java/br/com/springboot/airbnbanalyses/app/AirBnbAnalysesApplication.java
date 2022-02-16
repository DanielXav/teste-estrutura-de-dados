package br.com.springboot.airbnbanalyses.app;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import br.com.springboot.airbnbanalyses.entities.AirBnbListings;
import br.com.springboot.airbnbanalyses.sort.QuickMediana3;
import br.com.springboot.airbnbanalyses.sort.SelectionSort;

public class AirBnbAnalysesApplication {

	public static void main (String []args) throws ParseException {
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
            
            Date[] auxiliarDate = new Date[listings_review_date.size()];
            
            SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy");
            
//            for(int i = 0; i < auxiliarDate.length; i++) {
//            	
//            	String aux = arrayLastReview[i];
//            	if (aux.length() > 1) {
//            		if (aux.equals(null) && aux.equals("null")) {
//            			
//            		}
//            		else {
//            			Date data = formatter.parse(aux);
//                        String auxString = formatter.format(data);
//                        System.out.println(auxString);
//            		}
//            	
//            		
//            	}
//                
//            }
            
            long tempoInicial = System.nanoTime();
            
            //SelectionSort.SelectionStringDate(auxiliarDate, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayName, arrayLatitude, arrayLongitude);
            SelectionSort.SelectSort(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
            
            
            long tempoFinal = System.nanoTime();
            
            System.out.printf("SelectionSort Medio caso: %.3f ms%n", (tempoFinal - tempoInicial) / 1000000d); // Calculando o tempo gasto

            
            tempoInicial = System.nanoTime();
            SelectionSort.SelectSort(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
            tempoFinal = System.nanoTime();
            
            System.out.printf("SelectionSort Melhor caso: %.3f ms%n", (tempoFinal - tempoInicial) / 1000000d); // Calculando o tempo gasto

            tempoInicial = System.nanoTime();
            SelectionSort.SelectSortInverse(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
            SelectionSort.SelectSort(arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayName, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
            tempoFinal = System.nanoTime();
            
            System.out.printf("SelectionSort Pior caso: %.3f ms%n", (tempoFinal - tempoInicial) / 1000000d); // Calculando o tempo gasto
            
            
        } catch (IOException e) {
            e.printStackTrace();
        } 
    }

}