package com.example.admin.week6test;

public class SpiralPrint {
    public static void main(String[] args) {
        int[][] array = new int[][] {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        SpiralPrint spiralPrint = new SpiralPrint();
        int[] spiral = spiralPrint.spiralSort(array);
        for (int i = 0; i < spiral.length ; i++) {
            System.out.print(spiral[i] + " ");
        }
    }
    //TO-DO, switch end and beginning cases to be a variable rather than a 0, or 1
    //so that you can get the entire array rather than just the outside
    private int[] spiralSort(int[][] arr){
        int[] spiral = new int[(arr.length*arr[0].length)];
        int k = 0;
        //go along the first row ending right before the end
        for (int i = 0; i < arr.length; i++) {
            spiral[k] = arr[0][i];
            k++;
        }
        //go down the final column, ending right before the final row
        for(int j = 1; j < arr[0].length-1; j++){
            spiral[k] = arr[j][arr.length-1];
            k++;
        }
        //go from the right side of the final row to the beginning
        for(int m = arr[0].length-1; m >= 1; m--){
            spiral[k] = arr[arr.length-1][m];
            k++;
        }
        //go from the bottom left of the row to the top
        for(int n = arr[0].length-1; n >= 1; n--){
            spiral[k] = arr[n][0];
            k++;
        }
    return spiral;
    }
}
