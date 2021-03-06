package p01.references;
/**
 * 배열의 복사
 * - 길이가 서로 다른 복수개의 배열(단, 타입이 동일해야함.)을 서로 이어서 새로운 길이의 배열을 만들 때 사용
 *   ex) a[3], b[4] => 타입 newArray = new 타입[a.length + b.length]
 * - 배열은 한 번 선언되면 길이가 고정되어서 늘일 수 없기 때문에 새로운 배열을 만들어서 기존 배열의 값을 복사하여 사용함.
 * */
public class ArrayCopyExample2 {
	public static void main(String[] args) {
		String[] cities = {"서울", "대구", "춘천", "울산", "광주", "천안"};
		String[] nations = {"대한민국", "미국", "영국", "일본", "프랑스"};
		System.out.println("cities[]의 길이 : " + cities.length);
		System.out.println("nations[] 의 길이 : " + nations.length);
		
		String[] newStr = new String[cities.length + nations.length];
		System.out.println("newStr[]의 길이 : " + newStr.length);
		
		//for문을 이용한 복사
		for (int i = 0; i < cities.length; i++) {
			newStr[i] = cities[i];
		}
		for (String i : newStr) {
			System.out.print(i + "\t");
		}
		System.out.println();
		for (int i = 0; i < nations.length; i++) {
			newStr[cities.length + i] = nations[i];
		}
		for (String i : newStr) {
			System.out.print(i + "\t");
		}
		System.out.println();
		
		System.arraycopy(cities, 0, newStr, 0, cities.length);
		System.arraycopy(nations, 0, newStr, cities.length, nations.length);
		for (String i : newStr) {
			System.out.print(i + "\t");			
		}
	}
}
