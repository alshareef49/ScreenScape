package com.screenscape.dto;

import java.time.LocalDate;
import java.time.LocalTime;

public class ShowDTO {
    private int showId;
    private LocalTime showTime;
    private LocalDate startDate;
    private LocalDate endDate;
    private int ticketPrice;

    private int movieId;
    private int theaterId;

    public int getShowId() {
        return showId;
    }

    public void setShowId(int showId) {
        this.showId = showId;
    }

    public LocalTime getShowTime() {
        return showTime;
    }

    public void setShowTime(LocalTime showTime) {
        this.showTime = showTime;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    public int getTicketPrice() {
        return ticketPrice;
    }

    public void setTicketPrice(int ticketPrice) {
        this.ticketPrice = ticketPrice;
    }

    public int getMovieId() {
        return movieId;
    }

    public void setMovieId(int movieId) {
        this.movieId = movieId;
    }

    public int getTheaterId() {
        return theaterId;
    }

    public void setTheaterId(int theaterId) {
        this.theaterId = theaterId;
    }

    @Override
    public String toString() {
        return "ShowDTO{" +
                "showId=" + showId +
                ", showTime=" + showTime +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                ", ticketPrice=" + ticketPrice +
                ", movieId=" + movieId +
                ", theaterId=" + theaterId +
                '}';
    }
}
