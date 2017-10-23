package referenceType;

public class FieldEx {
	//fields (instance variables)
	public int i; // 초기값은 0 or false;
	public float f;
	public String str; // 참조형 데이터 타입의 초기값은 null;
	
	//static variables (class variable)
	public static int num = 10;
	
	public static void main(String[] args) {
		FieldEx fieldEx = new FieldEx();
		System.out.println(fieldEx.i);
		System.out.println(fieldEx.f);
		System.out.println(fieldEx.str);
		
		FieldEx fieldEx2 = new FieldEx();
		System.out.println(fieldEx2.i);
		System.out.println(fieldEx2.f);
		System.out.println(fieldEx2.str);
		
		fieldEx2.i = 5;
		
		System.out.println(fieldEx.i);
		System.out.println(fieldEx2.i);
		
		System.out.println(fieldEx.num);
		System.out.println(fieldEx2.num);
		
		fieldEx2.num = 20;
		
		System.out.println(fieldEx.num);
		System.out.println(fieldEx2.num);
		
		FieldEx.num = 30;
		
		System.out.println(fieldEx.num);
		System.out.println(fieldEx2.num);
	}
}
