package com.niilsa.repository.specification;

import com.niilsa.entity.ObservableTriangle;
import com.niilsa.logic.Calculator;
import com.niilsa.entity.Parameters;

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
