package com.niilsa.GeometryCalculator.logic;

import com.niilsa.GeometryCalculator.data.DataValidator;
import com.niilsa.GeometryCalculator.entity.ObservableTriangle;
import com.niilsa.GeometryCalculator.entity.Point;

import java.util.*;

public class TriangleCreator {
    private final static String DELEMITER = "[ ]+";

    public ObservableTriangle getTrianglesFromLine(String line, TriangleValidator triangleValidator, DataValidator dataValidator) {
        Map<Integer, Point> pointsMap = createMap(dataValidator, line);
        ObservableTriangle observableTriangle;
        if (triangleValidator.canCreateTriangle(pointsMap)) {
            observableTriangle = new ObservableTriangle(pointsMap);
        } else {
            observableTriangle = null;
        }
        return observableTriangle;
    }

    private Map<Integer, Point> createMap(DataValidator dataValidator, String line) {
        Map<Integer, Point> pointsMap = new HashMap<>();
        if (dataValidator.isLineValid(line)) {
            String[] coordinatesInTextFormat = line.split(DELEMITER);
            Queue<String> queue = new PriorityQueue<>();
            Collections.addAll(queue, coordinatesInTextFormat);
            int amountOfApex = 3;
            for (int i = 1; i < amountOfApex; i++) {
                double xcoordinate = Double.parseDouble(queue.poll());
                double ycoordinate = Double.parseDouble(queue.poll());
                pointsMap.put(i, new Point(xcoordinate, ycoordinate));
            }
        }
        return pointsMap;
    }
}

