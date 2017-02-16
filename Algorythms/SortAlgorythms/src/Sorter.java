
public class Sorter
{
	//Stopwatch myStopwatch = new Stopwatch();
	// array of random numbers
	public static void doRandomArray(int[] myArray) {
		for (int i = 0; i < myArray.length-1; i++) {
			myArray[i] = (int) (Math.random() * 100);
			System.out.print(myArray[i] + " ");
		}
	}

	// array of sorted numbers ascending
	public static void doSortedArray(int[] myArray) {
		for (int i = 0; i < myArray.length; i++) {
			myArray[i] = (int) (i);
			System.out.print(i +" ");
		}
	}

	// array of sorted numbers descending
	public static void doInverselySortedArray(int[] myArray) {
		for (int i = myArray.length-1; i >= 0; i--) {
			myArray[i] = (int) (i);
			System.out.print(i+" ");
		}
	}

	// bubblesort
	public static void doBubbleSort(int[] myArray) {
		int temp = 0;
		int swaps=0;
		int comparisons=0;
		Stopwatch myStopwatch = new Stopwatch();
		myStopwatch.start();
		myStopwatch.startNano();
		for (int i = 0; i < myArray.length - 1; i++) {
			comparisons++;
			for (int j = 0; j < myArray.length - 1; j++) {
				if (myArray[j] > myArray[j + 1]) {
					temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
					swaps++;
				}
			}
		}
		
		for (int i = 0; i < myArray.length; i++)
	      {
	         System.out.print(+myArray[i] +" ");
	      } 
		System.out.println("\nTime Elapsed Bubble Sort Milliseconds: " +myStopwatch.getElapsedTime());
		System.out.println("\nTime Elapsed Bubble Sort Nanoseconds: " +myStopwatch.getElapsedTimeNano());
		myStopwatch.stop();
		myStopwatch.stopNano();
		myStopwatch.reset();
		System.out.println("\nComparisons done: " +comparisons);
		System.out.println("\nSwaps done: " +swaps);
	}
	
	
	// enhanced bubble sort
	public static void doEnhancedBubbleSort(int[] myArray) {

		int temp = 0;
		int swaps=0;
		int comparisons=0;
		Boolean sorted = true;
		Stopwatch myStopwatch = new Stopwatch();
		myStopwatch.start();
		myStopwatch.startNano();
		for (int i = 0; i < myArray.length - 1; i++) {
			comparisons++;
			for (int j = 0; j < myArray.length - i - 1; j++) {

				if (myArray[j] > myArray[j + 1]) {
					temp = myArray[j];
					myArray[j] = myArray[j + 1];
					myArray[j + 1] = temp;
					sorted = false;
					swaps++;
				}
			}
			if (sorted)
				break;
		}
		for (int i = 0; i < myArray.length; i++)
	      {
	         System.out.print(+myArray[i] +" ");
	      } 
		System.out.println("\nTime Elapsed Selection Sort Milliseconds: " +myStopwatch.getElapsedTime());
		System.out.println("\nTime Elapsed Enhanced Bubble Sort Nanoseconds: " +myStopwatch.getElapsedTimeNano());
		myStopwatch.stop();
		myStopwatch.stopNano();
		myStopwatch.reset();
		System.out.println("\nComparisons done: " +comparisons);
		System.out.println("\nSwaps done: " +swaps);
		
	}

	// selection sort
	public static int[] doSelectionSort(int[] arr) {
		int swaps=0;
		int comparisons=0;
		Stopwatch myStopwatch = new Stopwatch();
		myStopwatch.start();
		myStopwatch.startNano();
		for (int i = 0; i < arr.length - 1; i++) {
			int minimum = i;
			comparisons++;
			for (int j = i + 1; j < arr.length; j++) {
				if (arr[j] < arr[minimum]) // compare current element to minimum
					minimum = j; // if it's lower, it becomes the new minimum
					swaps++;
			}
			// swap the two
			int temp = arr[i];
			arr[i] = arr[minimum];
			arr[minimum] = temp;
		}
		for(int i:arr){
            System.out.print(i +" ");
		}
		System.out.println("\nTime Elapsed Selection Sort Milliseconds: " +myStopwatch.getElapsedTime());
		System.out.println("\nTime Elapsed Bubble Sort Nanoseconds: " +myStopwatch.getElapsedTimeNano());
		myStopwatch.stop();
		myStopwatch.stopNano();
		myStopwatch.reset();
		System.out.println("\nComparisons done: " +comparisons);
		System.out.println("\nSwaps done: " +swaps);
		return arr;		 		 
      }

	
	
	// insertion sort
	public static int[] doInsertionSort(int[] list) {
		int swaps=0;
		int comparisons=0;
		Stopwatch myStopwatch = new Stopwatch();
		myStopwatch.start();
		myStopwatch.startNano();
		for (int i = 1; i < list.length; i++) {
			int next = list[i];
			comparisons++;
			// find the insertion location while moving all larger element up
			int j = i;
			while (j > 0 && list[j - 1] > next) {
				list[j] = list[j - 1];
				j--;
				swaps++;
			}
			// insert the element
			list[j] = next;
		}
		for(int i:list){
            System.out.print(i +" ");
		}
		System.out.println("\nTime Elapsed Insertion Sort Milliseconds: " +myStopwatch.getElapsedTime());
		System.out.println("\nTime Elapsed Bubble Sort Nanoseconds: " +myStopwatch.getElapsedTimeNano());
		myStopwatch.stop();
		myStopwatch.stopNano();
		myStopwatch.reset();
		System.out.println("\nComparisons done: " +comparisons);
		System.out.println("\nSwaps done: " +swaps);
		return list;
	}

}
