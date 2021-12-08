package com.niilsa.GeometryCalculator.logic;

import com.niilsa.GeometryCalculator.entity.ObservableTriangle;

import java.util.HashMap;
import java.util.Map;

public class TriangleStore implements Observer {
    private final Map<Integer, Parameters> parametersMap = new HashMap<>();
    private final Calculator calculator = new Calculator();
    private static TriangleStore instance = new TriangleStore();

    private TriangleStore() {
    }

    public static TriangleStore getInstance() {
        return instance;
    }

    public void update(ObservableTriangle triangle) {
        double area = calculator.calculateArea(triangle);
        double perimeter = calculator.calculatePerimeter(triangle);
        parametersMap.put(triangle.getId(), new Parameters(area, perimeter));
    }


}
