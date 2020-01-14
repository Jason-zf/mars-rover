package com.thoughtworks.marsrover;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.ToString;

/**
 * 以北作为平面坐标系y轴正方向,东作为x轴的正方向
 */
@Getter
@Builder
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Location {

    private int x;
    private int y;

}
