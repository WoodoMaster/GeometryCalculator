package com.niilsa.repository.specification;

import com.niilsa.entity.ObservableTriangle;
import com.niilsa.entity.Point;

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
        boolean result;
        if (apex.equals(firstApex)) {
            result = true;
        } else if (apex.equals(secondApex)) {
            result = true;
        } else {
            result = apex.equals(thirdApex);
        }
        return result;
    }
}
