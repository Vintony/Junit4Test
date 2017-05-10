package test;

import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import service.mergeSort;

public class mergeSortTest {
	 
	private static mergeSort mergeSortObject = new mergeSort();
	
	@Before  
    public void setUp() {  
          
    }  
      
    @Test  
    public void should_return_1_for_merge_sort_1() {  
        int[] input = {1};  
        int[] expected = {1};  
        assertArrayEquals(expected, mergeSortObject.sort(input));  
    }  
  
    @Test  
    public void should_return_12_for_merge_sort_21() {  
        int[] input = {2,1};  
        int[] expected = {1,2};  
        assertArrayEquals(expected, mergeSortObject.sort(input));  
    }  
  
    @Test  
    public void should_return_1234_for_merge_sort_3214() {  
        int[] input = {3,2,1,4};  
        int[] expected = {1,2,3,4};  
        assertArrayEquals(expected, mergeSortObject.sort(input));  
    }  
  
    @Test  
    public void should_return_12345_for_merge_sort_54321() {  
        int[] input = {5, 4, 3, 2, 1};  
        int[] expected = {1, 2, 3, 4, 5};  
        assertArrayEquals(expected, mergeSortObject.sort(input));  
    }

}
