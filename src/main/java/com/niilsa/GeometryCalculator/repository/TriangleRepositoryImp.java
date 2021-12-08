package com.niilsa.GeometryCalculator.repository;

import com.niilsa.GeometryCalculator.entity.ObservableTriangle;
import com.niilsa.GeometryCalculator.repository.specification.Specification;

import java.util.*;

public class TriangleRepositoryImp implements TriangleRepository {
    private final Map<Integer, ObservableTriangle> store = new HashMap<>();

    @Override
    public void add(final ObservableTriangle observableTriangle) {
        store.putIfAbsent(observableTriangle.getId(), observableTriangle);
    }

    @Override
    public void delete(ObservableTriangle observableTriangle) {
        store.remove(observableTriangle.getId());
    }

    @Override
    public void update(ObservableTriangle observableTriangle) {
        store.replace(observableTriangle.getId(), observableTriangle);
    }

    @Override
    public List<ObservableTriangle> query(final Specification specification) {
        List<ObservableTriangle> triangles = new ArrayList<>();
        for (ObservableTriangle triangle : store.values()) {
            if (specification.specified(triangle)) {
                triangles.add(triangle);
            }
        }
        return triangles;
    }

    @Override
    public TreeSet<ObservableTriangle> sort(Comparator<ObservableTriangle> comparator) {
        TreeSet<ObservableTriangle> triangles = new TreeSet<>(comparator);
        triangles.addAll(store.values());
        return triangles;
    }
}