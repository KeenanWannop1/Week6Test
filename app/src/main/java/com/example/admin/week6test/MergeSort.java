package com.example.admin.week6test;

public class MergeSort {
    public static void main(String[] args) {
        int[] array = {5,10,9,6,3,2,1,6};
        MergeSort mergeSort = new MergeSort();
        mergeSort.sort(array, 0, array.length-1);
        for (int anOutput : array) {
            System.out.print(anOutput + " ");
        }

    }
    private void merge(int[] arr, int l, int middle, int r) {
        if (arr.length > 1) {
            int n1 = middle - l +1;
            int n2 = r-middle;
            int left[] = new int[n1];
            int right[] = new int[n2];
            int i, j;

            for (i = 0; i < n1; ++i) {
                left[i] = arr[l + i];
            }
            for(j = 0; j<n2; ++j){
                right[j] = arr[middle + 1 + j];
            }

            i = 0;
            j = 0;
            int k = l;
            while (i < n1 && j < n2) {
                if (left[i] <= right[j]) {
                    arr[k] = left[i];
                    i++;
                } else {
                    arr[k] = right[j];
                    j++;
                }
                k++;
            }
            //if either left or right has any values left, add them to the array
            while (i < n1) {
                arr[k] = left[i];
                i++;
                k++;
            }
            while (j < n2) {
                arr[k] = right[j];
                j++;
                k++;
            }
        }

    }
    private void  sort(int arr[], int l, int r)
    {
        if (l < r)
        {
            // Find the middle point
            int middle = (l+r)/2;

            // Sort first and second halves
            sort(arr, l, middle);
            sort(arr , middle+1, r);

            // Merge the sorted halves
            merge(arr, l, middle, r);
        }
    }

}



