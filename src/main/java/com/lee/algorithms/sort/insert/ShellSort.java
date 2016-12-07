package com.lee.algorithms.sort.insert;

import com.lee.algorithms.sort.BasicSort;

/**
 * 希尔排序
 * 希尔排序的思想：
 * 1.设定一个间隔gap，每次对gap间隔的子数字进行直接插入排序；
 * 2.不断递减gap，直到gap=1
 * 3.gap=1时相当于直接插入排序
 * 例如
 * a0,a1,a2,a3,a4,a5,a5,a7,a7,a9,a10,a11,a12,a13,a14,a15,a16,a17,a18,a19,a20
 * 当gap==5时，会进行如下分组
 * a0,a5,a10,a15,a20
 * a1,a6,a11,a16
 * a2,a7,a12,a17
 * a3,a8,a13,a18
 * a4,a9,a14,a19
 * 分别进行直接插入排序
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
                for(int i = gap; i < this.data.length; i=i+gap ){
                    int temp = this.data[i];
                    for(int j = i - gap; j >=0; j = j-gap){
                        if(this.data[j] > temp){
                            swap(this.data,j,j+gap);
                            printData();
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
