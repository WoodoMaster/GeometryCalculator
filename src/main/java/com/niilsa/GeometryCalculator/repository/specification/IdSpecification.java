package com.niilsa.GeometryCalculator.repository.specification;

import com.niilsa.GeometryCalculator.entity.ObservableTriangle;


import java.util.Objects;

public class IdSpecification implements Specification {
    private final Integer id;

    public IdSpecification(Integer id) {
        this.id = id;
    }

    @Override
    public boolean specified(ObservableTriangle triangle) {

        return Objects.equals(triangle.getId(), id);
    }
}
