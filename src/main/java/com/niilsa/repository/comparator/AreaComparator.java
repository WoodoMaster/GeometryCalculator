package com.niilsa.repository.comparator;

import com.niilsa.entity.ObservableTriangle;
import com.niilsa.logic.Calculator;

import java.util.Comparator;

public class AreaComparator implements Comparator<ObservableTriangle> {
    private final Calculator calculator;

    public AreaComparator(Calculator calculator) {
        this.calculator = calculator;
    }

    @Override
    public int compare(ObservableTriangle firstTriangle, ObservableTriangle secondTriangle) {
        double firstArea = calculator.calculateArea(firstTriangle);
        double secondArea = calculator.calculateArea(secondTriangle);
        return Double.compare(firstArea, secondArea);
    }
}
