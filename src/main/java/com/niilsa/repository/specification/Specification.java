package com.niilsa.repository.specification;

import com.niilsa.entity.ObservableTriangle;

public interface Specification {
    boolean specified(ObservableTriangle triangle);
}
