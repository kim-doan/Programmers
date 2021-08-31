package hash;

import java.util.HashMap;

public class Hash3 {
    public int solution(String[][] clothes) {
        int answer = 0;
        
        HashMap<String, String> map = new HashMap<>();
        
        for(int i=0;i<clothes.length;i++) {
        	for(int j=0;j<clothes[i].length;j++) {
        		System.out.println(clothes[i][j]);
        	}
        }
        
        return answer;
    }
}
