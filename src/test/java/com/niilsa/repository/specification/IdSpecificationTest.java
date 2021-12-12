package com.niilsa.repository.specification;

import com.niilsa.entity.ObservableTriangle;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

public class IdSpecificationTest {
    private static final Integer ID = 1;

    private static final ObservableTriangle TRIANGLE = Mockito.mock(ObservableTriangle.class);

    @Test
    public void testSpecifiedShouldReturnTrueWhenIdSpecified() {
        // given
        Mockito.when(TRIANGLE.getId()).thenReturn(1);
        IdSpecification idSpecification = new IdSpecification(ID);
        // when
        boolean actual = idSpecification.specified(TRIANGLE);
        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void testSpecifiedShouldReturnFalseWhenIdNotSpecified() {
        // given
        Mockito.when(TRIANGLE.getId()).thenReturn(2);
        IdSpecification idSpecification = new IdSpecification(ID);
        // when
        boolean actual = idSpecification.specified(TRIANGLE);
        // then
        Assert.assertFalse(actual);
    }
}
