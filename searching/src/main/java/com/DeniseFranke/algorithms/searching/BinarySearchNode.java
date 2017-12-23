package com.DeniseFranke.algorithms.searching;

/**
 * Binary Search Node
 *
 */
class BinarySearchNode 
{
	int val;
	BinarySearchNode left  = null;
	BinarySearchNode right = null;	
	
	public BinarySearchNode(int val)
	{
		this.val = val;
	}	
	
	public Integer getVal() {
		return val;
	}	
	
	public void setVal(Integer val) {
		this.val = val;
	}
    
    public BinarySearchNode getLeft() {
		return left;
    }
    
    public void setLeft(BinarySearchNode left) {
    		this.left = left;
    }
    
    public BinarySearchNode getRight() {
		return right;    	
    }
    
    public void setRight(BinarySearchNode right) {
    		this.right = right;
    }
    
 }
