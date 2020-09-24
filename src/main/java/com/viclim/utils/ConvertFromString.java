package com.viclim.utils;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class ConvertFromString {
    public static List<String> toListOfStrings(String strings, String delimiter){
        String[] arr_ToDos = strings.split(delimiter);
        List<String> list_ToDos = Arrays.stream(arr_ToDos)
                .collect(Collectors.toList());
        return list_ToDos;
    }
}
