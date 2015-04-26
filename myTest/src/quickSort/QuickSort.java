package quickSort;

public class QuickSort {

	private static int partition(int[] array,int begin, int end) {
		// int key = array[begin];

		int center = (begin + end) / 2;
		int key = array[center];
		array[center] = array[begin];

		while (begin < end) {
			while (begin < end && array[end] >= key) {
				--end;
			}
			array[begin] = array[end];

			while (begin < end && array[begin] <= key) {
				++begin;
			}
			array[end] = array[begin];
		}

		array[begin] = key;

		return begin;
	}

	public static void sort(int[] array, int begin, int end) {

		if (begin < end) {
			int keyLoc = partition(array, begin, end);

			sort(array, begin, keyLoc - 1);
			sort(array, keyLoc + 1, end);
		}
	}
}
