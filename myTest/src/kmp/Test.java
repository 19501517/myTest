package kmp;

public class Test {

	public static void main(String[] args) {
		String target = "abdabcabbabcabc";
		String pattern = "abcabc";
		
		int pos = KmpMethod.indexOf(target, pattern, 0);
		
		System.out.println(pos);
	}
}
