package com.niilsa.repository.comparator;

import com.niilsa.entity.ObservableTriangle;

import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class IdComparatorTest {
    private static final ObservableTriangle FIRSTTRIANGLE = Mockito.mock(ObservableTriangle.class);
    private static final ObservableTriangle SECONDTRIANGLE = Mockito.mock(ObservableTriangle.class);

    @Test
    public void testCompareShouldReturn0WhenIdEquals() {
        // given
        Mockito.when(FIRSTTRIANGLE.getId()).thenReturn(1);
        Mockito.when(SECONDTRIANGLE.getId()).thenReturn(1);
        IdComparator idComparator = new IdComparator();
        int expected = 0;
        // when
        int actual = idComparator.compare(FIRSTTRIANGLE, SECONDTRIANGLE);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareShouldReturnPositiveWhenFirstIdBigger() {
        // given
        Mockito.when(FIRSTTRIANGLE.getId()).thenReturn(2);
        Mockito.when(SECONDTRIANGLE.getId()).thenReturn(1);
        IdComparator idComparator = new IdComparator();
        int expected = 1;
        // when
        int actual = idComparator.compare(FIRSTTRIANGLE, SECONDTRIANGLE);
        // then
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void testCompareShouldReturnNegativeWhenSecondIdBigger() {
        // given
        Mockito.when(FIRSTTRIANGLE.getId()).thenReturn(1);
        Mockito.when(SECONDTRIANGLE.getId()).thenReturn(2);
        IdComparator idComparator = new IdComparator();
        int expected = -1;
        // when
        int actual = idComparator.compare(FIRSTTRIANGLE, SECONDTRIANGLE);
        // then
        Assert.assertEquals(expected, actual);
    }

}
