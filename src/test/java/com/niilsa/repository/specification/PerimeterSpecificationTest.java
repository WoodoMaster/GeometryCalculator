package com.niilsa.repository.specification;

import com.niilsa.entity.ObservableTriangle;
import com.niilsa.entity.Parameters;
import com.niilsa.logic.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class PerimeterSpecificationTest {
    private static final Parameters MINPARAMETER = Mockito.mock(Parameters.class);
    private static final Parameters MAXPARAMETER = Mockito.mock(Parameters.class);
    private static final Calculator CALCULATOR = Mockito.mock(Calculator.class);
    private static final ObservableTriangle TRIANGLE = Mockito.mock(ObservableTriangle.class);

    @Test
    public void testSpecifiedShouldReturnTrueWhenAreaSpecified() {
        // given
        Mockito.when(CALCULATOR.calculatePerimeter(TRIANGLE)).thenReturn(5.0);
        Mockito.when(MAXPARAMETER.getPerimeter()).thenReturn(5.1);
        Mockito.when(MINPARAMETER.getPerimeter()).thenReturn(4.8);

        PerimeterSpecification perimeterSpecification = new PerimeterSpecification(MINPARAMETER, MAXPARAMETER, CALCULATOR);
        // when
        boolean actual = perimeterSpecification.specified(TRIANGLE);
        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void testSpecifiedShouldReturnFalseWhenAreaNotSpecified() {
        // given
        Mockito.when(CALCULATOR.calculatePerimeter(TRIANGLE)).thenReturn(5.3);
        Mockito.when(MAXPARAMETER.getPerimeter()).thenReturn(5.1);
        Mockito.when(MINPARAMETER.getPerimeter()).thenReturn(4.8);

        PerimeterSpecification perimeterSpecification = new PerimeterSpecification(MINPARAMETER, MAXPARAMETER, CALCULATOR);
        // when
        boolean actual = perimeterSpecification.specified(TRIANGLE);
        // then
        Assert.assertFalse(actual);
    }

}
