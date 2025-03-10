package com.example.collections;

import java.util.ArrayList;
import java.util.List;

/**
 * @author danieldevlin
 * @date 10/03/2025
 * @project continued-ed
 */
public class CollectionsTest {
    public static void main(String[] args){
        List<Integer> numbers = new ArrayList<>();
        for(int i = 0; i<10; i++){
            numbers.add(Integer.max(i, i + 100));
        }
        numbers.get(5);
        numbers.toString();
    }
}
