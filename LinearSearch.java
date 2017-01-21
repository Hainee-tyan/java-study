public class LinearSearch {

	public static int minIndex(int[] array, int start, int end) {
		check(array, start, end);

		int minIndex = start;
		int minValue = array[start];

		for (int i = start + 1; i < end; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
				minIndex = i;
			}
		}

		return minIndex;
	}

	public static int minIndex(int[] array) {
		return minIndex(array, 0, array.length);
	}

	public static int minValue(int[] array, int start, int end) {
		check(array, start, end);

		int minValue = array[start];
		for (int i = start + 1; i < end; i++) {
			if (array[i] < minValue) {
				minValue = array[i];
			}
		}

		return minValue;
	}

	public static int minValue(int[] array) {
		return minValue(array, 0, array.length);
	}

	public static int maxIndex(int[] array, int start, int end) {
		check(array, start, end);

		int maxIndex = start;
		int maxValue = array[start];
		for (int i = start + 1; i < end; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
				maxIndex = i;
			}
		}

		return maxIndex;
	}

	public static int maxIndex(int[] array) {
		return maxIndex(array, 0, array.length);
	}

	public static int maxValue(int[] array, int start, int end) {
		check(array, start, end);

		int maxValue = array[start];
		for (int i = start + 1; i < end; i++) {
			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}

	public static int maxValue(int[] array) {
		return maxValue(array, 0, array.length);
	}

	public static int searchValueIndex(int[] array, int searchValue, int start, int end) {
		check(array, start, end);

		for (int i = start; i < end; i++) {
			if (array[i] == searchValue) {
				return i;
			}
		}
		return -1;
	}

	public static int searchValueIndex(int[] array, int searchValue) {
		return searchValueIndex(array, searchValue, 0, array.length);
	}

	private static void checkIndices(int[] array, int start, int end) throws Exception {
		if (start < 0 ||
			start > end ||
			end > array.length) {
			throw new Exception("Indices are wrong!");
		}
	}

	private static void check(int[] array, int start, int end) {
		try {
			checkIndices(array, start, end);
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
}