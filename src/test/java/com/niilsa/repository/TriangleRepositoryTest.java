package com.niilsa.repository;

import com.niilsa.entity.ObservableTriangle;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.HashMap;
import java.util.Map;

public class TriangleRepositoryTest {
    private static final ObservableTriangle FIRSTTRIANGLE = Mockito.mock(ObservableTriangle.class);
    private static final ObservableTriangle SECONDTRIANGLE = Mockito.mock(ObservableTriangle.class);

    @Test
    public void testAddShouldAddTriangle() {
        // given
        TriangleRepositoryImp triangleRepository = new TriangleRepositoryImp();
        Map<Integer, ObservableTriangle> expected = new HashMap<>();
        Mockito.when(FIRSTTRIANGLE.getId()).thenReturn(1);
        expected.put(1, FIRSTTRIANGLE);
        // when
        triangleRepository.add(FIRSTTRIANGLE);
        Map<Integer, ObservableTriangle> actual = triangleRepository.getStore();
        // then
        Assert.assertEquals(expected, actual);
    }

}
