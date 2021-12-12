package com.niilsa.repository.comparator;

import com.niilsa.entity.ObservableTriangle;

import java.util.Comparator;

public class IdComparator implements Comparator<ObservableTriangle> {

    @Override
    public int compare(ObservableTriangle firstTriangle, ObservableTriangle secondTriangle) {
        int firstId = firstTriangle.getId();
        int secondId = secondTriangle.getId();
        return firstId - secondId;
    }
}
