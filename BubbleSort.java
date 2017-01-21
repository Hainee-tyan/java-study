public class BubbleSort {
	
	public static <E> E[] sort(E[] array) {
		// swap(array, 0, 0);
		return array;
	}

	public static void sort(int[] array) {

		for (int j = array.length - 1; j > 0; j--) {
			for (int i = 0; i < j; i++) {
				if (array[i] > array[i + 1]) {
					swap(array, i, i + 1);
				}
			}
		}
	}

	private static void swap(int[] mArray, int index1, int index2) {
		int firstValue = mArray[index1];
		mArray[index1] = mArray[index2];
		mArray[index2] = firstValue;
	}

	private static void print(int[] array) {
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}
}