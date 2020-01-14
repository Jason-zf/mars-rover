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
        marsRover = new MarsRover(location, Direction.E);
    }

    @Test
    public void should_return_correct_location_when_mars_rover_move_in_x_direction() {
        Location originalLocation = Location.builder()
            .x(0)
            .y(0)
            .build();
        marsRover = new MarsRover(originalLocation, Direction.E);
        Location location = marsRover.move();
        assertEquals(1, location.getX());
        assertEquals(0, location.getY());
    }

    @Test
    public void should_return_correct_location_when_mars_rover_move_in_y_direction() {
        Location originalLocation = Location.builder()
            .x(0)
            .y(0)
            .build();
        marsRover = new MarsRover(originalLocation, Direction.N);
        Location location = marsRover.move();
        assertEquals(1, location.getY());
        assertEquals(0, location.getX());

    }
}