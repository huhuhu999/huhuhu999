package cse360assign2;

import java.lang.reflect.Array;

/**
 * Assignment #2
 * Name: YUXUAN HU
 * Class ID: 440
 * Description: practice with using a version control
 * system, get to know more about Github.
 *
 */

public class SimpleList {
	private int[] list;
	private int count;
	
	public SimpleList() {
		this.list = new int[10]; //have a 10 elements long list
		this.count = 0; //set a count to count the element inside the array
	}

	/**
	 * @param the list[0] the num to set
	 * this is add num in the the array,
	 * the list was initially full, then increase 
	 * the size by 50% so there will be room.
	 */
	public void add(int num) {
		
		if(count  < 1) {
			list[0] = num;
			count++;
			
		}else if(count < list.length) { //there is something in the list, but not yet full
			for(int i = count; i > 0; i--) {
				list[i] = list[i - 1]; 
			}
			list[0] = num; //add to the list
			count++;
			
		}else if(count >= list.length){
			//swap to a 50% longer array
			if(count == list.length) {
				int halfcount = count/2;
				int newsize = count + halfcount;
				int newarray[] = new int[newsize];
				for(int i = 0; i < count; i++) {
					newarray[i] = list[i];
				}
				list = newarray;
			}
			
			for(int i = count; i > 0; i--) {
				list[i] = list[i - 1];
			}
			list[0] = num;
			count++;
		}
	}
	
	/**
	 * @param list[count] the num to set
	 * The append method should append the parameter to the end of the list.  
	 * If the list was full, then increase the size by 50% so there will be room. 
	 *
	 */
	public void append(int num) {
		if(count < list.length) {
			list[count] = num;
			count++;
		}else {
			//swap to a 50% longer array
			if(count == list.length) {
				int halfcount = count/2;
				int newsize = count + halfcount;
				int newarray[] = new int[newsize];
				for(int i = 0; i < count; i++) {
					newarray[i] = list[i];
				}
				list = newarray;
			}
			
			list[count] = num;
			count++;
		}
	}
	
	/**
	 * @return the first element in the list
	 * if there are no elements n the list, then return -1.
	 */
	public int first() {
		if(count == 0) {
			return -1;
		}else {
		return list[0];
		}
	}
	
	/**
	 * @return the last element in the list
	 * if there are no elements n the list, then return -1.
	 */
	public int last() {
		if(count == 0) {
			return -1;
		}else {
		return list[count - 1];
		}
	}
	
	
	/**
	 * if the parameter is in the list, then remove it.  The other values in 
	 * the list may need to be moved down.  Adjust the count as needed.  If the 
	 * list has more than 25% empty places, the decrease the size of the list.
	 */
	public void remove(int num) {
		for(int i = 0; i < count; i++) { //get all elements in array
			if(list[i] == num) { //search is there a same one that we what found
				for(int j = i; j < count - 1; j++) { //remove that element in array
					list[j] = list[j+1];
				}
			}
		}
		count--; //successful remove count decrease
		//swap to a 25% shorter array
		double blank = list.length - count;
		double percent = blank/list.length;
		int quarter = list.length/4;
		int newsize = list.length - quarter;
		if(percent > 0.25) {
			int newarray[] = new int[newsize];
			for(int i = 0; i < count; i++) {
				newarray[i] = list[i];
			}
			list = newarray;
		}
		
	}
	
	/**
	 * @return the current number of possible locations in the list
	 */
	public int size() {
		return list.length;
	}
	
	
	/**
	 * @return the number of elements stored in the list.
	 */
	public int count() {
		return count;
	}
	/**
	 * @return the list as a String.
	 *   The elements must be separated by a space.  This means there is 
	 *   not space after the last integer.
	 */
	public String toString() {
		String str = " "; //we have a space
		for(int i = 0;i < count; i++) { //we get the array
			str += list[i]; //get each string
			if(i != count - 1) { //there is not space after the last integer
				str += " "; // if is not last integer add a space behind each element
			}
		}
		return str;
	}
	
	/**
	 * @return the location of the parameter in the list.  
	 * If the parameter is not in the list, then return -1. 
	 */
	public int search(int num) {
		int location; //have location
		for(int i = 0; i < count; i++) {//get all element in list
			if(list[i] == num) { //find the one want search
				location = i; //because it start from 0, so add 1 to correct
				return location; //get location and return location
			}
		}
		return -1; //if not found return -1;
	}


}
