public class BubbleSort {
	
	public static <E> E[] sort(E[] array) {
		// swap(array, 0, 0);
		return array;
	}

	public static int[] sort(int[] array) {
		int length = array.length;
		for (int j = 0; j < array.length; j++) {
			System.out.println("j = " + j);
			for (int i = 0; i < length - 1; i++) {
				System.out.println("i = " + i);
				if (array[i] > array[i + 1]) {
					System.out.println("Swap");
					swap(array, i, i + 1);
				}
				length--;
			}
		}
		return array;
	}

	private static void swap(int[] mArray, int index1, int index2) {
		int firstValue = mArray[index1];
		mArray[index1] = mArray[index2];
		mArray[index2] = firstValue;
	}
}