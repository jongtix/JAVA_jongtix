package p09.polymorph;
/**
 * Interface 없는 상태
 * G1, G2 바뀌면 Inter4도 바뀜.
 * 현재 소스파일 Inter4는 G1과 G2의 내용이 바뀌면 내용도 달라짐.
 * G1, G2 대신 G3가오게되면 새로운 G3 객체를 만들어서 추가해야하는 변화가 생김.
 * - Inter4는 G1, G2에 종속적인 상태
 * */
public class Inter4 {
	public static void main(String[] args) {
		G1 g1 = new G1();
		G2 g2 = new G2();
		g1.play();
		g2.play();
	}
}

class G1 {
	void play() {
		System.out.println("A play");
	}
}

class G2 {
	void play() {
		System.out.println("B play");
	}
}