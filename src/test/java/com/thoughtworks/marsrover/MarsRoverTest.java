package com.thoughtworks.marsrover;

import static org.junit.Assert.assertEquals;

import java.util.Arrays;
import java.util.List;
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
        marsRover = new MarsRover(originalLocation, Direction.N);
    }

    @Test
    public void should_return_correct_location_when_mars_rover_move_in_x_direction() {
        marsRover = new MarsRover(originalLocation, Direction.E);
        Location location = marsRover.move().getLocation();
        assertEquals(1, location.getX());
        assertEquals(0, location.getY());
    }

    @Test
    public void should_return_correct_location_when_mars_rover_move_in_y_direction() {
        Location location = marsRover.move().getLocation();
        assertEquals(1, location.getY());
        assertEquals(0, location.getX());
    }

    @Test
    public void should_return_correct_direction_when_mars_rover_turn_left() {
        Direction direction = marsRover.turnLeft().getDirection();
        assertEquals(Direction.W, direction);
    }

    @Test
    public void should_return_correct_direction_when_mars_rover_turn_right() {
        Direction direction = marsRover.turnRight().getDirection();
        assertEquals(Direction.E, direction);
    }

    @Test
    public void should_return_correct_location_and_direction_when_mars_rover_move_on_specific_instruct() {
        List<Instruct> instructs = Arrays.asList(Instruct.L, Instruct.M, Instruct.R, Instruct.M);
        instructs.forEach(instruct -> instruct.execute(marsRover));
        assertEquals(Direction.N, marsRover.getDirection());
        assertEquals(-1, marsRover.getLocation().getX());
        assertEquals(1, marsRover.getLocation().getY());
    }
}