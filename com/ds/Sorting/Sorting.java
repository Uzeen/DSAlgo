package com.ds.Sorting;

public class Sorting {
    
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        System.out.println(n);
        for(int i=0;i<n-1;i++){
            int spare = 0;
            for(int j=1;j<n;j++){
                if(arr[spare] > arr[j]){
                    int temp = arr[spare];
                    arr[spare] = arr[j];
                    arr[j] = temp;
                }else{
                    spare++;
                }
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
