package com.thoughtworks.collection;

import sun.reflect.generics.reflectiveObjects.NotImplementedException;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Add {
    public int getSumOfEvens(int leftBorder, int rightBorder) {
        int sum = 0;
        for(int i = leftBorder; i >= leftBorder && i <= rightBorder; i++) {
            sum += ((i % 2) == 0)? i: 0;
        }
        return sum;
    }

    public int getSumOfOdds(int leftBorder, int rightBorder) {
        throw new NotImplementedException();
    }

    public int getSumTripleAndAddTwo(List<Integer> arrayList) {
        return arrayList.stream().map((item) -> item * 3 + 2).reduce(0, (a, b) -> a + b);
    }

    public List<Integer> getTripleOfOddAndAddTwo(List<Integer> arrayList) {
//        List<Integer> list = new ArrayList<>();
//        for(Integer integer: arrayList) {
//            list.add(integer % 2 == 0? integer: integer * 3 + 2);
//        }
//        return list;
        return arrayList.stream().map((item) -> item % 2 == 0? item: item * 3 + 2).collect(Collectors.toList());
//        return arrayList.stream().mapToInt((item) -> item % 2 == 0? item: item * 3 + 2).sum();
    }

    public int getSumOfProcessedOdds(List<Integer> arrayList) {
//        return arrayList.stream().filter((item) -> item % 2 != 0).map((item) -> item * 3 + 5).reduce(0, (a, b) -> a + b);
        return arrayList.stream().reduce(0, (subtotal, ele) -> subtotal += ele % 2 != 0? (ele*3+5): 0);
    }

    public double getMedianOfEven(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public double getAverageOfEven(List<Integer> arrayList) {
        return arrayList.stream().filter(item -> item % 2 == 0).reduce(0, (a, b) -> a+b) / (arrayList.size() / 2);
//        return arrayList.stream().filter(item -> item % 2 == 0).mapToDouble(item -> item).average().;
    }

    public boolean isIncludedInEvenIndex(List<Integer> arrayList, Integer specialElment) {
        throw new NotImplementedException();
    }

    public List<Integer> getUnrepeatedFromEvenIndex(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> sortByEvenAndOdd(List<Integer> arrayList) {
        throw new NotImplementedException();
    }

    public List<Integer> getProcessedList(List<Integer> arrayList) {
        //arrayList.stream().reduce(0, (a, b) -> (a + b) * 3)
        return arrayList;
    }
}
