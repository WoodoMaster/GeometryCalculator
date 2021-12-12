package com.niilsa.logic;

import com.niilsa.data.DataReader;
import com.niilsa.data.DataValidator;
import com.niilsa.entity.ObservableTriangle;
import com.niilsa.exception.DataException;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.Mockito;

import java.util.ArrayList;
import java.util.List;

public class DirectorTest {
    private static final ObservableTriangle TRIANGLE = Mockito.mock(ObservableTriangle.class);
    private static final TriangleValidator TRIANGLE_VALIDATOR = Mockito.mock(TriangleValidator.class);
    private static final TriangleCreator TRIANGLE_CREATOR = Mockito.mock(TriangleCreator.class);
    private static final DataReader DATA_READER = Mockito.mock(DataReader.class);
    private static final DataValidator DATA_VALIDATOR = Mockito.mock(DataValidator.class);
    private static final String PATH = "src/main/resources/data";


    @Test
    public void testReadShouldCreateTrianglesListThenPathValid() throws DataException {
        // given
        String firstTestString = "0 0 1 1 0 10";
        List<String> strings = new ArrayList<>();
        strings.add(firstTestString);
        Mockito.when(DATA_READER.read(PATH)).thenReturn(strings);
        List<ObservableTriangle> list = new ArrayList<>();
        list.add(TRIANGLE);

        Mockito.when(TRIANGLE_CREATOR.createObservableTriangleList(
                DATA_READER.read(PATH), TRIANGLE_VALIDATOR, DATA_VALIDATOR)).thenReturn(list);
        Director director = new Director(TRIANGLE_VALIDATOR, TRIANGLE_CREATOR, DATA_READER, DATA_VALIDATOR);
        List<ObservableTriangle> expected = list;
        // when
        List<ObservableTriangle> actual = director.read(PATH);
        // then
        Assert.assertEquals(expected, actual);
    }


}
