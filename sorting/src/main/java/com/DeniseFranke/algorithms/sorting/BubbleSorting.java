package com.DeniseFranke.algorithms.sorting;

public class BubbleSorting {

  /**
   * Bubble Sorting:  Although this implementation is simple, it is extremely inefficient. 
   * The worst case, when you want to sort a list that is already sorted in reverse order.  
   * For each iteration, you are only switching one element.  This has a performance of O(n^2). 
   * The best case is when a list is already sorted: You make one pass through the list, 
   * and because you have not switched any elements, you can stop. This has a performance of O(n).
   * 
   * @param {int[] Array} intArray
   */
    public static void bubbleSorting(int[] intArr) {
        for (int i = 0; i < intArr.length - 1; i++) {
            for (int n = 0; n < i; n++) {
                if (intArr[n] > intArr[n+1])
                    SortingUtil.swap(intArr, n, n+1);
            }
        }
    }
}