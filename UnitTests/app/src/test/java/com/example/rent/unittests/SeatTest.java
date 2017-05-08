package com.example.rent.unittests;

import org.junit.Test;

/**
 * Created by RENT on 2017-04-25.
 */

public class SeatTest {

    @Test
    public void shouldSeatBeUnique(){
        Seat seat = new SeatBuilder().createSeat();
        seat.checkIfBooked();

    }
}
