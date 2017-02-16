package Sorting;
import java.util.Scanner;

public class SortTester extends Sorter {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner keyboardIn = new Scanner(System.in);
		int elements, opt1, opt2;
		do{
		// Display menu
		System.out.println("\nPlease Select Number of Elements in Array (1000,10000,100000)");
		elements = keyboardIn.nextInt();
		int[] myArray = new int[elements];
		doRandomArray(myArray);
		System.out.println("\nPlease Select the Structure of Data in Array");
		System.out.println("1: Random Array");
		System.out.println("2: Sorted Array");
		System.out.println("3: Inversely Sorted Array");
		System.out.println("0: Quit");
		opt1 = keyboardIn.nextInt();

		// test for valid option
		if ((opt1 != 0) && (opt1 != 1) && (opt1 != 2) && (opt1 != 3)) {
			System.out.println("Invalid Option - Please Select an Option from the menu:");
			System.out.println("");
		}
		switch (opt1) {
		case 1:
			System.out.println("Random Array");
			for (int i = 0; i < myArray.length; i++)
		      {
		         System.out.println(+myArray[i] +" ");
		      } 
			break;
		case 2:
			doSortedArray(myArray);
			break;
		case 3:
			doInverselySortedArray(myArray);
			break;

		case 0:
			System.out.println("You have chosen quit...");
			break;

		default:
			System.out.println("Invalid option Please choose 1, 2, 3 or 0");

		} // End of switch
		do
		{
		System.out.println("\nPlease Select Sorting Algorithm");
		System.out.println("1: Bubble Sort");
		System.out.println("2: Enhanced Bubble Sort");
		System.out.println("3: Selection Sort");
		System.out.println("4: Insertion Sort");
		System.out.println("0: Quit");
		opt2 = keyboardIn.nextInt();
		// test for valid option
		if ((opt2 != 0) && (opt2 != 1) && (opt2 != 2) && (opt2 != 3) && (opt2 != 4)) {
			System.out.println("Invalid Option - Please Select an Option from the menu:");
			System.out.println("");
		}
		switch (opt2) {
		case 1:
			int[] bsArray = Sorter.doTempArray(myArray);
			Stopwatch myStopwatch1 = new Stopwatch();
			myStopwatch1.start();
			myStopwatch1.startNano();
			doBubbleSort(bsArray);
			myStopwatch1.stop();
			myStopwatch1.stopNano();
			System.out.println("\nTime Elapsed Bubble Sort Milliseconds: " +myStopwatch1.getElapsedTime());
			System.out.println("\nTime Elapsed Bubble Sort Nanoseconds: " +myStopwatch1.getElapsedTimeNano());
			myStopwatch1.reset();
			break;
		case 2:
			int[] ebsArray = Sorter.doTempArray(myArray);
			Stopwatch myStopwatch2 = new Stopwatch();
			myStopwatch2.start();
			myStopwatch2.startNano();
			doEnhancedBubbleSort(ebsArray);
			myStopwatch2.stop();
			myStopwatch2.stopNano();
			System.out.println("\nTime Elapsed Enhanced Bubble Sort Milliseconds: " +myStopwatch2.getElapsedTime());
			System.out.println("\nTime Elapsed Enhanced Bubble Sort Nanoseconds: " +myStopwatch2.getElapsedTimeNano());
			myStopwatch2.reset();
			break;
		case 3:
			int[] sArray= Sorter.doTempArray(myArray);
			Stopwatch myStopwatch3 = new Stopwatch();
			myStopwatch3.start();
			myStopwatch3.startNano();
	        doSelectionSort(sArray);
	        myStopwatch3.stop();
			myStopwatch3.stopNano();
			System.out.println("\nTime Elapsed Selection Sort Milliseconds: " +myStopwatch3.getElapsedTime());
			System.out.println("\nTime Elapsed Selection Sort Nanoseconds: " +myStopwatch3.getElapsedTimeNano());
			myStopwatch3.reset();
			break;
		case 4:
			int[] iArray = Sorter.doTempArray(myArray);
			Stopwatch myStopwatch4 = new Stopwatch();
			myStopwatch4.start();
			myStopwatch4.startNano();
			doInsertionSort(iArray);
			myStopwatch4.stop();
			myStopwatch4.stopNano();
			System.out.println("\nTime Elapsed Insertion Sort Milliseconds: " +myStopwatch4.getElapsedTime());
			System.out.println("\nTime Elapsed Insertion Sort Nanoseconds: " +myStopwatch4.getElapsedTimeNano());
			myStopwatch4.reset();
			break;
		case 0:
			System.out.println("You have chosen quit...");
			break;

		default:
			System.out.println("Invalid option Please choose 1, 2, 3 or 0");

		} // End of switch
		
	}while(opt2!=0);//end of do while
		}while(opt1!=0);
	}
}
