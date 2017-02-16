
public class SelectionSort {
	public static int[] doSelectionSort(int[] arr){
		// start at the beginning of the whole array
	    for (int i = 0; i < arr.length - 1; i++)	  
		{
	   System.out.println("i is: " + i);
		int minimum = i;	// (1) default value of the 1st element index � use this to test against every other element.
		for(int j = i +1; j < arr.length; j++)	  // (2) loop from the beginning of unsorted zone to the end of the array.
		{			   
		if(arr [j] < arr[minimum])	// compare current element to minimum
		 minimum = j;	// if it's lower, it becomes the new minimum
		}
		
		// swap the two values

		int temp = arr [i]; 
		arr [i] = arr[minimum];
		arr [minimum] = temp;
		}
	        return arr;
	    }
	     
	   public static void main(String a[]){
	         
	        int[] arr1 = {1,2,6,8,34,56};
	        int[] arr2 = doSelectionSort(arr1);
	        for(int i:arr2){
	            System.out.print(i);
	            System.out.print(", ");
	        }
	}
}
