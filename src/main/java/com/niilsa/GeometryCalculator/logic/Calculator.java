package com.niilsa.GeometryCalculator.logic;

import com.niilsa.GeometryCalculator.entity.Triangle;

public class Calculator {

    //TODO release methods
    public double calculateArea(Triangle triangle) {
        //S=0.5|(x2-x1)(y3-y1)-(x3-x1)(y2-y1)
        int triangleAreaDivider = 2;
        return ((triangle.getSecondApex().getX() - triangle.getFirstApex().getX()) *
                (triangle.getThirdApex().getY() - triangle.getFirstApex().getY()) -
                (triangle.getThirdApex().getX() - triangle.getFirstApex().getX()) *
                        (triangle.getSecondApex().getY() - triangle.getFirstApex().getY())) / triangleAreaDivider;
    }

    public double calculatePerimeter(Triangle triangle) {
        return triangle.getFirstApex().getX() - triangle.getSecondApex().getX();
    }


}
