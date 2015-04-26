package kmp;

public class GetNextArray {

	public static int[] getNext(String pattern) {
		int j = 0;
		int k = -1;
		int[] next = new int[pattern.length()];
		next[0] = -1;

		while (j < pattern.length() - 1) {
			if (k == -1 || pattern.charAt(j) == pattern.charAt(k)) {
				j++;
				k++;
				next[j] = k;
			} else {
				k = next[k];
			}
		}

		return next;
	}
	
	public static int[] getUpgradeNext(String pattern) {
		int j = 0;
		int k = -1;
		int[] next = new int[pattern.length()];
		next[0] = -1;

		while (j < pattern.length() - 1) {
			if (k == -1 || pattern.charAt(j) == pattern.charAt(k)) {
				j++;
				k++;
				if(pattern.charAt(j)==pattern.charAt(k))
					next[j] = k;
				else
					next[j] = next[k];
			} else {
				k = next[k];
			}
		}

		return next;
	}

}
