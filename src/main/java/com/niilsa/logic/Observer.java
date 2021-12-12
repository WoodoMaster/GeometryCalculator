package com.niilsa.logic;

import com.niilsa.entity.ObservableTriangle;

public interface Observer {
    void update(ObservableTriangle observableTriangle);
}
