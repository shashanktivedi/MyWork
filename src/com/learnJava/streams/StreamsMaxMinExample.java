package com.learnJava.streams;

import java.util.*;

import com.learnJava.dataBase.Student;
import com.learnJava.dataBase.StudentDataBase;

public class StreamsMaxMinExample {


    public static Optional<Integer> maxValue(List<Integer> integerList){
        return integerList.stream()
                //.reduce(0,(a,b)->(a>b) ? a : b);
        .reduce(Integer::max);
    }

    public static Optional<Integer> minValue(List<Integer> integerList){
        return integerList.stream()
                .reduce((a,b)->(a<b) ? a : b);
                //.reduce(0,Integer::min);
    }


    public static void main(String[] args) {
        List<Integer> integers = Arrays.asList(6,7,8,9,10);
//        Optional<Integer> maxValue =maxValue(integers);
//        int max = maxValue.isPresent() ? maxValue.get():0;
//        System.out.println("Max Value is : " + max);

        Integer maxValue = integers.stream().max(Comparator.naturalOrder()).get();
        System.out.println("maxValue: "+maxValue);
        
        Integer minValue = integers.stream().min(Comparator.naturalOrder()).get();
        System.out.println("minValue: "+minValue);
        
        
//        Optional<Integer> minValue =minValue(integers);
//        int min = maxValue.isPresent() ? minValue.get():0;
//        System.out.println("Min Value is : " + min);
    }
}
