package com.thoughtworks.marsrover;

import java.util.Arrays;
import lombok.Getter;

@Getter
public class MarsRover {

    private Location location;
    private Direction direction;

    public MarsRover(Location location, Direction direction) {
        this.location = location;
        this.direction = direction;
    }

    public MarsRover move() {
        switch (direction) {
            case N:
                location = Location.builder()
                    .x(location.getX())
                    .y(location.getY() + 1)
                    .build();
                return this;
            case S:
                location = Location.builder()
                    .x(location.getX())
                    .y(location.getY() - 1)
                    .build();
                return this;
            case W:
                location = Location.builder()
                    .x(location.getX() - 1)
                    .y(location.getY())
                    .build();
                return this;
            case E:
                location = Location.builder()
                    .x(location.getX() + 1)
                    .y(location.getY())
                    .build();
                return this;
            default:
                throw new RuntimeException("not support direction");
        }
    }

    public MarsRover turnLeft() {
        direction = Arrays.stream(Direction.values()).filter(it -> it.getValue() == (direction.getValue() + 1) % 4)
            .findFirst()
            .orElseThrow(RuntimeException::new);
        return this;
    }

    public MarsRover turnRight() {
        direction = Arrays.stream(Direction.values()).filter(it -> it.getValue() == (direction.getValue() + 3) % 4)
            .findFirst()
            .orElseThrow(RuntimeException::new);
        return this;
    }
}
