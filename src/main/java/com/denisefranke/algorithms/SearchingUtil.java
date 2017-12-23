package com.denisefranke.algorithms.searching;

class SearchingUtil {

	//m = minimum
    static int indexSmallest(int[] intArr, int lower, int upper) {
        int m = lower;
        for (int i = lower+1; i <= upper; i++)
            if (intArr[i] < intArr[m])
                m = i;
        return m;
    }
	
	//swap values
    static void swap(int[] intArr, int i, int j) {
        int t = intArr[i];
        intArr[i] = intArr[j];
        intArr[j] = t;
    }

  
}
