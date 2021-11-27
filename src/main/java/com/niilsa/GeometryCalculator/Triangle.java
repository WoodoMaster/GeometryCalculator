package com.niilsa.GeometryCalculator;

public class Triangle {
    private Point firstApex;
    private Point secondApex;
    private Point thirdApex;

    public Triangle(Point firstApex, Point secondApex, Point thirdApex) {
        this.firstApex = firstApex;
        this.secondApex = secondApex;
        this.thirdApex = thirdApex;
    }

    public Point getFirstApex() {
        return firstApex;
    }

    public void setFirstApex(Point firstApex) {
        this.firstApex = firstApex;
    }

    public Point getSecondApex() {
        return secondApex;
    }

    public void setSecondApex(Point secondApex) {
        this.secondApex = secondApex;
    }

    public Point getThirdApex() {
        return thirdApex;
    }

    public void setThirdApex(Point thirdApex) {
        this.thirdApex = thirdApex;
    }
}
