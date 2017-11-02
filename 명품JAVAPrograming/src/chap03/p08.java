package chap03;

import java.util.Scanner;

public class p08 {
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print("정수 몇 개?");
		int i = 0;
		boolean isTrue = true;
		int temp = 0;
		int num = s.nextInt();
		int[] number = new int[num];
		while (isTrue) {
			int newNum = (int) (Math.random() * 100 + 1);
			for (int j = 0; j <= i; j++) {
				if (number[j] != newNum) {
					number[i] = newNum;
				} else {
					newNum = (int) (Math.random() * 100 + 1);
					continue;
				}
			}
			i++;
			if (i == num) {
				isTrue = false;
			}
		}
		
		for (int j = 0; j < number.length; j++) {
			for (int k = 0; k < number.length; k++) {
				if (number[j] < number[k]) {
					temp = number[j];
					number[j] = number[k];
					number[k] = temp;
				}
			}
		}
		for (int j = 0; j < number.length; j++) {
			System.out.println("number[" + j + "] : " + number[j] + " ");
		}
	}
}
