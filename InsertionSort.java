import java.util.Arrays;

public class InsertionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		{  
	        int n = a.length;  
	        
	        for (int i = 1; i < n; i++) {  
	        	
	            int key = a[i];  
	            int j = i-1;  
	            
	            while ( (j > -1) && ( a [j] > key ) ) 
	            {  
	                a [j+1] = a [j];  
	                j--;  
	            }  
	            a[j+1] = key; 

	        }  
	    }
	}

	public static void main(String[] args) {
		
        int[] array  = {5, 3, 2, 4, 1, 9, 8, 6, 7 };  
        

		InsertionSort insertionSort = new InsertionSort();

        insertionSort.sort(array);  
           
        System.out.println(Arrays.toString(array));  
       
			
			
	}
		
}


