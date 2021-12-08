package com.niilsa.GeometryCalculator.repository.specification;

import com.niilsa.GeometryCalculator.entity.ObservableTriangle;

public interface Specification {
    boolean specified(ObservableTriangle triangle);
}
