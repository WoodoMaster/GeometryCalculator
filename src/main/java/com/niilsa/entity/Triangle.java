package com.niilsa.entity;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import java.util.HashMap;
import java.util.Map;

public class Triangle {
    private Map<Integer, Point> apexes;
    private Point firstApex;
    private Point secondApex;
    private Point thirdApex;
    private final Logger LOGGER = LogManager.getLogger(Triangle.class);

    public Triangle(Point firstApex, Point secondApex, Point thirdApex) {

        this.firstApex = firstApex;
        this.secondApex = secondApex;
        this.thirdApex = thirdApex;
        Map<Integer, Point> apexes = new HashMap<>();
        apexes.put(1, firstApex);
        apexes.put(2, secondApex);
        apexes.put(3, thirdApex);
        this.apexes = apexes;
    }

    public Triangle(Map<Integer, Point> apexes) {
        this.firstApex = apexes.get(1);
        this.secondApex = apexes.get(2);
        this.thirdApex = apexes.get(3);
        this.apexes = apexes;
        LOGGER.info("Triangle " + firstApex + " " + secondApex + " " + thirdApex + " created");
    }

    public Point getFirstApex() {
        return firstApex;
    }

    public Point getSecondApex() {
        return secondApex;
    }

    public Point getThirdApex() {
        return thirdApex;
    }

    public void setFirstApex(Point firstApex) {
        this.firstApex = firstApex;
    }

    public void setSecondApex(Point secondApex) {
        this.secondApex = secondApex;
    }

    public void setThirdApex(Point thirdApex) {
        this.thirdApex = thirdApex;
    }

    public Map<Integer, Point> getApexes() {
        return apexes;
    }
}
