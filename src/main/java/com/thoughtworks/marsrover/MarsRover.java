package com.thoughtworks.marsrover;

public class MarsRover {

    private Location location;

    public MarsRover(Location location) {
        this.location = location;
    }

    public Location move() {
        return Location.builder()
            .x(location.getX() + 1)
            .y(location.getY())
            .build();
    }

}
