/*
 * testSelectionSort.java
 *
* To change this template, choose Tools | Template Manager
 * and open the template in the editor.
 */
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;
public class testSelectionSort {
@Test
public void test() {
//testPositive();
//testNegative();
//testMixed();
testDuplicates();
}
    public testSelectionSort() {
    	
    }
    
    public void testPositive(){
        int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 9;
        arr[2] = 7;
        arr[3] = 10;
        arr[4] = 2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = 2;
        Sortedarr[1] = 7;
        Sortedarr[2] = 8;
        Sortedarr[3] = 9;
        Sortedarr[4] = 10;
        
       
        /** add tests to check for this unit test **/
        SelectionSort selectionSort = new SelectionSort();
        assertArrayEquals("Assertion Fails", Sortedarr, selectionSort.basicSelectionSort(arr));
    }
    
    public void testNegative(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = -9;
        arr[2] = -7;
        arr[3] = -10;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -10;
        Sortedarr[1] = -9;
        Sortedarr[2] = -8;
        Sortedarr[3] = -7;
        Sortedarr[4] = -2;
        
       
        /** add tests to check for this unit test **/
        /** Test data contains negative values only **/
        SelectionSort selectionSort = new SelectionSort();
        assertArrayEquals("Assertion Fails", Sortedarr, selectionSort.basicSelectionSort(arr));
        
    }
    
    public void testMixed(){
    	int[] arr = new int[5];
        arr[0] = -8;
        arr[1] = 9;
        arr[2] = 0;
        arr[3] = -90;
        arr[4] = 21;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -90;
        Sortedarr[1] = -8;
        Sortedarr[2] = 0;
        Sortedarr[3] = 9;
        Sortedarr[4] = 21;
        
       
        /** add tests to check for this unit test **/
        SelectionSort selectionSort = new SelectionSort();
        assertArrayEquals("Assertion Fails", Sortedarr, selectionSort.basicSelectionSort(arr));
        /** Test data contains with both positive, negative and zeros **/
    }
    
    public void testDuplicates(){
    	int[] arr = new int[5];
        arr[0] = 8;
        arr[1] = 8;
        arr[2] = 0;
        arr[3] = -2;
        arr[4] = -2;
        
        int[] Sortedarr = new int[5];
        Sortedarr[0] = -2;
        Sortedarr[1] = -2;
        Sortedarr[2] = 0;
        Sortedarr[3] = 8;
        Sortedarr[4] = 8;
        
        /** add tests to check for this unit test **/
        SelectionSort selectionSort = new SelectionSort();
        assertArrayEquals("Assertion Fails", Sortedarr, selectionSort.basicSelectionSort(arr));
        
        /** Test data contains duplicates **/
    }
}
