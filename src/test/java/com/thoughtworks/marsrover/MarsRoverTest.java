package com.thoughtworks.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MarsRoverTest {

    private MarsRover marsRover;

    @Before
    public void setUp() {
        Location location = Location.builder()
            .x(0)
            .y(0)
            .build();
        marsRover = new MarsRover(location);
    }

    @Test
    public void should_return_correct_location_when_mars_rover_move_in_x_direction() {
        assertEquals(1, marsRover.move().getX());
    }
}