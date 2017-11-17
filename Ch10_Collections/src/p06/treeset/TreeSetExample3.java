package p06.treeset;

import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample3 {
	public static void main(String[] args) {
		TreeSet<String> treeSet = new TreeSet<>();
		treeSet.add("a");
		treeSet.add("f");
		treeSet.add("d");
		treeSet.add("e");
		treeSet.add("z");
		treeSet.add("b");
		treeSet.add("g");
		treeSet.add("c");
		
		System.out.println("[c ~ f]사이의 단어 검색");
		NavigableSet<String> rangeSet;
		rangeSet = treeSet.subSet("c", true, "f", true); // TreeSet에 저장된 객체들 중 일부 추출 메소드
														 // (시작, true/false, 끝, true/false)
														 // true - 범위 포함(기본), false - 범위 제외
														 // 주의) 사전식
		for (String word : rangeSet) {
			System.out.println(word);
		}
	}
}
