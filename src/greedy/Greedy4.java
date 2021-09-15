package greedy;

import java.util.Arrays;

public class Greedy4 {
	
    public int solution(int n, int[] lost, int[] reserve) {
        int answer = n - lost.length;
        
        for(int i=0;i<reserve.length;i++) {
        	for(int j=0;j<lost.length;j++) {
        		if(reserve[i] == lost[j]) {
        			reserve[i] = -1;
        			lost[j] = -1;
        		}
        	}
        }
        
        Arrays.sort(lost);
        Arrays.sort(reserve);
        
        int start = 0;
        
        for(int i=0;i<reserve.length;i++) {
        	if(reserve[i] == -1) {
        		answer++;
        		continue;
        	}
        	int before = reserve[i] - 1;
        	int after = reserve[i] + 1;
        	
        	for(int j=start;j<lost.length;j++) {
        		if(lost[j] == -1) {
        			start++;
        			continue;
        		}
        		if(lost[j] == before || lost[j] == after) {
        			start++;
        			answer++;
        			break;
        		}
        	}
        }
        
        return answer;
    }
}
