package com.niilsa.logic;

import com.niilsa.entity.Point;
import com.niilsa.entity.Triangle;

public class Calculator {
    public Calculator() {

    }

    public double calculateArea(Triangle triangle) {
        double divider = 2;
        double halfPerimeter = calculatePerimeter(triangle) / divider;
        Point firstApex = triangle.getFirstApex();
        Point secondApex = triangle.getSecondApex();
        Point thirdApex = triangle.getThirdApex();
        double firstSideLength = calculateSideLength(firstApex, secondApex);
        double secondSideLength = calculateSideLength(secondApex, thirdApex);
        double thirdSideLength = calculateSideLength(firstApex, thirdApex);
        return Math.sqrt(halfPerimeter * (halfPerimeter - firstSideLength) *
                (halfPerimeter - secondSideLength) * (halfPerimeter - thirdSideLength));


    }

    public double calculatePerimeter(Triangle triangle) {
        Point firstApex = triangle.getFirstApex();
        Point secondApex = triangle.getSecondApex();
        Point thirdApex = triangle.getThirdApex();
        double firstSideLength = calculateSideLength(firstApex, secondApex);
        double secondSideLength = calculateSideLength(secondApex, thirdApex);
        double thirdSideLength = calculateSideLength(firstApex, thirdApex);
        return firstSideLength + secondSideLength + thirdSideLength;
    }

    private double calculateSideLength(Point startPoint, Point endPoint) {
        double startPointX = startPoint.getX();
        double startPointY = startPoint.getY();
        double endPointX = endPoint.getX();
        double endPointY = endPoint.getY();
        return Math.sqrt((startPointX - endPointX) * (startPointX - endPointX) +
                (startPointY - endPointY) * (startPointY - endPointY));
    }


}
