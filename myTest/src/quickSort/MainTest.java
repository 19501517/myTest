package quickSort;

public class MainTest {

	public static void main(String[] args) {
		int[] i = new int[]{4,1,3,2};
		
		QuickSort qs = new QuickSort();
		
		qs.sort(i, 0, i.length - 1);
		
		for(int n : i) {
			System.out.print(n + "\t");
		}
		System.out.println();
	}
}
