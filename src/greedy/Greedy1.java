package greedy;

public class Greedy1 {
	public int solution(int pay) {
		int[] coins = { 500, 100, 50, 10 };
		int count = 0;
		
		for (int coin : coins) {
			count = count + pay / coin;
			pay = pay % coin;
		}
		
		return count;
	}
}
