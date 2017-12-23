package com.denisefranke.algorithms;

public class ShellSorting {

    /**
     * Shell Sorting
     * 
     * @param {int[] Array} intArr
     */
    public static void shellSort(int[] intArr) {
        int m = 1;
        while (2 * m <= intArr.length)
            m = 2 * m;
        m = m - 1;

        while (m >= 1) {
            for (int i = m; i < intArr.length; i++) {
                if (intArr[i] < intArr[i-m]) {
                    int toInsert = intArr[i];

                    int n = i;
                    do {
                        intArr[n] = intArr[n - m];
                        n = n - m;
                    } while (n > m-1 &&
                      toInsert < intArr[n-m]);

                    intArr[n] = toInsert;
                }
            }
            m = m / 2;
        }
    }
}
