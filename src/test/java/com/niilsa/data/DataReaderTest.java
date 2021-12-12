package com.niilsa.data;

import com.niilsa.exception.DataException;
import org.junit.Assert;
import org.junit.Test;


import java.util.Arrays;
import java.util.List;

public class DataReaderTest {

    private static final String VALID_LINE1 = "1 2 10 4 5 6";
    private static final String VALID_LINE2 = "1 4 5 5 1 10";

    private static final String TEST_PATH = "src/test/resources/data";

    @Test
    public void testReadShouldReadLinesWhenPathExist() throws DataException {
        // given
        List<String> expected = Arrays.asList(VALID_LINE1, VALID_LINE2);
        DataReader reader = new DataReader();

        // when
        List<String> actual = reader.read(TEST_PATH);
        // then
        Assert.assertEquals(expected, actual);
    }

}
