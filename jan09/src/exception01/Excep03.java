package exception01;

public class Excep03 {

	public static void main(String[] args) {
		int[] arr = { 10, 20, 30, 40, 50, 60, 70, 80, 90 };
		try{
			System.out.println(arr[10]);
		}catch (Exception e) {
			System.out.println("배열 길이 밖으로 나가요.");
		}
		
		try {
			System.out.println(arr[8]/0);
		}catch(ArithmeticException e) {
			System.out.println("Divide by Zero");
		}
		System.out.println("프로그램 종료");
		
		//트랜젝션 : 묶음. 여러 명령을 하나로 묶어서 처리
		//5개의 명령이 있을때 4개만 성공하면 실패
		
		/*
		 * 상품발송(){
		 * 	try{
		 * 		포장();
		 * 		영수증 발행();
		 * 		송장 출력();
		 * 		발송(); 		
		 * 	}catch(){
		 * 		모두취소();
		 * 	}
		 * }
		 * 
		 * 포장() throw 예외{
		 * 		포장명령어;
		 * }
		 */
		
	}

}
