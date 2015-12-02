/*
 * An Insertion sort example in descending order.
 * 
 */

/**
 *
 * @author: Arl Kheem Rey Galario
 */
public class MyInsertionSort {
 
    public static void main(String[] args) {
         
        int[] input = { 4, 2, 9, 6, 23, 12, 34, 0, 1 }; // array to be sorted
        
        int key;  
        int i;
        int j; //the number of items sorted so far
        
        for ( j = 1; j < input.length ; j++) { // start with 1 not 0
            key = input[j];
            
            
            for (i = j-1; (i > -1) && ( input [i] > key ); i -- ) { // smaller values moving up
                
                input [i+1] = input [i];
                
            }
            
            input[i+1] = key; // put the key in its proper location
    }
        
        // Display the sorted Array
     for (j = 0; j < input.length ; j++) {
           
         System.out.print(input[j] +"," );
      
    }
   
}
}
