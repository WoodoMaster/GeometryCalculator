package com.niilsa.data;

import org.junit.Assert;
import org.junit.Test;

public class DataValidatorTest {
    private static final String VALID_LINE = "1 2 10 4 5 6";
    private static final String INVALID_LINE = "0a 0 1 1 2 2";

    @Test
    public void testisLineValidShouldReturnTrueThenLineAreValid() {
        // given
        DataValidator dataValidator = new DataValidator();
        // when
        boolean actual = dataValidator.isLineValid(VALID_LINE);
        // then
        Assert.assertTrue(actual);
    }

    @Test
    public void testisLineValidShouldReturnFalseThenLineAreInvalid() {
        // given
        DataValidator dataValidator = new DataValidator();
        // when
        boolean actual = dataValidator.isLineValid(INVALID_LINE);
        // then
        Assert.assertFalse(actual);
    }

}
