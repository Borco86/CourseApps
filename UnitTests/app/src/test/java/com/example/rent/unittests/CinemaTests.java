package com.example.rent.unittests;

import org.junit.Test;
import static org.junit.Assert.*;


/**
 * Created by RENT on 2017-04-25.
 */

public class CinemaTests {
    @Test
    public void shouldSeatBeUnique(){
        Cinema cinema = new Cinema();
        cinema.bookSeat();
        assertEquals(isBooked(),);
    }

}
