package p01.standard;

public class Member extends Object {
	public String id;
	
	public Member(String id) {
		super();
		this.id = id;
	}



	@Override
	public boolean equals(Object obj) {
		// 동일한 객체인지 확인
		if (obj instanceof Member) {
			Member member = (Member)obj;
			if (id.equals(member.id)) // 객체의 필드값도 동일한지 체크
				return true; // 비교대상이 동일한 객체라고 봄(논리적 동등)
		}
		return false; // 동일한 타입이 아니면 다른 객체로 봄
	}
}
