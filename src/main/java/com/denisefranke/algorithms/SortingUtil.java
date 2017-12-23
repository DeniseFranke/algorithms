package com.denisefranke.algorithms;
/**
 * 
 * SortingUtil - indexSmallest and swap values
 * @author Denise Franke
 * 
 */
class SortingUtil {

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
    
  //swap values
    static void swap(String[] strArr, int i, int j) {
        String t = strArr[i];
        strArr[i] = strArr[j];
        strArr[j] = t;
    }

  
}
