package com.niilsa.GeometryCalculator.data;

import java.util.regex.Pattern;

public class DataValidator {
 private final String regEx ="(\\d+\\s+){5}\\d+";

    public boolean isLineValid(String line) {
        return line.matches(regEx);
    }
}
