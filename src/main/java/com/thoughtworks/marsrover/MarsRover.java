package com.thoughtworks.marsrover;

import java.util.Arrays;

public class MarsRover {

    private Location location;
    private Direction direction;

    public MarsRover(Location location, Direction direction) {
        this.location = location;
        this.direction = direction;
    }

    public Location move() {
        switch (direction) {
            case N:
                return Location.builder()
                    .x(location.getX())
                    .y(location.getY() + 1)
                    .build();
            case S:
                return Location.builder()
                    .x(location.getX())
                    .y(location.getY() - 1)
                    .build();
            case W:
                return Location.builder()
                    .x(location.getX() - 1)
                    .y(location.getY())
                    .build();
            case E:
                return Location.builder()
                    .x(location.getX() + 1)
                    .y(location.getY())
                    .build();
            default:
                throw new RuntimeException("not support direction");
        }
    }

    public Direction turnLeft() {
        return Arrays.stream(Direction.values()).filter(it -> it.getValue() == (direction.getValue() + 1) % 4)
            .findFirst()
            .orElseThrow(RuntimeException::new);
    }

    public Direction turnRight() {
        return Arrays.stream(Direction.values()).filter(it -> it.getValue() == (direction.getValue() + 3) % 4)
            .findFirst()
            .orElseThrow(RuntimeException::new);
    }
}
