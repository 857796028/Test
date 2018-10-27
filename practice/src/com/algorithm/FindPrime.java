package com.algorithm;

/**寻找质数  2 3 5 7
 * Created by zgc on 2018/10/27.
 * warning:1.算法里 i=3;i<=j;i++   运行程序里i=3;i<N;i=i+2
 */
public class FindPrime {
    public static void main(String[] args) {
        System.out.println(2);//2 is primer too
        for (int i = 3; i <100; i = i+2) {
            if(FP(i)){
                System.out.println(i);
            }
        }


    }
    public  static boolean FP(int n){
        boolean flag = true;
        int j = (int)Math.sqrt(n);
        for (int i =3; i <= j; i++) {
            if (n % i  ==  0) {
                flag = false;

            }
        }
        return flag;

    }

}
