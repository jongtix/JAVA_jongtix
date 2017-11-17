package p06.treeset;

import java.util.TreeSet;

/**
 * TreeSet - binary tree 구조 형태로 객체를 저장하는 자료구조
 * 		   - 저장시 순서 정해짐.(기본 : 오름차순)
 * */
public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		
		scores.add(new Integer(87));
		scores.add(98);
		scores.add(new Integer(75));
		scores.add(new Integer(95));
		scores.add(80);
		
		Integer score = null;
		score = scores.first();
		System.out.println("가장 낮은 점수 : " + score);
		score = scores.last();
		System.out.println("가장 높은 점수 : " + score);
		score = scores.lower(95);
		System.out.println("95점 아래 점수 : " + score);
		score = scores.higher(95);
		System.out.println("95점 위의 점수 : " + score);
		score = scores.floor(new Integer(95));
		System.out.println("95점이거나 바로 아래 점수 : " + score);
		score = scores.ceiling(new Integer(85));
		System.out.println("85점이거나 바로 위 점수 : " + score);
		
		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수 : " + scores.size() + ")");
		}
	}
}
