package com.niilsa.GeometryCalculator.repository.comparator;

import com.niilsa.GeometryCalculator.entity.ObservableTriangle;
import com.niilsa.GeometryCalculator.logic.Calculator;

import java.util.Comparator;

public class PerimeterComparator implements Comparator<ObservableTriangle> {
    private final Calculator calculator;

    public PerimeterComparator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int compare(ObservableTriangle firstTriangle, ObservableTriangle secondTriangle) {
        double firstPerimeter = calculator.calculatePerimeter(firstTriangle);
        double secondPerimeter = calculator.calculatePerimeter(secondTriangle);
        return Double.compare(firstPerimeter, secondPerimeter);
    }
}
