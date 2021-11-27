package com.niilsa.GeometryCalculator;

import java.util.StringTokenizer;

public class PointCreator {
   static public Point createPoint(String line){
       String[] coordinatesInTextFormat = line.split("[ ]+");
       double[] coordinatesInDoubleFormat = new double[coordinatesInTextFormat.length];
       for (int i = 0; i < coordinatesInTextFormat.length; i++) {
           coordinatesInDoubleFormat[i] = Double.parseDouble(coordinatesInTextFormat[i]);
       }

        return new Point(coordinatesInDoubleFormat[0],coordinatesInDoubleFormat[1]);
   }
    private double[] parsingStringIntoDouble(String [] coordinatesInTextFormat){
        double[] coordinatesInDoubleFormat = new double[coordinatesInTextFormat.length];
        for (int i = 0; i < coordinatesInTextFormat.length; i++) {
            coordinatesInDoubleFormat[i] = Double.parseDouble(coordinatesInTextFormat[i]);
        }
        return coordinatesInDoubleFormat;
    }

}
