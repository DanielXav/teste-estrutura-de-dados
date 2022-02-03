package br.com.springboot.airbnbanalyses.app;

import java.io.IOException;
import java.text.ParseException;
import java.util.List;

import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import br.com.springboot.airbnbanalyses.entities.AirBnbListings;
import br.com.springboot.airbnbanalyses.sort.InsertionSort;
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
            
            //SELECTION SORT ---------------------------------------------------------------------
           
            //listings_names_selectionSort_medioCaso.csv
            //SelectionSort.SelectionString(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
	            
            //listings_names_selectionSort_melhorCaso.csv
	        //SelectionSort.SelectionString(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
	         
	        //listings_names_selectionSort_piorCaso.csv
	        //SelectionSort.SelectionStringInverse(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
	        //SelectionSort.SelectionString(arrayName, arrayPrice, arrayId, arrayHostId, arrayMinimumNights, arrayNumberOfReviews, arrayCalculatedHostListingsCount, arrayAvaiability365, arrayHostName, arrayNeighbourhoodGroup, arrayNeighbourhood, arrayRoomType, arrayLastReview, arrayLatitude, arrayLongitude);
	          
//            System.out.println("ANTESSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSSS");
//	          System.out.println(id[0]);
//	          System.out.println(vetorPriceSelectionSort[0]);
//	          System.out.println(availability_365[0]);
//	          System.out.println(calculated_host[0]);
//	          System.out.println(host_id[0]);
//	          System.out.println(minimun_nights[0]);
//	          System.out.println(number_reviews[0]);
//	          System.out.println(neighbourhood_group[0]);
//	          System.out.println(neighbourhood[0]);
//	          System.out.println(host_name[0]);
//	          System.out.println(last_review[0]);
//	          System.out.println(name[0]);
//	          System.out.println(room_type[0]);
//	          System.out.println(longitude[0]);
//	          System.out.println(latitude[0]);
            
            System.out.println(arrayName[0]);
            System.out.println(arrayId[0]);
            System.out.println(arrayPrice[0]);
	        //INSERTION SORT ---------------------------------------------------------------------
	        InsertionSort.insertSortStr(arrayName, arrayId, arrayPrice);  
	        System.out.println(arrayName[arrayName.length-1]);
            System.out.println(arrayId[arrayId.length-1]);
            System.out.println(arrayPrice[arrayPrice.length-1]);

        } catch (IOException e) {
            e.printStackTrace();
        } 
    }

}