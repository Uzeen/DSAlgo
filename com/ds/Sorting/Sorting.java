package com.ds.Sorting;

public class Sorting {
    
    // TC O[n^2]
    public static void bubbleSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int spare = 0;
            for(int j=1;j<n-i;j++){
                if(arr[spare] > arr[j]){
                    swap(arr,spare,j);
                }
                spare++;
            }
        }
    }

    //
    public static void selectionSort(int[] arr){
        int n = arr.length;
        for(int i=0;i<n;i++){
            int minIdx = i;
            for(int j=i+1;j<n;j++){
                if(arr[minIdx] > arr[j]){
                    minIdx = j;
                }
            }
            swap(arr, i, minIdx);
        }

    }

    //
    public static void insertionSort(int[] arr){}

    //
    public static void bucketSort(int[] arr){}

    //
    public static void mergeSort(){}

    //
    public static void quickSort(){}

    private static void swap(int[] arr,int a, int b){
        int temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
    }
}
