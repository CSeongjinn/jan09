package inner;
/*
 * 지역 클래스
 * 메소드 안에 클래스를 선언합니다
 * 메소드 안에서만 지역변수처럼 클래스를 사용합니다
 * 메소드의 실행이 끝나면 지역 클래스는 제거됩니다
 * 
 * 메소드 내부에서만 사용할 수 있습니다
 * 외부에서 인스턴스를 생성할 수 없습니다
 * 또한 static을 사용할 수 없습니다
 * 인스턴스 변수 또는 메소드는 사용할 수 있습니다
 * 
 * final붙은 지역변수(상수)나 매개변수는 지역 클래스의
 * 메소드에서 접근할 수 있습니다
 * 지역 클래스는 상속할 수 없습니다
 * 
 * 객체를 생성해서 사용해야 합니다
 * 컴파일하면 외부클래스$숫자+로컬클래스명.class로 생성됩니다
 * 숫자는 서로 다른 메소드인 경우에 같은 이름의 클래스가
 * 먼저 존재할 수 있기 때문에 구분하기 위해 붙여준다
 */
public class LocalClass {
	void method() {
		class LocalInner{
			void innerMethod() {
				System.out.println("메소드 속에서 동작합니다");
			}
		}
		//지역클래스가 선언된 메소드 안에서 객체 생성
		LocalInner li = new LocalInner();
		li.innerMethod();//객체.메소드명 호출
	}
	public static void main(String[] args) {
		LocalClass ls = new LocalClass();
		ls.method();
	}
}
