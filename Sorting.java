public class Sorting {
	public static void main(String[] args) {
		int[] array = new int[args.length];
		for (int i = 0; i < args.length; i++) {
			array[i] = Integer.parseInt(args[i]);
		}
		System.out.println("Array was parsed!");
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();

		SelectionSort.sort(array);

		System.out.print("Sorted array: ");
		for (int i : array)
			System.out.print(i + " ");
		System.out.println();
	}
}