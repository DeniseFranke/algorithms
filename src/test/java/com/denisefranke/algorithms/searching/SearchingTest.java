package com.DeniseFranke.algorithms.searching;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;


public class SearchingTest {
    int[] a;
    int[] b;
    int[] c;
    int[] d;
    String[] e;
    String[] f;
    String[] g;
    String[] h;
    BinarySearchRoot binarySearch = (BinarySearchRoot) new BinarySearch();
    
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
	binarySearch.clear();        
    }
    
    @Test
    public void testBinarySearch() {
        BinarySearch.binarySearching(b);
        BinarySearch.binarySearching(d);
        
        assertArrayEquals(a, b);
        assertArrayEquals(c, d);
    }
    
	
	//=============================================================================
	//Initialize
	//=============================================================================
	
	@Test (expected = IllegalArgumentException.class)
	public void testInitNull()
	{
		int[] ini = null;
		binarySearch.init(ini);
	}
	
	@Test
	public void testInit_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {};
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void testInit_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {50};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testInit_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {25, 50};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testInitManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {7, 11, 25, 34, 50};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testInitManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {7, 11, 20, 25, 34, 36, 40, 50, 80, 100};
		assertArrayEquals(exp, act);		
	}
	
	//=============================================================================
	//Clear
	//=============================================================================
	
	@Test
	public void testClear_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		binarySearch.clear();
		int[] act = binarySearch.toArray();
		assertEquals(0, binarySearch.size());
		int[] exp = {};
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void testClear_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		binarySearch.clear();
		int[] act = binarySearch.toArray();
		assertEquals(0, binarySearch.size());
		int[] exp = {};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testClear_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		binarySearch.clear();
		int[] act = binarySearch.toArray();
		assertEquals(0, binarySearch.size());
		int[] exp = {};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testClearManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		binarySearch.clear();
		int[] act = binarySearch.toArray();
		assertEquals(0, binarySearch.size());
		int[] exp = {};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testClearManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		binarySearch.clear();
		int[] act = binarySearch.toArray();
		assertEquals(0, binarySearch.size());
		int[] exp = {};
		assertArrayEquals(exp, act);		
	}

	//=============================================================================
	//Add
	//=============================================================================
	
	@Test
	public void testAdd_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		binarySearch.add(60);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length + 1, binarySearch.size());
		int[] exp = {60};
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void testAdd_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		binarySearch.add(60);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length + 1, binarySearch.size());
		int[] exp = {50, 60};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testAdd_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		binarySearch.add(30);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length + 1, binarySearch.size());
		int[] exp = {25, 30, 50};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testAddManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		binarySearch.add(5);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length + 1, binarySearch.size());
		int[] exp = {5, 7, 11, 25, 34, 50};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testAddManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		binarySearch.add(35);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length + 1, binarySearch.size());
		int[] exp = {7, 11, 20, 25, 34, 35, 36, 40, 50, 80, 100};
		assertArrayEquals(exp, act);		
	}

	//=============================================================================
	//Size
	//=============================================================================
	
	@Test
	public void testSize_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		assertEquals(ini.length, binarySearch.size());
	}
	
	@Test
	public void testSize_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		assertEquals(ini.length, binarySearch.size());		
	}
	
	@Test
	public void testSize_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		assertEquals(ini.length, binarySearch.size());		
	}
	
	@Test
	public void testSizeManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		assertEquals(ini.length, binarySearch.size());		
	}
	
	@Test
	public void testSizeManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		assertEquals(ini.length, binarySearch.size());		
	}

	//=============================================================================
	//Leaves
	//=============================================================================

	@Test
	public void testLeaves_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		assertEquals( 0, binarySearch.leaves());
	}
	
	@Test
	public void testLeaves_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		assertEquals( 1, binarySearch.leaves());		
	}
	
	@Test
	public void testLeaves_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		assertEquals( 1, binarySearch.leaves());		
	}
	
	@Test
	public void testLeavesManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		assertEquals( 2, binarySearch.leaves());		
	}
	
	@Test
	public void testLeavesManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		assertEquals( 4, binarySearch.leaves());		
	}

	//=============================================================================
	//Binary Search Nodes
	//=============================================================================

	@Test
	public void testNodes_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		assertEquals( 0, binarySearch.nodes());
	}
	
	@Test
	public void testNodes_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		assertEquals( 0, binarySearch.nodes());		
	}
	
	@Test
	public void testNodes_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		assertEquals( 1, binarySearch.nodes());		
	}
	
	@Test
	public void testNodesManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		assertEquals( 3, binarySearch.nodes());		
	}
	
	@Test
	public void testNodesManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		assertEquals( 6, binarySearch.nodes());		
	}

	//=============================================================================
	//toArray
	//=============================================================================
	
	@Test
	public void testToArray_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {};
		assertArrayEquals(exp, binarySearch.toArray());	
	}
	
	@Test
	public void testToArray_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {50};
		assertArrayEquals(exp, binarySearch.toArray());		
	}
	
	@Test
	public void testToArray_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {25, 50};
		assertArrayEquals(exp, binarySearch.toArray());		
	}
	
	@Test
	public void testToArrayManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {7, 11, 25, 34, 50};
		assertArrayEquals(exp, binarySearch.toArray());		
	}
	
	@Test
	public void testToArrayManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {7, 11, 20, 25, 34, 36, 40, 50, 80, 100};
		assertArrayEquals(exp, binarySearch.toArray());		
	}

	//=============================================================================
	//toString
	//=============================================================================
	
	@Test
	public void testToString_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		String exp = "";
		assertEquals(exp, binarySearch.toString());
	}
	
	@Test
	public void testToString_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		String exp = "50,";
		assertEquals(exp, binarySearch.toString());		
	}
	
	@Test
	public void testToString_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		String exp = "25, 50,";
		assertEquals(exp, binarySearch.toString());		
	}
	
	@Test
	public void testToStringManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		String exp = "7, 11, 25, 34, 50,";
		assertEquals(exp, binarySearch.toString());		
	}
	
	@Test
	public void testToStringManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		String exp = "7, 11, 20, 25, 34, 36, 40, 50, 80, 100,";
		assertEquals(exp, binarySearch.toString());		
	}

	//=============================================================================
	//Reverse
	//=============================================================================
		
	@Test
	public void testReverse_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		binarySearch.reverse();
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {};
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void testReverse_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		binarySearch.reverse();
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {50};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testReverse_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		binarySearch.reverse();
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {50, 25};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testReverseManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		binarySearch.reverse();
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {50, 34, 25, 11, 7};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testReverseManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		binarySearch.reverse();
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {100, 80, 50, 40, 36, 34, 25, 20, 11, 7};
		assertArrayEquals(exp, act);		
	}

	//=============================================================================
	//Height
	//=============================================================================

	@Test
	public void testHeight_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		assertEquals( 0, binarySearch.height());
	}
	
	@Test
	public void testHeight_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		assertEquals( 1, binarySearch.height());		
	}
	
	@Test
	public void testHeight_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		assertEquals( 2, binarySearch.height());		
	}
	
	@Test
	public void testHeightManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		assertEquals( 4, binarySearch.height());		
	}
	
	@Test
	public void testHeightManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		assertEquals( 5, binarySearch.height());		
	}

	//=============================================================================
	//Width
	//=============================================================================

	@Test
	public void testWidth_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		assertEquals( 0, binarySearch.width());
	}
	
	@Test
	public void testWidth_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		assertEquals( 1, binarySearch.width());		
	}
	
	@Test
	public void testWidth_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		assertEquals( 1, binarySearch.width());		
	}
	
	@Test
	public void testWidthManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		assertEquals( 2, binarySearch.width());		
	}
	
	@Test
	public void testWidthManyEven()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		assertEquals( 3, binarySearch.width());		
	}

	//=============================================================================
	//Remove
	//=============================================================================
	
	@Test
	public void testRemove_0_Length()
	{
		int[] ini = {};
		binarySearch.init(ini);
		binarySearch.del(33);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {};
		assertArrayEquals(exp, act);	
	}
	
	@Test
	public void testRemove_1_Length()
	{
		int[] ini = {50};
		binarySearch.init(ini);
		binarySearch.del(50);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length - 1, binarySearch.size());
		int[] exp = {};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testRemove_2Length()
	{
		int[] ini = {50, 25};
		binarySearch.init(ini);
		binarySearch.del(50);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length - 1, binarySearch.size());
		int[] exp = {25};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testRemoveManyOdd()
	{
		int[] ini = {50, 25, 11, 34, 7};
		binarySearch.init(ini);
		binarySearch.del(11);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length - 1, binarySearch.size());
		int[] exp = {7, 25, 34, 50};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testRemoveManyEven_Inside()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		binarySearch.del(34);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length - 1, binarySearch.size());
		int[] exp = {7, 11, 20, 25, 36, 40, 50, 80, 100};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testRemoveManyEven_LastLeft()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		binarySearch.del(7);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length - 1, binarySearch.size());
		int[] exp = {11, 20, 25, 34, 36, 40, 50, 80, 100};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testRemoveManyEven_LastRight()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		binarySearch.del(100);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length - 1, binarySearch.size());
		int[] exp = {7, 11, 20, 25, 34, 36, 40, 50, 80};
		assertArrayEquals(exp, act);		
	}
	
	@Test
	public void testRemoveManyEven_AbinarySearchent()
	{
		int[] ini = {50, 25, 11, 34, 7, 20, 36, 80, 100, 40};
		binarySearch.init(ini);
		binarySearch.del(35);
		int[] act = binarySearch.toArray();
		assertEquals(ini.length, binarySearch.size());
		int[] exp = {7, 11, 20, 25, 34, 36, 40, 50, 80, 100};
		assertArrayEquals(exp, act);		
	}
    
 
}


