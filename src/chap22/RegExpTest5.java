package chap22;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class RegExpTest5 {
	public static void main(String[] args) {
		Pattern p = Pattern.compile(" ");
		Matcher m = p.matcher("My Java Application Java Program");
		
		while (m.find()) {
			System.out.println("Java 발견위치: " + m.start());
		}
		
		String str1 = m.replaceAll("\t");
		System.out.println(str1);
	}
	
}
