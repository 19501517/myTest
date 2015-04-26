package heapSort;

public class HeapSort {

	private int[] heap;

	public HeapSort(int[] heap) {
		this.heap = heap;
	}

	private void heapAdjust(int begin, int end) {

		int temp = heap[begin];

		for (int i = begin * 2 + 1; i <= end; i = i * 2 + 1) {

			if (i < end && heap[i] > heap[i + 1]) {
				++i;
			}

			if (temp > heap[i]) {
				heap[begin] = heap[i];
				begin = i;
			} else {
				break;
			}
		}

		heap[begin] = temp;
	}

	public int[] sort() {

		for (int i = (heap.length - 1) / 2; i >= 0; --i) {
			heapAdjust(i, heap.length - 1);
		}

		for (int j = heap.length - 1; j > 0; --j) {
			int temp = heap[0];
			heap[0] = heap[j];
			heap[j] = temp;

			heapAdjust(0, j - 1);
		}

		return heap;
	}
}
