package com.niilsa.GeometryCalculator.repository.specification;

import com.niilsa.GeometryCalculator.entity.ObservableTriangle;
import com.niilsa.GeometryCalculator.entity.Point;

public class SingleApexSpecification implements Specification {
    private final Point apex;

    public SingleApexSpecification(Point apex) {
        this.apex = apex;
    }

    @Override
    public boolean specified(ObservableTriangle triangle) {
        Point firstApex = triangle.getFirstApex();
        Point secondApex = triangle.getSecondApex();
        Point thirdApex = triangle.getThirdApex();
        return apex.equals(firstApex) | apex.equals(secondApex) | apex.equals(thirdApex);
    }
}
