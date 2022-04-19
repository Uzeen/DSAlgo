package com.ds.Sorting;

public class Sorting {
    
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int spare = 0;
            for(int j=1;j<n-i;j++){
                if(arr[spare] > arr[j]){
                    int temp = arr[spare];
                    arr[spare] = arr[j];
                    arr[j] = temp;
                }
                spare++;
            }
        }
    }

    //
    public static void selectionSort(int[] arr){}

    //
    public static void insertionSort(int[] arr){}

    //
    public static void bucketSort(int[] arr){}

    //
    public static void mergeSort(){}

    //
    public static void quickSort(){}
}
