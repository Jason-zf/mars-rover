package com.thoughtworks.marsrover;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class MarsRoverTest {

    private MarsRover marsRover;

    @Before
    public void setUp() {
        marsRover = MarsRover.builder().build();
    }

    @Test
    public void mars_rover_can_move() {
        assertEquals("mars rover move", marsRover.move());
    }
}