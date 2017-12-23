package com.denisefranke.algorithms;

public class CountSorting {
    
	/**
	 * Count Sorting - 
	 * 
	 * @param {int[] Array} intArr
	 */
	public static void countSorting(int[] intArr) {
	    int l = intArr.length;
	    int[]  temp = minMax(intArr),
	          count = countSorter(intArr, temp[0], temp[l-1]);
	    
	    for (int i = 1; i < count.length; i++)
	        count[i] += count[i-1];
	    
	    for (int i = 0; i < l; i++)
	    	intArr[count[temp[i] - temp[0]]--] = temp[i];
	}
	
	private static int[] countSorter(int[] intArr, int min, int max) {
	    int[] count = new int[max - min + 1];
	    for (int i : intArr)
	        count[i - min]++;
	        count[0]--;
	        
	    return count;
	}
	
	private static int[] minMax(int[] intArr) {
	    int[] out = new int[intArr.length];
	    int min = 0,
	        max = 0;
	    
	    for (int i = 0; i < intArr.length; i++) {
	        if (intArr[i] < intArr[min]) {
	            min = i;
	        } else if (intArr[i] > intArr[max]) {
	            max = i;
	        }
	        out[i] = intArr[i]; 
	    }
	
	    SortingUtil.swap(out, 0, min);
	    
	    if (intArr.length-1 != min) 
	        SortingUtil.swap(out, intArr.length-1, max);
	    
	    return out;
	}
}
