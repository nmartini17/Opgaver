package com.company.Søgning;

import com.company.Exceptions.NotFoundInArrayException;

import java.util.Arrays;
import java.util.List;

public class Søgning {

    public int hasString(String[] strings, String string) throws NotFoundInArrayException {
        List<String> stringList = Arrays.asList(strings);
        if(stringList.contains(string)) {
            return stringList.indexOf(string);
        } else {
            throw new NotFoundInArrayException();
        }
    }
}
