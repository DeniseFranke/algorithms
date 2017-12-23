package com.denisefranke.algorithms;

import static org.junit.Assert.assertArrayEquals;

import org.junit.Before;
import org.junit.Test;


public class SortingTest {
    int[] a;
    int[] b;
    int[] c;
    int[] d;
    String[] e;
    String[] f;
    String[] g;
    String[] h;
    
    
    @Before
    public void setUp() throws Exception{
        a = new int[]{1,2,3,4,5,6,7,8,9,10}; //expected
        b = new int[]{10,9,8,7,6,5,4,3,2,1}; //actual
        
        c = new int[]{2,6,8,9,16,17,21,33,88,100,111}; //expected
        d = new int[]{16,2,88,33,111,6,100,21,17,9,8}; //actual
        
        e = new String[] {"cat", "dog", "elephant", "peacock", "zebra"}; //expected
        f = new String[] {"dog", "zebra", "cat", "peacock", "elephant"}; //actual
        
        g = new String[] { }; //expected
        h = new String[] { }; //actual
        
    }
    
   
    public void testBubbleSorting() {
        BubbleSorting.bubbleSorting(b);
        BubbleSorting.bubbleSorting(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testInsertionSorting() {
        InsertSorting.insertionSorting(b);
        InsertSorting.insertionSorting(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testMergeSorting() {
        MergeSorting.mergeSorting(b);
        MergeSorting.mergeSorting(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testNaturalSorting() {
        NaturalSorting.naturalSorting(b);
        NaturalSorting.naturalSorting(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testQuickSorting() {
        QuickSorting.quickSorting(b);
        QuickSorting.quickSorting(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testSelectSorting() {
        SelectionSorting.selectionSorting(b);
        SelectionSorting.selectionSorting(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testShellSorting() {
        ShellSorting.shellSort(b);
        ShellSorting.shellSort(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
    @Test
    public void testCountSorting() {
        CountSorting.countSorting(b);
        CountSorting.countSorting(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
}
