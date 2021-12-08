package com.niilsa.GeometryCalculator;

import com.niilsa.GeometryCalculator.entity.ObservableTriangle;
import com.niilsa.GeometryCalculator.entity.Point;
import com.niilsa.GeometryCalculator.logic.TriangleCreator;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;


public class TriangleCreatorTest {
    @Test
    public void testCreateShouldCreateWhenLineCorrect() {
        //given
        TriangleCreator triangleCreator = new TriangleCreator();
        String line = "1 2";

        Point whenPoint = Mockito.mock(Point.class);


        //when
      //  ObservableTriangle givenPoint = triangleCreator.getTrianglesFromLine(line);


        //then
     //   Assert.assertEquals(givenPoint, whenPoint);
    }
}
