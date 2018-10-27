package com.algorithm;

/**
 * Created by zgc on 2018/10/27.
 * 打印fibonacci数列 1 1 2 3 5 。。。。
 * 需要注意算法的起始位置是n<=1;
 */
public class Fibonacci {
    public static void main(String[] args) {
    int N = 10;
        for (int i = 0; i <= N; i++) {
            System.out.println(fib(i));
        }
    }
    public static int fib(int n){
        if(n<=1){       //需要 n <=1 开始
            return 1;
        }
        return fib(n-1)+fib(n-2);

    }
}
