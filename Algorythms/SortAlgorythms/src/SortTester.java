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

		System.out.println("Please Select the Structure of Data in Array");
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
			doRandomArray(myArray);
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
			int[] tempArray = new int[elements];
			tempArray=myArray;
			doBubbleSort(tempArray);
			
			break;
		case 2:
			doEnhancedBubbleSort(myArray);
			break;
		case 3:
	        doSelectionSort(myArray);
			break;
		case 4:
			doInsertionSort(myArray);
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
