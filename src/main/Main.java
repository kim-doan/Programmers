package main;

import greedy.Greedy1;
import greedy.Greedy2;
import greedy.Greedy3;
import hash.Hash1;
import hash.Hash2;
import hash.Hash3;

public class Main {
	
	/**
	 * 완주하지 못한 선수
	 */
	private static void hash1Start() {
		String[] participant = { "leo", "kiki", "eden" };
		String[] complection = { "eden", "kiki" };
		
		Hash1 hash1 = new Hash1();
		
		String result = hash1.solution(participant, complection);
		
		System.out.println(result);
	}
	
	/**
	 * 전화번호부 목록
	 */
	private static void hash2Start() {
		String[] phone_book = { "12","123","1235","567","88" };
		
		Hash2 hash2 = new Hash2();
		
		boolean result = hash2.solution(phone_book);
		
		System.out.println(result);
	}
	
	/**
	 * 위장
	 */
	private static void hash3Start() {
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
		Hash3 hash3 = new Hash3();
		
		int result = hash3.solution(clothes);
		
		System.out.println(result);
	}
	
	/**
	 * 최소 거스름돈
	 */
	private static void greedy1Start() {
		int pay = 1260;
		
		Greedy1 greedy1 = new Greedy1();
		
		int result = greedy1.solution(pay);
		
		System.out.println(result);
	}
	
	/**
	 * 큰 수의 법칙
	 */
	private static void greedy2Start() {
		int[] array = {3, 4, 3, 4, 3};
		int m = 7;
		int k = 2;
		
		Greedy2 greedy2 = new Greedy2();
		
		int result = greedy2.solution(array, m, k);
		
		System.out.println(result);
	}
	
	/**
	 * 1이 될 때까지
	 */
	private static void greedy3Start() {
		int n = 25;
		int k = 3;
		
		Greedy3 greedy3 = new Greedy3();
		
		int result = greedy3.solution(n, k);
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
//		hash1Start();
//		hash2Start();
//		hash3Start();
//		greedy1Start();
//		greedy2Start();
		greedy3Start();
	}
}
