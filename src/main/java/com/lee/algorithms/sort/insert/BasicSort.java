package com.lee.algorithms.sort.insert;

import java.io.File;
import java.io.FileInputStream;

/**
 * 排序基本类，封装一些公共方法
 * @author lee
 * @since 1.0.0
 */
public class BasicSort {

    /**
     * 交换位置
     * @param array
     * @param sourceIndex
     * @param targetIndex
     */
    public void swap(int[] array, int sourceIndex, int targetIndex){
        if(array != null){
            if(sourceIndex < array.length && sourceIndex >=0 && targetIndex <= array.length && targetIndex >=0 ){
                int temp = array[sourceIndex];
                array[sourceIndex] = array[targetIndex];
                array[targetIndex] = temp;
            }else{
                throw new RuntimeException("数组越界: array.length=" + array.length + ", sourceIndex=" + sourceIndex + ", targetIndex=" + targetIndex);
            }
        }
    }
}
