package com.niilsa.repository.specification;

import com.niilsa.entity.ObservableTriangle;

import com.niilsa.logic.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AreaSpecificationTest {
    private static final double MINAREA = 1.2;
    private static final double MAXAREA = 1.4;
    private static final Calculator CALCULATOR = Mockito.mock(Calculator.class);
    private static final ObservableTriangle TRIANGLE = Mockito.mock(ObservableTriangle.class);

    @Test
    public void testSpecifiedShouldReturnTrueWhenAreaSpecified() {
        // given
        Mockito.when(CALCULATOR.calculateArea(TRIANGLE)).thenReturn(1.3);
        AreaSpecification areaSpecification = new AreaSpecification(MINAREA, MAXAREA, CALCULATOR);
        // when
        boolean actual = areaSpecification.specified(TRIANGLE);
        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void testSpecifiedShouldReturnFalseWhenAreaNotSpecified() {
        // given
        Mockito.when(CALCULATOR.calculateArea(TRIANGLE)).thenReturn(1.1);
        AreaSpecification areaSpecification = new AreaSpecification(MINAREA, MAXAREA, CALCULATOR);
        // when
        boolean actual = areaSpecification.specified(TRIANGLE);
        // then
        Assert.assertFalse(actual);
    }
}
