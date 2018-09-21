import java.util.Arrays;

public class BubbleSort implements SortingAlgorithm {
	
	public Swap swapNeeded = new Swap();
	@Override
	public void sort(int[] a) {
		
		int i = 0, n = a.length;
	    boolean swapNeeded = true;
	    while (i < n - 1 && swapNeeded) {
	        swapNeeded = false;
	        for (int j = 1; j < n - i; j++) {
	            if (a[j - 1] > a[j]) {
	                int temp = a[j - 1];
	                a[j - 1] = a[j];
	                a[j] = temp;
	                swapNeeded = true;
	            }
	        }
	        if(!swapNeeded) {
	            break;
	        }
	        i++;
	    }
	
	}
	
	public static void main(String[] args) {
		
		int[] array = { 2, 1, 4, 6, 3, 5 };
		
		BubbleSort bubbleSort = new BubbleSort();
		
		bubbleSort.sort(array); 
		
		System.out.print(Arrays.toString(array));
		
		
		
	}

}
