package com.niilsa.repository.comparator;

import com.niilsa.entity.ObservableTriangle;
import com.niilsa.logic.Calculator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class AreaComparatorTest {
    private static final Calculator CALCULATOR = Mockito.mock(Calculator.class);
    private static final ObservableTriangle FIRSTTRIANGLE = Mockito.mock(ObservableTriangle.class);
    private static final ObservableTriangle SECONDTRIANGLE = Mockito.mock(ObservableTriangle.class);

    @Test
    public void testCompareShouldReturn0WhenAreaEquals() {
        // given
        Mockito.when(CALCULATOR.calculateArea(FIRSTTRIANGLE)).thenReturn(1.3);
        Mockito.when(CALCULATOR.calculateArea(SECONDTRIANGLE)).thenReturn(1.3);
        AreaComparator areaComparator = new AreaComparator(CALCULATOR);
        int expected = 0;
        // when
        int actual = areaComparator.compare(FIRSTTRIANGLE, SECONDTRIANGLE);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenFirstAreaBigger() {
        // given
        Mockito.when(CALCULATOR.calculateArea(FIRSTTRIANGLE)).thenReturn(1.9);
        Mockito.when(CALCULATOR.calculateArea(SECONDTRIANGLE)).thenReturn(1.3);
        AreaComparator areaComparator = new AreaComparator(CALCULATOR);
        int expected = 1;
        // when
        int actual = areaComparator.compare(FIRSTTRIANGLE, SECONDTRIANGLE);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareShouldReturnNegativeWhenSecondAreaBigger() {
        // given
        Mockito.when(CALCULATOR.calculateArea(FIRSTTRIANGLE)).thenReturn(1.9);
        Mockito.when(CALCULATOR.calculateArea(SECONDTRIANGLE)).thenReturn(2.6);
        AreaComparator areaComparator = new AreaComparator(CALCULATOR);
        int expected = -1;
        // when
        int actual = areaComparator.compare(FIRSTTRIANGLE, SECONDTRIANGLE);
        // then
        Assert.assertEquals(expected, actual);
    }

}
