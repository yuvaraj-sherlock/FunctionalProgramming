package com.functional.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Data
@AllArgsConstructor
class Point{
  int latitude;
  int longitude;

  public double distanceFromOrigin() {
    return Math.sqrt(latitude * latitude + longitude * longitude);
  }
}
public class NearestPointsToOrigin {
  public static void main(String[] args) {
    List<Point> points = Arrays.asList(
            new Point(2, 3),
            new Point(0, 2),
            new Point(2, 2),
            new Point(5, 5),
            new Point(1, 1),
            new Point(7, 9)
    );

    List<Point> collect = points.stream()
            .sorted(Comparator.comparingDouble(Point::distanceFromOrigin))
            .collect(Collectors.toList());
    System.out.println(collect);


  }
}
