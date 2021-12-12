package com.niilsa.logic;

import com.niilsa.data.DataValidator;
import com.niilsa.entity.ObservableTriangle;
import com.niilsa.entity.Point;

import java.util.*;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class TriangleCreator {
    private final static String DELEMITER = "[ ]+";
    private final Logger LOGGER = LogManager.getLogger(TriangleCreator.class);

    public List<ObservableTriangle> createObservableTriangleList(List<String> stringList, TriangleValidator triangleValidator,
                                                                 DataValidator dataValidator) {
        List<ObservableTriangle> observableTriangleList = new ArrayList<>();

        for (String string : stringList) {
            ObservableTriangle observableTriangle = getTriangleFromLine(string, triangleValidator, dataValidator);
            if (observableTriangle != null) {
                observableTriangleList.add(observableTriangle);
            }
        }
        return observableTriangleList;
    }

    private Map<Integer, Point> createPointsMap(DataValidator dataValidator, String line) {
        Map<Integer, Point> pointsMap = new HashMap<>();
        if (dataValidator.isLineValid(line)) {
            String[] coordinatesInTextFormat = line.split(DELEMITER);
            Queue<String> queue = new PriorityQueue<>();
            Collections.addAll(queue, coordinatesInTextFormat);
            int amountOfApex = 3;
            for (int i = 1; i < amountOfApex; i++) {
                double xcoordinate = Double.parseDouble(queue.poll());
                double ycoordinate = Double.parseDouble(queue.poll());
                pointsMap.put(i, new Point(xcoordinate, ycoordinate));
            }
        } else {
            LOGGER.error("Data is not valid, cannot add coordinates from line:" + line + " to point.");
        }
        return pointsMap;
    }

    private ObservableTriangle getTriangleFromLine(String line, TriangleValidator triangleValidator,
                                                   DataValidator dataValidator) {
        Map<Integer, Point> pointsMap = createPointsMap(dataValidator, line);
        ObservableTriangle observableTriangle;
        if (triangleValidator.canCreateTriangle(pointsMap)) {
            observableTriangle = new ObservableTriangle(pointsMap);
        } else {
            LOGGER.error("Points is on one line, can not create Triangle " + line);
            observableTriangle = null;
        }
        return observableTriangle;
    }

}

