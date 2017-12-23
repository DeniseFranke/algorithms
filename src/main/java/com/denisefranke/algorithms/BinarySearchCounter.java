package com.denisefranke.algorithms;

/**
 * Binary Search Counter
 *
 */
public class BinarySearchCounter
{
	int counter = 0;
	
	public BinarySearchCounter() {
		this.counter = 0;
	}

	public BinarySearchCounter(int val)
	{
		this.counter = val;
	}	
	
    	public int getCounter() {
    		return counter;
    	}
    	
    	public void setCounter(int counter) {
    		this.counter = counter;
    	}
    	
    	public void resetCounter() {
    		this.counter = 0;
    	}
}
