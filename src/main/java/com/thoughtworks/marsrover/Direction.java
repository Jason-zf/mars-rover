package com.thoughtworks.marsrover;

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
}
