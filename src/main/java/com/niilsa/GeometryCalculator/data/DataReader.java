package com.niilsa.GeometryCalculator.data;

import com.niilsa.GeometryCalculator.exception.DataException;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

public class DataReader {
    public List<String> read(String path) throws DataException {
        List<String> result = new ArrayList<>();
        try {
            FileReader fileReader = new FileReader(path);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line = bufferedReader.readLine();
            while (line != null) {
                result.add(line);
                line = bufferedReader.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new DataException("Could not find file by that path", e);
        } catch (IOException e) {
            throw new DataException("An I/O error occured", e);
        }
        return result;
    }


}
