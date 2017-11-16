package p03.linkedList;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		List<String> list1 = new ArrayList<>();
		List<String> list2 = new LinkedList<>();
		
		long startTime;
		long endTime;
		startTime = System.nanoTime(); // time-stamp
		for (int i = 0; i < 10000; i++) {
			list1.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("ArrayList 걸린시간 : " + (endTime - startTime) + "ns");
		
		startTime = System.nanoTime(); // time-stamp
		for (int i = 0; i < 10000; i++) {
			list2.add(0, String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("LindedList 걸린시간 : " + (endTime - startTime) + "ns"); // 0번째 index에 add할 경우 - LinkedList가 빠름
																					 // 마지막 index에 add할 경우 - ArrayList가 빠름
	}
}
