package kmp;

public class KmpMethod {

	public static int indexOf(String target, String pattern, int begin) {

		int count = 0;

		if (target != null && pattern != null && pattern.length() > 0
				&& target.length() >= pattern.length()) {
			int i = begin;
			int j = 0;
//			int next[] = Next.getNext(pattern);
			int next[] = GetNextArray.getUpgradeNext(pattern);

			while (i < target.length()) {
				if (j == -1 || target.charAt(i) == pattern.charAt(j)) {
					i++;
					j++;
				} else {
					j = next[j];
				}

				count++;

				if (j == pattern.length()) {
					System.out.println(count);
					return i - j;
				}
			}
		}

		System.out.println(count);
		return -1;
	}

}
