import java.util.Arrays;

public class 배열정렬하기 {
	public static void main(String[] args) {
		int[] org = {4, 2, 3, 1, 5};
		int[] sorted = solution(org);
		System.out.println(Arrays.toString(org));
		System.out.println(Arrays.toString(sorted));
	}

	private static int[] solution(int[] arr) {
		int[] clone = arr;
		Arrays.sort(clone);
		return clone;
	}

}
