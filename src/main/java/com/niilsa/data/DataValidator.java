package com.niilsa.data;

public class DataValidator {
    private final String regEx = "(\\d+\\s+){5}\\d+";

    public boolean isLineValid(String line) {
        return line.matches(regEx);
    }
}
