package com.niilsa.repository.specification;

import com.niilsa.entity.ObservableTriangle;
import com.niilsa.logic.Calculator;

public class AreaSpecification implements Specification {
    private final double minArea;
    private final double maxArea;
    private final Calculator calculator;

    public AreaSpecification(double minArea, double maxArea, Calculator calculator) {
        this.minArea = minArea;
        this.maxArea = maxArea;
        this.calculator = calculator;
    }


    @Override
    public boolean specified(ObservableTriangle triangle) {
        double inputArea = calculator.calculateArea(triangle);
        return minArea <= inputArea && inputArea <= maxArea;
    }
}
