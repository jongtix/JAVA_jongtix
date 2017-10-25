package wrapup;

public class Person {
	private String name;
	private int score;
	
	public Person(String nameOfC, int scoreOfC) {
		name = nameOfC;
		score = scoreOfC;
	}
	
//	public void setName(String name) {
//		this.name = name;
//	}
//
//	public String getName() {
//		return this.name;
//	}
//
//	public void setScore(int score) {
//		this.score = score;
//	}
//	
//	public int getScore() {
//		return score;
//	}

	@Override
	public String toString() {
		return "\n이름:" + this.name + " 점수:" + this.score;
	}
	
	
}
