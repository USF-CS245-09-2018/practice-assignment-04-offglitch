import java.util.Arrays;

public class SelectionSort implements SortingAlgorithm {

	@Override
	public void sort(int[] a) {
		int n = a.length;
		 
        for (int i = 0; i < n-1; i++)
        {
            int min_idx = i;
            for (int j = i+1; j < n; j++)
                if (a[j] < a[min_idx])
                    min_idx = j;
 
            int temp = a[min_idx];
            a[min_idx] = a[i];
            a[i] = temp;
        }

	}
	public static void main(String[] args) {

        int[] array  = {5, 3, 2, 4, 1, 9, 8, 6, 7 };  
        
		SelectionSort selectionSort = new SelectionSort();
		
        selectionSort.sort(array);  
        
        System.out.println(Arrays.toString(array));  
				
	}
}
