package com.thoughtworks.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MarsRoverTest {

    private MarsRover marsRover;
    private Location originalLocation;

    @Before
    public void setUp() {
        originalLocation = Location.builder()
            .x(0)
            .y(0)
            .build();
    }

    @Test
    public void should_return_correct_location_when_mars_rover_move_in_x_direction() {
        marsRover = new MarsRover(originalLocation, Direction.E);
        Location location = marsRover.move();
        assertEquals(1, location.getX());
        assertEquals(0, location.getY());
    }

    @Test
    public void should_return_correct_location_when_mars_rover_move_in_y_direction() {
        marsRover = new MarsRover(originalLocation, Direction.N);
        Location location = marsRover.move();
        assertEquals(1, location.getY());
        assertEquals(0, location.getX());
    }

    @Test
    public void should_return_correct_direction_when_mars_rover_turn_left() {
        marsRover = new MarsRover(originalLocation, Direction.N);
        Direction direction = marsRover.turnLeft();
        assertEquals(Direction.W, direction);
    }

    @Test
    public void should_return_correct_direction_when_mars_rover_turn_right() {
        marsRover = new MarsRover(originalLocation, Direction.N);
        Direction direction = marsRover.turnRight();
        assertEquals(Direction.E,direction);
    }
}