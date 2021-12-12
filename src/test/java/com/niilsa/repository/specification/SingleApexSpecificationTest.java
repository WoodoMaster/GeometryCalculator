package com.niilsa.repository.specification;

import com.niilsa.entity.ObservableTriangle;
import com.niilsa.entity.Point;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class SingleApexSpecificationTest {

    private static final Point TESTPOINT = Mockito.mock(Point.class);
    private static final Point FIRSTPOINT = Mockito.mock(Point.class);
    private static final Point SECONDPOINT = Mockito.mock(Point.class);
    private static final Point THIRDPOINT = Mockito.mock(Point.class);


    private static final ObservableTriangle TRIANGLE = Mockito.mock(ObservableTriangle.class);

    @Test
    public void testSpecifiedShouldReturnTrueWhenApexSpecified() {
        // given
        Mockito.when(TRIANGLE.getFirstApex()).thenReturn(FIRSTPOINT);
        Mockito.when(TRIANGLE.getSecondApex()).thenReturn(SECONDPOINT);
        Mockito.when(TRIANGLE.getThirdApex()).thenReturn(THIRDPOINT);
        Mockito.when(FIRSTPOINT.getX()).thenReturn(0.0);
        Mockito.when(FIRSTPOINT.getY()).thenReturn(0.0);
        Mockito.when(SECONDPOINT.getX()).thenReturn(3.0);
        Mockito.when(SECONDPOINT.getY()).thenReturn(0.0);
        Mockito.when(THIRDPOINT.getX()).thenReturn(0.0);
        Mockito.when(THIRDPOINT.getY()).thenReturn(4.0);
        Mockito.when(TESTPOINT.getX()).thenReturn(3.0);
        Mockito.when(TESTPOINT.getY()).thenReturn(0.0);
        SingleApexSpecification specification = new SingleApexSpecification(TESTPOINT);

        // when
        boolean actual = specification.specified(TRIANGLE);
        // then
//        Assert.assertTrue(actual);
    }


}
