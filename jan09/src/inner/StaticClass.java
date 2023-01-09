package inner;
/*
 * 정적 클래스 Static Class
 * class 앞에 Static이 붙은 것이 차이점
 * Static이 붙었기 때문에 객체 생성 없이 사용 가능
 * 클래스의 Static 변수처럼 사용된다
 * 외부 클래스와 내부 클래스는 다르게 동작
 * 외부 클래스와 내부 클래스의 멤버가 private이라도 접근 가능
 * 경로만 지정되면 단독으로 활용할 수 있다
 */

public class StaticClass {
	private static int outStatic = 55;
	
	public static class Inner{
		public static void innerMethod() {
			System.out.println(outStatic);
		}
		public void innerMethod2() {
			System.out.println(outStatic);
		}
	}
	public static void main(String[] args) {
		StaticClass.Inner.innerMethod();//static
		StaticClass.Inner in = new StaticClass.Inner();		
		in.innerMethod2();//non-static
		//p392
	}
}
