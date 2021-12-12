package com.niilsa.logic;

import com.niilsa.data.DataReader;
import com.niilsa.data.DataValidator;
import com.niilsa.entity.ObservableTriangle;

import java.util.List;

import com.niilsa.exception.DataException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;


public class Director {
    private final Logger LOGGER = LogManager.getLogger(Director.class);
    private TriangleValidator triangleValidator;
    private TriangleCreator triangleCreator;
    private DataReader dataReader;
    private DataValidator dataValidator;

    public Director(TriangleValidator triangleValidator, TriangleCreator triangleCreator, DataReader dataReader,
                    DataValidator dataValidator) {
        this.triangleValidator = triangleValidator;
        this.triangleCreator = triangleCreator;
        this.dataReader = dataReader;
        this.dataValidator = dataValidator;
    }

    public List<ObservableTriangle> read(String path) throws DataException {
        LOGGER.info("Director class is running. Reading data from path " + path);
        List<String> stringsList = dataReader.read(path);
        return triangleCreator.createObservableTriangleList(stringsList, triangleValidator, dataValidator);
    }



}


