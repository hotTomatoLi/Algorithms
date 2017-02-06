package com.leegebe.algorithms.sort;

import java.io.File;
import java.io.FileInputStream;

/**
 * 排序基本类，封装一些公共方法
 * @author lee
 * @since 1.0.0
 */
public abstract class BasicSort {

    protected int[] data;//数据


    public BasicSort(int[] data){
        this.data = data;
    }

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

    /**
     * 排序算法
     */
    public abstract void sort();

    /**
     * 打印数据
     */
    public void printData(){
        if(this.data != null){
            System.out.print(System.currentTimeMillis() + " [ ");
            for(int i = 0; i < data.length; i++){
                System.out.print(data[i]);
                if(i != data.length - 1){
                    System.out.print(" ");
                }else{
                    System.out.print(" ]\n");
                }
            }
        }
    }

    public int[] getData() {
        return data;
    }

    public void setData(int[] data) {
        this.data = data;
    }
}
