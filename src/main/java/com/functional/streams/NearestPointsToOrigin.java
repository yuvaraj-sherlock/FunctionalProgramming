package com.functional.streams;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

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
    //dist = sqrt((x1-x2)^2 + (y1-y2)^2)

    Collections.sort(points,Comparator.comparingDouble(Point::distanceFromOrigin));
    System.out.println(points);

  }
}
