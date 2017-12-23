package com.denisefranke.algorithms;

import java.util.Arrays;

public class NaturalSorting {

  /**
   * Natural Order Sorting ints (no Comparator) 
   * 
   * @param {int[] Array} intArray
   */
    public static void naturalSorting(int[] intArr) {
    		Arrays.sort(intArr);
    }
    
    /**
     * Natural Order Sorting Strings (String implements Comparable Interface )
     * 
     * @param {int[] Array} stringArray
     */
      public static void naturalSorting(String[] stringArray) {
      		Arrays.sort(stringArray);
      }
      
}
