package com.example.rent.unittests;

public class SeatBuilder {
    private boolean isBooked;

    public SeatBuilder setIsBooked(boolean isBooked) {
        this.isBooked = isBooked;
        return this;
    }

    public Seat createSeat() {
        return new Seat(isBooked);
    }
}