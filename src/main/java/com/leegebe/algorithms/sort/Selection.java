package com.leegebe.algorithms.sort;

/**
 * Created by li on 2017/2/15.
 */
public class Selection extends Template {

    @Override
    void sort(Comparable[] array) {
        for(int i = 0; i < array.length; i++){
            int min = i;
            for(int j = i + 1; j < array.length; j++){
                if(less(array[min],array[j])){
                    min = j;
                }
            }
            exch(array,i,min);
        }
    }
}
