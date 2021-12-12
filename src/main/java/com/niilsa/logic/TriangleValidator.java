package com.niilsa.logic;

import com.niilsa.entity.Point;

import java.util.Map;

public class TriangleValidator {

    private static final double DELTA = 0.0001;

    public boolean canCreateTriangle(Map<Integer, Point> apexes) {
        double equationOfLine = (apexes.get(1).getY() - apexes.get(2).getY()) * apexes.get(3).getX()
                + (apexes.get(2).getX() - apexes.get(1).getX()) * apexes.get(3).getY()
                + (apexes.get(1).getX() * apexes.get(2).getY() - apexes.get(1).getY() * apexes.get(2).getX());
        return equationOfLine > DELTA;
    }

    public boolean canCreateTriangle(Point first, Point second, Point third) {
        double equationOfLine = (first.getY() - second.getY()) * third.getX()
                + (second.getX() - first.getX()) * third.getY()
                + (first.getX() * second.getY() - first.getY() * second.getX());
        return equationOfLine > DELTA;
    }
}
