package com.thoughtworks.marsrover;

public enum Instruct {
    L,
    R,
    M;

    public MarsRover execute(MarsRover marsRover) {
        switch (this) {
            case L:
                return marsRover.turnLeft();
            case R:
                return marsRover.turnRight();
            case M:
                return marsRover.move();
            default:
                throw new RuntimeException();
        }
    }
}
