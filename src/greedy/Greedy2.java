package greedy;

import java.util.Arrays;
import java.util.Collections;
import java.lang.Integer;

public class Greedy2 {
	public int solution(int[] array, int m, int k) {
		int result = 0;
		Integer[] integerArray = Arrays.stream(array).boxed().toArray(Integer[]::new);
		
		Arrays.sort(integerArray, Collections.reverseOrder());
		
		int count = 0;
		for(int i=0;i<m;i++) {
			if(count < k) {
				result += integerArray[0];
				count++;
			} else {
				result += integerArray[1];
				count = 0;
			}
		}
		return result;
	}
}
