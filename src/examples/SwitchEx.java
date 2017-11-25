package examples;

public class SwitchEx {
	public static void main(String[] args) {
		int month = 2;
		switch (month) {
		case 1:
			System.out.println("1월은 춥다.");
			break;
		case 2:
			System.out.println("2월도 춥다.");
			break;
		case 3:
			System.out.println("3월은 따뜻하다.");
			break;
			
		default:
			break;
		}
		
		String str = "sdf";
		switch (str) {
		case "sadf":
			System.out.println("1, 2");
			break;
		case "sdf":
			System.out.println("a;lsdkjf");
			break;

		default:
			break;
		}
	}
}
