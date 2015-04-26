package heapSort;

public class MainTest {

	public static void main(String[] args) {
		int[] i = new int[]{49,38,65,97,76,13,27,49};
		
		HeapSort hs = new HeapSort(i);
		
		int[] j = hs.sort();
		
		for (int n : j ) {
			System.out.print(n + "\t");
		}
	}
}
