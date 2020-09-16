package com.company;
import java.util.Random;

public class Ic {
    private Random rand;
    private void MySort(int[] ar, int length) {
        for(int I=0; I<length; I++) {
            for(int i=0; i<(length-1); i++) {
                if (ar[i]>ar[i+1]) {
                    ar[i]+=ar[i+1];
                    ar[i+1]=ar[i]-ar[i+1];
                    ar[i]=ar[i]-ar[i+1];
                }
            }
        }
    }
    public void main() {
        int arr[] = new int[10];
        for(int i=0; i<10; i++) {
            arr[i]=rand.nextInt();
            System.out.println(arr[i]);
        }
        MySort(arr, 10);
        for(int i=0; i<10; i++) System.out.print(arr[i] + ", ");
    }
}
