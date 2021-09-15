package impl;

import java.nio.charset.StandardCharsets;

public class Impl3 {
	public int solution(String n) {
		int answer = 0;
		
		int pointX = n.substring(0, 1).getBytes(StandardCharsets.US_ASCII)[0] - 96;
		int pointY = Integer.parseInt(n.substring(1, 2));
		
		int[] dx = { 1, -1, 1, -1, 2, 2, -2, -2 };
		int[] dy = { 2, 2, -2, -2, 1, -1, 1, -1 };
		
		for(int i=0;i<8;i++) {
			if((pointX + dx[i] > 0 && pointX + dx[i] <= 8) && (pointY + dy[i] > 0 && pointY + dy[i] <= 8)) {
				 answer++;
			}
		}
		
		
		return answer;
	}
}
