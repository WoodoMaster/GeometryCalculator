package com.niilsa.entity;

import com.niilsa.logic.Observable;
import com.niilsa.logic.Observer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class ObservableTriangle extends Triangle implements Observable {
    final private int id;
    static private Integer amountOfCreatedTriangles = 0;
    private final List<Observer> observerList = new ArrayList<>();

    public ObservableTriangle(Map<Integer, Point> apexes) {
        super(apexes);
        amountOfCreatedTriangles = amountOfCreatedTriangles + 1;
        this.id = amountOfCreatedTriangles;
    }

    @Override
    public void setFirstApex(Point firstApex) {
        super.setFirstApex(firstApex);
        notifyObservers();
    }

    public int getId() {
        return id;
    }


    @Override
    public void attach(Observer observer) {
        observerList.add(observer);
    }

    @Override
    public void detach(Observer observer) {
        observerList.add(observer);

    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observerList) {
            observer.update(this);
        }
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        ObservableTriangle triangle = (ObservableTriangle) o;

        return id == triangle.id;
    }

    @Override
    public int hashCode() {
        return id;
    }
}
