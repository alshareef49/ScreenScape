package com.screenscape.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
public class Theater {
    @Id
    private int theaterId;
    private String TheaterName;
    private int seatsAvailable;
    private String city;

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    public String getTheaterName() {
        return TheaterName;
    }

    public void setTheaterName(String theaterName) {
        TheaterName = theaterName;
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
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Theater theater)) return false;
        return theaterId == theater.theaterId && seatsAvailable == theater.seatsAvailable && Objects.equals(TheaterName, theater.TheaterName) && Objects.equals(city, theater.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(theaterId, TheaterName, seatsAvailable, city);
    }
}
