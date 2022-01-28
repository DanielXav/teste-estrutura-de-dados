package br.com.springboot.airbnbanalyses.entities;

import java.io.Serializable;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class AirBnbListings implements Serializable {
    static final long serialVersionUID = 1L;
    private String id;
    private String name;
    private String host_id;
    private String host_name;
    private String neighbourhood_group;
    private String neighbourhood;
    private String latitude;
    private String longitude;
    private String room_type;
    private String price;
    private String minimum_nights;
    private String number_of_reviews;
    private String last_review;
    private String reviews_per_month;
    private String calculated_host_listings_count;
    private String availability_365;

    public AirBnbListings() {

    }

    public AirBnbListings(String id, String name, String host_id, String host_name, String neighbourhood_group, String neighbourhood, String latitude, String longitude, String room_type, String price, String minimum_nights, String number_of_reviews, String last_review, String reviews_per_month, String calculated_host_listings_count, String availability_365) throws ParseException {
        this.id = id;
        this.name = name;
        this.host_id = host_id;
        this.host_name = host_name;
        this.neighbourhood_group = neighbourhood_group;
        this.neighbourhood = neighbourhood;
        this.latitude = latitude;
        this.longitude = longitude;
        this.room_type = room_type;
        this.price = price;
        this.minimum_nights = minimum_nights;
        this.number_of_reviews = number_of_reviews;
        this.last_review = last_review;
        this.reviews_per_month = reviews_per_month;
        this.calculated_host_listings_count = calculated_host_listings_count;
        this.availability_365 = availability_365;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getHost_id() {
        return host_id;
    }

    public void setHost_id(String host_id) {
        this.host_id = host_id;
    }

    public String getHost_name() {
        return host_name;
    }

    public void setHost_name(String host_name) {
        this.host_name = host_name;
    }

    public String getNeighbourhood_group() {
        return neighbourhood_group;
    }

    public void setNeighbourhood_group(String neighbourhood_group) {
        this.neighbourhood_group = neighbourhood_group;
    }

    public String getNeighbourhood() {
        return neighbourhood;
    }

    public void setNeighbourhood(String neighbourhood) {
        this.neighbourhood = neighbourhood;
    }

    public String getLatitude() {
        return latitude;
    }

    public void setLatitude(String latitude) {
        this.latitude = latitude;
    }

    public String getLongitude() {
        return longitude;
    }

    public void setLongitude(String longitude) {
        this.longitude = longitude;
    }

    public String getRoom_type() {
        return room_type;
    }

    public void setRoom_type(String room_type) {
        this.room_type = room_type;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getMinimum_nights() {
        return minimum_nights;
    }

    public void setMinimum_nights(String minimum_nights) {
        this.minimum_nights = minimum_nights;
    }

    public String getNumber_of_reviews() {
        return number_of_reviews;
    }

    public void setNumber_of_reviews(String number_of_reviews) {
        this.number_of_reviews = number_of_reviews;
    }

    public String getLast_review() {
        return last_review;
    }

    public void setLast_review(String last_review) {
        this.last_review = last_review;
    }

    public String getReviews_per_month() {
        return reviews_per_month;
    }

    public void setReviews_per_month(String reviews_per_month) {
        this.reviews_per_month = reviews_per_month;
    }

    public String getCalculated_host_listings_count() {
        return calculated_host_listings_count;
    }

    public void setCalculated_host_listings_count(String calculated_host_listings_count) {
        this.calculated_host_listings_count = calculated_host_listings_count;
    }

    public String getAvailability_365() {
        return availability_365;
    }

    public void setAvailability_365(String availability_365) {
        this.availability_365 = availability_365;
    }

    @Override
    public String toString() {
        return "AirBnbListings{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", host_id='" + host_id + '\'' +
                ", host_name='" + host_name + '\'' +
                ", neighbourhood_group='" + neighbourhood_group + '\'' +
                ", neighbourhood='" + neighbourhood + '\'' +
                ", latitude='" + latitude + '\'' +
                ", longitude='" + longitude + '\'' +
                ", room_type='" + room_type + '\'' +
                ", price='" + price + '\'' +
                ", minimum_nights='" + minimum_nights + '\'' +
                ", number_of_reviews='" + number_of_reviews + '\'' +
                ", last_review='" + last_review + '\'' +
                ", reviews_per_month='" + reviews_per_month + '\'' +
                ", calculated_host_listings_count='" + calculated_host_listings_count + '\'' +
                ", availability_365='" + availability_365 + '\'' +
                '}';
    }
}
