public class SelectionSort {
	public static void sort(int[] array) {
		int minIndex = 0;

		for (int i = 0; i < array.length; i++) {
			minIndex = LinearSearch.minIndex(array, i, array.length);
			if (minIndex != i) {
				swap(array, i, minIndex);
			}
		}
	}

	private static void swap(int[] array, int index1, int index2) {
		int firstValue = array[index1];
		array[index1] = array[index2];
		array[index2] = firstValue;
	}
}