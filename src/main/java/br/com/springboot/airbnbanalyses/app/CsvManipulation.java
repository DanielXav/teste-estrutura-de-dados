package br.com.springboot.airbnbanalyses.app;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import com.opencsv.bean.StatefulBeanToCsv;
import com.opencsv.bean.StatefulBeanToCsvBuilder;
import com.opencsv.exceptions.CsvDataTypeMismatchException;
import com.opencsv.exceptions.CsvRequiredFieldEmptyException;

import br.com.springboot.airbnbanalyses.entities.AirBnbListings;

public class CsvManipulation {

    public static void convertDate(List<AirBnbListings> list) {
        for (AirBnbListings i : list) {
            try {
                String dataNoFormat = i.getLast_review();

                DateFormat formatUS = new SimpleDateFormat("yyyy-MM-dd");
                Date date = formatUS.parse(dataNoFormat);

                DateFormat formatBR = new SimpleDateFormat("dd/MM/yyyy");
                String dataConvertida = formatBR.format(date);
                i.setLast_review(dataConvertida);
            } catch (ParseException e) {
                e.getStackTrace();

            }
        }
    }

    public static void writeCsv(String path, String pathUpper, String pathLower, List<AirBnbListings> list, int avgPrice) throws CsvDataTypeMismatchException, CsvRequiredFieldEmptyException, ParseException {
        try {

            List<AirBnbListings> data = new ArrayList<>();
            List<AirBnbListings> upperAvgPrices = new ArrayList<>();
            List<AirBnbListings> lowerAvgPrices = new ArrayList<>();

            //Adiciona todos itens na lista que será utilizada para organizar as datas
            for (AirBnbListings i : list) {
                data.add(new AirBnbListings(i.getId(), i.getName(), i.getHost_id(), i.getHost_name(), i.getNeighbourhood_group(), 
                		i.getNeighbourhood(), i.getLatitude(), i.getLongitude(), i.getRoom_type(), i.getPrice(), i.getMinimum_nights(),
                		i.getNumber_of_reviews(), i.getLast_review(), i.getReviews_per_month(), i.getCalculated_host_listings_count(),
                		i.getAvailability_365()
                		));
            }
            
            //Adiciona todos itens nas listas para criar os arquivos de preços acima ou abaixo da média (preços iguais à media são cosniderados como maiores)
            for (AirBnbListings i : list) {
                String[] airBnbItem = {};

                if (Integer.parseInt(i.getPrice()) >= avgPrice) {
                    upperAvgPrices.add(new AirBnbListings(i.getId(), i.getName(), i.getHost_id(), i.getHost_name(), i.getNeighbourhood_group(),
                            i.getNeighbourhood(), i.getLatitude(), i.getLongitude(), i.getRoom_type(), i.getPrice(), i.getMinimum_nights(),
                            i.getNumber_of_reviews(), i.getLast_review(), i.getReviews_per_month(), i.getCalculated_host_listings_count(),
                            i.getAvailability_365()));          
                }
                else {
                	lowerAvgPrices.add(new AirBnbListings(i.getId(), i.getName(), i.getHost_id(), i.getHost_name(), i.getNeighbourhood_group(),
                            i.getNeighbourhood(), i.getLatitude(), i.getLongitude(), i.getRoom_type(), i.getPrice(), i.getMinimum_nights(),
                            i.getNumber_of_reviews(), i.getLast_review(), i.getReviews_per_month(), i.getCalculated_host_listings_count(),
                            i.getAvailability_365())); 
                }
            }
            
            Writer writer = Files.newBufferedWriter(Paths.get(path));
            StatefulBeanToCsv<AirBnbListings> beanToCsv = new StatefulBeanToCsvBuilder(writer).build();
            beanToCsv.write(data);           
            writer.flush();
            writer.close();
            
            Writer writerUpper = Files.newBufferedWriter(Paths.get(pathUpper));
            StatefulBeanToCsv<AirBnbListings> beanToCsvUpper = new StatefulBeanToCsvBuilder(writerUpper).build();
            beanToCsvUpper.write(upperAvgPrices);
            writerUpper.flush();
            writerUpper.close();
            
            Writer writerLower = Files.newBufferedWriter(Paths.get(pathLower));
            StatefulBeanToCsv<AirBnbListings> beanToCsvLower = new StatefulBeanToCsvBuilder(writerLower).build();
            beanToCsvLower.write(lowerAvgPrices);
            writerLower.flush();
            writerLower.close();
                       
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

}
