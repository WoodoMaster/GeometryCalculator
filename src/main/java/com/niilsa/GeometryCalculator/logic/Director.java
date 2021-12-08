package com.niilsa.GeometryCalculator.logic;

import com.niilsa.GeometryCalculator.data.DataReader;

public class Director {
    TriangleValidator triangleValidator = new TriangleValidator();
    TriangleCreator triangleCreator = new TriangleCreator();
    Calculator calculator = new Calculator();
    DataReader dataReader = new DataReader();
    TriangleStore triangleStore = TriangleStore.getInstance();


}


