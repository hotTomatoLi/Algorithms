package com.lee.algorithms.sort.insert;

import com.lee.algorithms.sort.BasicSort;

/**
 * 插入排序算法
 * @author lee
 * @since 1.0.0
 */
public class InsertSort extends BasicSort{

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
