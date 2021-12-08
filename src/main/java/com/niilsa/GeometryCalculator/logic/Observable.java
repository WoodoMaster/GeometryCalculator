package com.niilsa.GeometryCalculator.logic;

public interface Observable {
    void attach(Observer observer);

    void detach(Observer observer);

    void notifyObservers();


}
