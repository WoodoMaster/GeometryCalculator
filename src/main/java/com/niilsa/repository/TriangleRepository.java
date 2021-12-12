package com.niilsa.repository;

import com.niilsa.entity.ObservableTriangle;
import com.niilsa.repository.specification.Specification;

import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

public interface TriangleRepository {

    void add(ObservableTriangle observableTriangle);

    void delete(ObservableTriangle observableTriangle);

    void update(ObservableTriangle observableTriangle);

    List<ObservableTriangle> query(Specification specification);

    TreeSet<ObservableTriangle> sort(Comparator<ObservableTriangle> comparator);


}
