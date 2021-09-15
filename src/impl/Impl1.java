package impl;

//String[] plan = {"R", "R", "R", "U", "D", "D"};
public class Impl1 {
	public String solution(int n, String[] plan) {
		String answer = "";
		
		String[] moveType = { "L", "R", "U", "D" };
		
		int x = 1;
		int y = 1;
		
		int[] dx = { -1, 1, 0, 0 };
		int[] dy = { 0, 0, -1, 1 };
		
		for (String key : plan) {
			int index = moveTypeIndex(key, moveType);
			
			if(x + dx[index] > 0) {
				x = x + dx[index];
			}
			
			if(y + dy[index] > 0) {
				y = y + dy[index];
			}
		}
		
		answer = y + " " + x;
		
		return answer;
	}
	
	private int moveTypeIndex(String key, String[] moveType) {
		int result = 0;
		
		for (int i=0;i<moveType.length;i++) {
			if(moveType[i].equals(key)) {
				result = i;
				break;
			}
		}
		
		return result;
	}
}
