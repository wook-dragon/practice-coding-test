import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class 두개뽑아서더하기 {
	public static void main(String[] args) {
		int[] arr = {2, 1, 3, 4, 1};
		System.out.println(Arrays.toString(solution(arr)));
	}

	private static int[] solution(int[] arr) {
		Set<Integer> intSet = new HashSet<>();
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				intSet.add(arr[i] + arr[j]);
			}
		}
		return intSet.stream().sorted().mapToInt(Integer::intValue).toArray();
	}
}
