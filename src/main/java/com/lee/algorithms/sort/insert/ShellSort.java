package com.lee.algorithms.sort.insert;

import com.lee.algorithms.sort.BasicSort;

/**
 * 插入排序算法
 * @author lee
 * @since 1.0.0
 */
public class ShellSort extends BasicSort {


    public ShellSort(int[] data) {
        super(data);
    }

    @Override
    public void sort() {
        if(this.data != null){
            int gap = this.data.length / 2;
            while(1 <= gap){
                System.out.println("gap=" + gap);
                for( int i = 0; i + gap <this.data.length; i++){
                    int temp = this.data[i+gap];
                    for(int j = i + gap -1; j >= i; j--){
                        printData();
                        if(temp < this.data[j]){
                            swap(this.data,i+gap,j);
                        }else{
                            break;
                        }
                    }
                }
                gap = gap / 2;
            }
        }
    }
    public static void main(String[] args){
        int[] data = {538,87,89,5,6,0,21,8,563,7956,32};
        BasicSort sort = new ShellSort(data);
        sort.sort();
    }
}
