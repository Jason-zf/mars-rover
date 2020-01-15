package com.thoughtworks;

import com.thoughtworks.marsrover.Direction;
import com.thoughtworks.marsrover.Instruct;
import com.thoughtworks.marsrover.Location;
import com.thoughtworks.marsrover.MarsRover;
import java.util.Arrays;
import java.util.List;

public class MarsRoverApplication {

    public static void main(String[] args) {
        List<Instruct> instructs = Arrays.asList(Instruct.R, Instruct.M, Instruct.M, Instruct.R, Instruct.M, Instruct.R);
        MarsRover marsRover = new MarsRover(Location.builder().x(100).y(90).build(), Direction.N);
        System.out.println("Original: " + marsRover);
        instructs.forEach(marsRover::execute);
        System.out.println("Current: " + marsRover);
    }
}
