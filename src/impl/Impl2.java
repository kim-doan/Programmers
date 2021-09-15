package impl;

public class Impl2 {
	public int solution(int n) {
		int answer = 0;
		
		int h = n;
		int m = 59;
		int d = 59;
		
		for (int k=0;k<=h;k++) {
			if((k + "").contains("3")) {
				answer += (60 * 60);
				continue;
			}
			for(int i=0;i<=m;i++) {
				if((i + "").contains("3")) {
					answer += 60;
					continue;
				}
				for(int j=0;j<=d;j++) {
					if((j + "").contains("3")) {
						answer++;
					}
				}
			}
		}
		
		return answer;
	}
}
