package main;

import greedy.Greedy1;
import greedy.Greedy2;
import greedy.Greedy3;
import greedy.Greedy4;
import hash.Hash1;
import hash.Hash2;
import hash.Hash3;
import impl.Impl1;
import impl.Impl2;
import impl.Impl3;

public class Main {
	
	/**
	 * �������� ���� ����
	 */
	private static void hash1Start() {
		String[] participant = { "leo", "kiki", "eden" };
		String[] complection = { "eden", "kiki" };
		
		Hash1 hash1 = new Hash1();
		
		String result = hash1.solution(participant, complection);
		
		System.out.println(result);
	}
	
	/**
	 * ��ȭ��ȣ�� ���
	 */
	private static void hash2Start() {
		String[] phone_book = { "12","123","1235","567","88" };
		
		Hash2 hash2 = new Hash2();
		
		boolean result = hash2.solution(phone_book);
		
		System.out.println(result);
	}
	
	/**
	 * ����
	 */
	private static void hash3Start() {
		String[][] clothes = {{"yellowhat", "headgear"}, {"bluesunglasses", "eyewear"}, {"green_turban", "headgear"}};
		
		Hash3 hash3 = new Hash3();
		
		int result = hash3.solution(clothes);
		
		System.out.println(result);
	}
	
	/**
	 * �ּ� �Ž�����
	 */
	private static void greedy1Start() {
		int pay = 1260;
		
		Greedy1 greedy1 = new Greedy1();
		
		int result = greedy1.solution(pay);
		
		System.out.println(result);
	}
	
	/**
	 * ū ���� ��Ģ
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
	 * 1�� �� ������
	 */
	private static void greedy3Start() {
		int n = 25;
		int k = 3;
		
		Greedy3 greedy3 = new Greedy3();
		
		int result = greedy3.solution(n, k);
		
		System.out.println(result);
	}
	
	/**
	 * ü????
	 */
	private static void greedy4Start() {
		int n = 5;
		int[] lost = {5, 4, 2};
		int[] reserve = {2, 4};
		
		Greedy4 greedy4 = new Greedy4();
		
		int result = greedy4.solution(n, lost, reserve);
		
		System.out.println(result);
	}
	
	/**
	 * ?????¿?
	 */
	private static void impl1Start() {
		int n = 5;
		String[] plan = {"R", "R", "R", "U", "D", "D"};
		
		Impl1 impl1 = new Impl1();
		
		String result = impl1.solution(n, plan);
		
		System.out.println(result);
	}
	
	/**
	 * ?ð?
	 */
	private static void impl2Start() {
		int n = 5;
		
		Impl2 impl2 = new Impl2();
		
		int result = impl2.solution(n);
		
		System.out.println(result);
	}
	
	/**
	 * ?ս??? ????Ʈ
	 */
	private static void impl3Start() {
		String n = "c1";
		
		Impl3 impl3 = new Impl3();
		
		int result = impl3.solution(n);
		
		System.out.println(result);
	}
	
	public static void main(String[] args) {
//		hash1Start();
//		hash2Start();
//		hash3Start();
//		greedy1Start();
//		greedy2Start();
//		greedy3Start();
//		greedy4Start();
//		impl1Start();
//		impl2Start();
		impl3Start();
	}
}
