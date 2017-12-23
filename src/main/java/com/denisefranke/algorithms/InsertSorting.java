package com.denisefranke.algorithms;

public class InsertSorting {

    /**
     * Insert Sorting - Inner and Other Loop.  Advantage over bubble sorting because
     * once the list to return has been constructed, it can be returned immediately; 
     * there are no redundant cycles to check that the list is in order.  
     * The worst-case performance for this algorithm is still O(n^2), though, if you 
     * attempt to sort an already-sorted list, you need to iterate to the end of the new 
     * list with each element to insert. However, if you sort a reverse-order list, 
     * you put each element into the new list at the head of the list, which is O(n).
     * Also note, the algorithm described here uses twice as much space to sort the list 
     * because a new list is returned, where the bubble sort algorithm only used one 
     * extra space in memory, to hold the value temporarily while being swapped.
     * 
     * @param {int[] Array} intArr
     */
    public static void insertionSorting(int[] intArr) {
        for (int i = 1; i < intArr.length; i++) {
            if (intArr[i] < intArr[i-1]) {
            	
                int toInsert = intArr[i];
                int n = i;
            
                do {
                	intArr[n] = intArr[n - 1];  //shift right
                    n = n - 1;
                } while (n > 0 && toInsert < intArr[n-1]);

                intArr[n] = toInsert;  //insert
            }
        }
    }
}
