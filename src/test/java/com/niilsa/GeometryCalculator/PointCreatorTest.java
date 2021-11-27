package com.niilsa.GeometryCalculator;

import org.junit.Assert;
import org.junit.Test;

public class PointCreatorTest {
    @Test
    public void testCreateShouldCreateWhenLineCorrect() {
        //given
        Point givenPoint = new Point(1,2);
        String line = "1 2";


        //when
       Point whenPoint  =  PointCreator.createPoint(line);

        //then
        Assert.assertEquals(givenPoint,whenPoint);
    }
}
