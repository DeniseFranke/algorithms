package com.DeniseFranke.algorithms.sorting;

public class SelectionSorting {

    /**
     * Selection Sorting
     * 
     * @param {int[] Array} intArr
     */
    public static void selectionSorting(int[] intArr) {
        for (int i = 0; i < intArr.length - 1; i++) {
            int j = SortingUtil.indexSmallest(intArr, i, intArr.length - 1);
            SortingUtil.swap(intArr, i, j);
        }
    }
}
