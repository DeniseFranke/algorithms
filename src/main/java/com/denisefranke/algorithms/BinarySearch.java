package com.denisefranke.algorithms;

public class BinarySearch implements BinarySearchRoot {

  /**
   * Binary Searching implements Binary Search Root
   *  
   * @param {int[] Array} intArray
   */
    
    BinarySearchNode binarySearchNode = null;
	
	@Override
	public void init(int[] ini)
	{
		if(ini == null)
			throw new IllegalArgumentException();
			
		for(int val : ini)
		{
			add(val);
		}
	}
	
	@Override
	public void clear()
	{
		binarySearchNode = null;
	}
	
	@Override
	public void add(int val)
	{
		if( binarySearchNode == null)
		{			
			binarySearchNode = new BinarySearchNode(val);
			return;
		}
		addBinarySearchNode( binarySearchNode, val);
	}
	
	private void addBinarySearchNode( BinarySearchNode p, int val )
	{
		if(val < p.val)
		{
			if(p.left == null)
				p.left = new BinarySearchNode(val);
			else
				addBinarySearchNode(p.left, val);
		}
		else
		{
			if(p.right == null)
				p.right = new BinarySearchNode(val);
			else
				addBinarySearchNode(p.right, val);
		}
	}
	
	@Override
	public void print()
	{
		printBinarySearchNode( binarySearchNode );
	}
	
	private void printBinarySearchNode( BinarySearchNode p )
	{
		if( p == null)
			return;
		
		printBinarySearchNode(p.left);      			//L
		System.out.print( p.val + "," );	//V
		printBinarySearchNode(p.right);					//R
	}
	
	@Override
	public int size()
	{
		return sizeBinarySearchNode(binarySearchNode);
	}
	
	private int sizeBinarySearchNode( BinarySearchNode p )
	{
		if(p == null)
			return 0;
		
		int ret = 0;
		
		ret += sizeBinarySearchNode(p.left);
		ret++;
		ret += sizeBinarySearchNode(p.right);
			
		return ret;
	}
	
	@Override
	public int leaves()
	{
		return countLeaves(binarySearchNode);		
	}
	
	private int countLeaves( BinarySearchNode p )
	{
		if(p == null)
			return 0;
		
		int ret = 0;
		
		ret += countLeaves(p.left);
		
		if( p.left == null && p.right == null)
		{
			ret++;
		}
		
		ret += countLeaves(p.right);
		
		return ret;	
	}
	
	@Override
	public int nodes()
	{
		return countBinarySearchNodes( binarySearchNode );
	}
	
	private int countBinarySearchNodes( BinarySearchNode p )
	{
		if(p == null)
			return 0;		
		
		int ret = 0;
		
		ret += countBinarySearchNodes(p.left);
		
		if( p.left != null || p.right != null)
		{
			ret++;
		}
		
		ret += countBinarySearchNodes(p.right);
		
		return ret;
	}
		
	@Override
	public int[] toArray()
	{
		int[] ret = new int[size()];
		
		toArray(binarySearchNode, ret, new BinarySearchCounter());
		
		return ret;
	}
	
	private void toArray(BinarySearchNode p, int[] ret, BinarySearchCounter bsc)
	{		
		if(p == null)
			return;
		
		toArray(p.left, ret, bsc);
		ret[bsc.counter++] = p.val;
		toArray(p.right, ret, bsc);	
	}	
	
	@Override
	public String toString()
	{
		return toString( binarySearchNode ).trim();
	}
	
	private String toString( BinarySearchNode p )
	{
		if( p == null)
			return "";
		
		return toString(p.left) + p.val + ", " + toString(p.right);
	}

	@Override
	public void reverse()
	{
		reverseBinarySearchNodes( binarySearchNode );		
	}
	
	private void reverseBinarySearchNodes( BinarySearchNode p )
	{
		if(p == null)
			return;
		
		BinarySearchNode tmp = p.right;
		p.right = p.left;
		p.left = tmp;
		
		reverseBinarySearchNodes( p.left );
		
		reverseBinarySearchNodes( p.right );		
	}

	@Override
	public int height()
	{
		return heightOfTree( binarySearchNode );
	}
	
	private int heightOfTree( BinarySearchNode p )
	{
		if(p == null)
			return 0;
		
		return 1 + Math.max(heightOfTree(p.left), heightOfTree(p.right));
	}

	@Override
	public int width()
	{
		int[] ar = new int[height() + 1];
		nodeWidth(binarySearchNode, ar, 0);		
		return max(ar);
	}
	
	private void nodeWidth( BinarySearchNode p, int[] ar, int i )
	{
		if(p == null)
			return;
		
		nodeWidth(p.left, ar, i + 1);
		ar[i]++;
		nodeWidth(p.right, ar, i + 1);
	}
	
	private int max( int[] intArr )
	{
		int ret = intArr[0];		
		for (int i = 1; i < intArr.length; i++) 
		{
			if(intArr[i] > ret)
			{
				ret = intArr[i];
			}
		}
		return ret; 
	}

	@Override
	public void del(int val)
	{
		BinarySearchNode p = findBinarySearchNode(binarySearchNode, val);
		if(p == null)
			return;
		if(p.left == null && p.right == null)
		{
			if(p == binarySearchNode)
				binarySearchNode = null;
			else
			{
				//BinarySearchNode owner = findOwner(binarySearchNode, val);
			}
		}
		delBinarySearchNode(p);
	}

	private void delBinarySearchNode(BinarySearchNode p) 
	{
		if (p==null)
			return;
		delBinarySearchNodeLeft(p);
		delBinarySearchNodeRight(p);
	}

	private void delBinarySearchNodeLeft(BinarySearchNode p) 
	{
		if (p == null || p.left == null)
			return;
		
		BinarySearchNode tmp = p.left;
		
		if(tmp.left == null)
		{
			p.val = tmp.val;
			p.left = tmp.left;
			return;
		}
		
		while(tmp.right.right != null)
		{
			tmp = tmp.right;
		}
		p.val = tmp.right.val;
		tmp.right = tmp.right.left;
	}
	
	private void delBinarySearchNodeRight(BinarySearchNode p) 
	{
		if (p == null || p.right == null)
			return;
		BinarySearchNode tmp = p.right;

		if(tmp.left == null)
		{
			p.val = tmp.val;
			p.right = tmp.right;
			return;
		}

		while(tmp.left.left != null)
		{
			tmp = tmp.left;
		}
		p.val = tmp.left.val;
		tmp.left = tmp.left.right;
	}

	private BinarySearchNode findBinarySearchNode(BinarySearchNode p, int val)
	{
		BinarySearchNode ret = null;
		if(p == null)
			return ret;
		
		if(p.val == val)
			ret = p;
		else if(val < p.val)
			ret = findBinarySearchNode(p.left, val);
		else 
			ret = findBinarySearchNode(p.right, val);
		return ret;
	}
	
	private BinarySearchNode findOwner(BinarySearchNode p, int val)
	{
		BinarySearchNode ret = null;
		if(p == null)
			return ret;
		
		if(p.left.val == val || p.right.val == val)
			ret = p;
		else if(val < p.val)
			ret = findBinarySearchNode(p.left, val);
		else
			ret = findBinarySearchNode(p.right, val);
		return ret;
	}
}