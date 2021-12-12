package com.niilsa.repository.comparator;

import com.niilsa.entity.ObservableTriangle;
import com.niilsa.logic.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class PerimeterComparatorTest {
    private static final Calculator CALCULATOR = Mockito.mock(Calculator.class);
    private static final ObservableTriangle FIRSTTRIANGLE = Mockito.mock(ObservableTriangle.class);
    private static final ObservableTriangle SECONDTRIANGLE = Mockito.mock(ObservableTriangle.class);

    @Test
    public void testCompareShouldReturn0WhenPerimeterEquals() {
        // given
        Mockito.when(CALCULATOR.calculatePerimeter(FIRSTTRIANGLE)).thenReturn(1.3);
        Mockito.when(CALCULATOR.calculatePerimeter(SECONDTRIANGLE)).thenReturn(1.3);
        PerimeterComparator perimeterComparator = new PerimeterComparator(CALCULATOR);
        int expected = 0;
        // when
        int actual = perimeterComparator.compare(FIRSTTRIANGLE, SECONDTRIANGLE);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenFirstPerimeterBigger() {
        // given
        Mockito.when(CALCULATOR.calculatePerimeter(FIRSTTRIANGLE)).thenReturn(1.6);
        Mockito.when(CALCULATOR.calculatePerimeter(SECONDTRIANGLE)).thenReturn(1.3);
        PerimeterComparator perimeterComparator = new PerimeterComparator(CALCULATOR);
        int expected = 1;
        // when
        int actual = perimeterComparator.compare(FIRSTTRIANGLE, SECONDTRIANGLE);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareShouldReturnNegativeWhenSecondPerimeterBigger() {
        // given
        Mockito.when(CALCULATOR.calculatePerimeter(FIRSTTRIANGLE)).thenReturn(1.6);
        Mockito.when(CALCULATOR.calculatePerimeter(SECONDTRIANGLE)).thenReturn(1.9);
        PerimeterComparator perimeterComparator = new PerimeterComparator(CALCULATOR);
        int expected = -1;
        // when
        int actual = perimeterComparator.compare(FIRSTTRIANGLE, SECONDTRIANGLE);
        // then
        Assert.assertEquals(expected, actual);
    }

}
