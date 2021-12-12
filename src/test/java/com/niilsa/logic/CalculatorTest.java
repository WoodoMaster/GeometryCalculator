package com.niilsa.logic;

import com.niilsa.entity.ObservableTriangle;
import com.niilsa.entity.Point;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class CalculatorTest {

    private static final ObservableTriangle TRIANGLE = Mockito.mock(ObservableTriangle.class);
    private static final Point FIRSTPOINT = Mockito.mock(Point.class);
    private static final Point SECONDPOINT = Mockito.mock(Point.class);
    private static final Point THIRDPOINT = Mockito.mock(Point.class);
    private static final double DELTA = 0.0001;


    @Test
    public void testCalculateAreaShouldCalculateAreaThenCoordinatesPositive() {
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
        Calculator calculator = new Calculator();
        double expected = 6.0;
        // when
        double actual = calculator.calculateArea(TRIANGLE);
        // then
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCalculateAreaShouldCalculateAreaThenCoordinatesNegative() {
        // given
        Mockito.when(TRIANGLE.getFirstApex()).thenReturn(FIRSTPOINT);
        Mockito.when(TRIANGLE.getSecondApex()).thenReturn(SECONDPOINT);
        Mockito.when(TRIANGLE.getThirdApex()).thenReturn(THIRDPOINT);
        Mockito.when(FIRSTPOINT.getX()).thenReturn(0.0);
        Mockito.when(FIRSTPOINT.getY()).thenReturn(0.0);
        Mockito.when(SECONDPOINT.getX()).thenReturn(-3.0);
        Mockito.when(SECONDPOINT.getY()).thenReturn(0.0);
        Mockito.when(THIRDPOINT.getX()).thenReturn(0.0);
        Mockito.when(THIRDPOINT.getY()).thenReturn(-4.0);
        Calculator calculator = new Calculator();
        double expected = 6.0;
        // when
        double actual = calculator.calculateArea(TRIANGLE);
        // then
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCalculatePerimeterShouldCalculatePerimeterThenCoordinatesPositive() {
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
        Calculator calculator = new Calculator();
        double expected = 12.0;
        // when
        double actual = calculator.calculatePerimeter(TRIANGLE);
        // then
        Assert.assertEquals(expected, actual, DELTA);
    }

    @Test
    public void testCalculatePerimeterShouldCalculatePerimeterThenCoordinatesNegative() {
        // given
        Mockito.when(TRIANGLE.getFirstApex()).thenReturn(FIRSTPOINT);
        Mockito.when(TRIANGLE.getSecondApex()).thenReturn(SECONDPOINT);
        Mockito.when(TRIANGLE.getThirdApex()).thenReturn(THIRDPOINT);
        Mockito.when(FIRSTPOINT.getX()).thenReturn(0.0);
        Mockito.when(FIRSTPOINT.getY()).thenReturn(0.0);
        Mockito.when(SECONDPOINT.getX()).thenReturn(-3.0);
        Mockito.when(SECONDPOINT.getY()).thenReturn(0.0);
        Mockito.when(THIRDPOINT.getX()).thenReturn(0.0);
        Mockito.when(THIRDPOINT.getY()).thenReturn(-4.0);
        Calculator calculator = new Calculator();
        double expected = 12.0;
        // when
        double actual = calculator.calculatePerimeter(TRIANGLE);
        // then
        Assert.assertEquals(expected, actual, DELTA);
    }

}
