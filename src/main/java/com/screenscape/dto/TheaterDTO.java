package com.screenscape.dto;

public class TheaterDTO {
    private int theaterId;
    private String theaterName;
    private int seatsAvailable;

    private String city;

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return theaterName;
    }

    public void setTheaterName(String theaterName) {
        this.theaterName = theaterName;
    }

    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    public void setSeatsAvailable(int seatsAvailable) {
        this.seatsAvailable = seatsAvailable;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    @Override
    public String toString() {
        return "TheaterDTO{" +
                "theaterId=" + theaterId +
                ", theaterName='" + theaterName + '\'' +
                ", seatsAvailable=" + seatsAvailable +
                ", city='" + city + '\'' +
                '}';
    }
}
