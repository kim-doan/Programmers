package greedy;

public class Greedy3 {
	public int solution(int n, int k) {
		int result = 0;
		
		while(true) {
			if(n == 1) break;
			
			if (n % k == 0) {
				n = n / k;
				result++;
			} else {
				n--;
				result++;
			}
		}
		
		return result;
	}
}
