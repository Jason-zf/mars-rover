package com.thoughtworks.marsrover;

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
        return direction.left();
    }

    public Direction turnRight() {
        return direction.right();
    }
}
