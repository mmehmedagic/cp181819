// By: Mirza Mehmedagic
public class ArrayExample {
	public static void main(String[] args) {
		// Array initialization and value assignment for first two bullet points of assignment
		int[] array = new int[20];
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.random() * 101);
		}
		printArray(array);
		System.out.println(arraySum(array));
		System.out.println(arrayAverage(array));
	}
	
	// printArray method for last two bullet points of assignment
	public static void printArray(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	
	public static int arraySum(int[] arr) {
		int sum = 0;
		for (int i = 0; i < arr.length; i++) {
			sum += arr[i];
		}
		return sum;
	}
	
	public static double arrayAverage(int[] arr) {
		return arraySum(arr) / arr.length;
	}
}