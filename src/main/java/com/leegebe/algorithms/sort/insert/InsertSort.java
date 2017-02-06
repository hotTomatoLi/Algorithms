package com.leegebe.algorithms.sort.insert;

import com.leegebe.algorithms.sort.BasicSort;

/**
 * 插入排序算法
 * @author lee
 * @since 1.0.0
 * 设数组为a[0…n-1]。
 * 1 初始时，a[0]自成1个有序区，无序区为a[1..n-1]。令i=1
 * 2 将a[i]并入当前的有序区a[0…i-1]中形成a[0…i]的有序区间。
 * 3 i++并重复第二步直到i==n-1。排序完成。
 */
public class InsertSort extends BasicSort {

    public InsertSort(int[] data) {
        super(data);
    }

    @Override
    public void sort() {
        if(this.data != null){
            for(int i = 0; i < this.data.length; i++){
                int temp = this.data[i];//当前需要插入的数据
                for(int j = i-1 ; j >= 0; j--){
                    if(temp < this.data[j]){
                        swap(this.data,j,j+1);
                        printData();
                    }else{
                        break;
                    }
                }
            }
        }
    }

    public static void main(String[] args){
        int[] data = {538,87,89,5,6,0,21,8,563,7956,32};
        BasicSort sort = new InsertSort(data);
        sort.sort();
    }
}
