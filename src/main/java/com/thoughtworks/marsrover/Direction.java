package com.thoughtworks.marsrover;

import java.util.Arrays;
import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum Direction {
    E(0),
    N(1),
    W(2),
    S(3);

    private int value;

    public Direction left() {
        return Arrays.stream(Direction.values()).filter(it -> it.value == (this.value + 1) % 4)
            .findFirst()
            .orElseThrow(RuntimeException::new);
    }

    public Direction right() {
        return Arrays.stream(Direction.values()).filter(it -> it.value == (this.value + 3) % 4)
            .findFirst()
            .orElseThrow(RuntimeException::new);
    }
}
