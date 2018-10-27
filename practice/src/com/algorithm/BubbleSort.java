package com.algorithm;

import java.util.Arrays;

/**
 * Created by zgc on 2018/10/27.
 *
 */
public class BubbleSort {
    public static void main(String[] args) {
    int[] array = new int[]{9,8,7,4,3,0,1};
        System.out.println("排序之前--》 "+Arrays.toString(array));
        bubbleSort(array);
        System.out.println("排序之后--》 "+Arrays.toString(array));


    }
  public static void bubbleSort(int[] array){
      for (int i = 0; i < array.length-1; i++) {
          for (int j = 0; j < array.length-i-1; j++) {
              if (array [j]>array[j+1]) {
                  int temp = array[j];
                  array[j] = array[j+1];
                  array[j+1]=temp;
              }

          }

      }


  }




}
