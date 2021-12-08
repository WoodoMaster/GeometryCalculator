package com.niilsa.GeometryCalculator.logic;

import com.niilsa.GeometryCalculator.entity.ObservableTriangle;

public interface Observer {
    void update(ObservableTriangle observableTriangle);
}
