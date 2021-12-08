package com.niilsa.GeometryCalculator.repository.specification;

import com.niilsa.GeometryCalculator.entity.ObservableTriangle;
import com.niilsa.GeometryCalculator.logic.Calculator;
import com.niilsa.GeometryCalculator.logic.Parameters;

public class PerimeterSpecification implements Specification {
    private final double minPerimeter;
    private final double maxPerimeter;
    private final Calculator calculator;

    public PerimeterSpecification(Parameters minParameter, Parameters maxParameter, Calculator calculator) {
        this.minPerimeter = minParameter.getPerimeter();
        this.maxPerimeter = maxParameter.getPerimeter();
        this.calculator = calculator;
    }


    @Override
    public boolean specified(ObservableTriangle triangle) {
        double inputPerimeter = calculator.calculatePerimeter(triangle);
        return minPerimeter <= inputPerimeter && inputPerimeter <= maxPerimeter;
    }
}
