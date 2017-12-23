package com.denisefranke.algorithms;

public class MergeSorting {

    /**
     * Merge Sorting - this is another multiple list possibly parallel algorithm
     * This is also an example of merging two sorted lists.
     *  Note that the subList method on List takes two parameters, from and to.  
     *  From is inclusive, and to is exclusive.  Like Quick Sorting, merge sorting has a performance 
     *  of O(n log n). Each merge operation would be O(n), and each recursive call works half the list.
     * 
     * @param {int[] Array} intArr
     */
    public static void mergeSorting(int[] intArr) {
        int[] tmp = new int[intArr.length];
        mSorting(intArr, tmp, 0, intArr.length - 1);
    }
    
    private static void mSorting(int[] arr, int[] tmp, int from, int to) {
        if (from >= to)
            return;

        int middle = (from + to)/2;
        mSorting(arr, tmp, from, middle);  //calls method
        mSorting(arr, tmp, middle + 1, to);  //calls method
        merge(arr, tmp, from, middle, middle + 1, to);
    }
    
    private static void merge(int[] arr, int[] tmp,
      int leftStart, int leftEnd, int rightStart, int rightEnd)
    {
        int i = leftStart;    
        int n = rightStart;   
        int m = leftStart;   

        while (i <= leftEnd && n <= rightEnd) {
            if (arr[i] < arr[n])
                tmp[m++] = arr[i++];
            else
                tmp[m++] = arr[n++];
        }

        while (i <= leftEnd)
            tmp[m++] = arr[i++];

        while (n <= rightEnd)
            tmp[m++] = arr[n++];

        for (i = leftStart; i <= rightEnd; i++)
            arr[i] = tmp[i];
    }
}
