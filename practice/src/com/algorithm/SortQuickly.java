package com.algorithm;

import java.util.Arrays;

/**
 * Created by zgc on 2018/10/27.
 */
public class SortQuickly {
    public static void main(String[] args) {
        int[] array = new int[]{10,9,8,6,4,3,2,0,1};
        System.out.println("排序之前的数组为--》"+ Arrays.toString(array));
        quickSort(array,0,array.length-1);
        System.out.println("排序之后的数组为--》"+Arrays.toString(array));

    }
    public static void quickSort(int[] array,int start,int end){
        if(start < end){                    //结束条件

            int stand = array[start];       //标准数，一般取第1个数
            int low = start;
            int high = end;
            while(low < high) {
                while (low < high && stand <= array[high]) {    //如果标准数小于高位,高位左移
                    high--;
                }
                array[low] = array[high];                       //如果标准数大于高位，高低互换
                while (low < high && stand >= array[low]) {     //如果标准数大于低位，低位右移
                    low++;
                }
                array[high] = array[low];                       //如果标准数小于低位，低高互换

            }
            array[low] = stand;
            quickSort(array,start,low);
            quickSort(array,low+1,end);
        }


    }


}
