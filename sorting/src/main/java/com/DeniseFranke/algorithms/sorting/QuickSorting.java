package com.DeniseFranke.algorithms.sorting;

public class QuickSorting {
    

    /**
     * Quick Sorting - uses recursion so make sure it terminates.  This is also more efficient
     * of an algorithm over Bubble Sorting and Insertion sorting.  This returns average performance.  
     * The separation of the elements into two separate lists is O(n), and each recursive is performed on 
     * half each list, which results in performance of O(n log n).  The choice of the pivot is key here.  
     * Also note this is a candidate for parallel processing.
     * 
     * @param {int[] Array} intArr
     */
    public static void quickSorting(int[] intArr) {
        internal(intArr, 0, intArr.length - 1);
    }
    
    private static void internal(int[] intArr, int first, int last) {
        
    		int split = arrange(intArr, first, last);

        if (first < split)
            internal(intArr, first, split);    
        
        if (last > split + 1)
            internal(intArr, split + 1, last);   
    }
    
    private static int arrange(int[] arr, int first, int last) {
        int m = arr[(first + last)/2];
        int i = first - 1;  
        int n = last + 1;   

        while (true) {
            do {
                i++;
            } while (arr[i] < m);
            do {
                n--;
            } while (arr[n] > m);

            if (i < n)
                SortingUtil.swap(arr, i, n);
            else
                return n;  
        }
    }
}
