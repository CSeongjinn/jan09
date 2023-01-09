package jan09;

import java.util.Arrays;
import java.util.Scanner;

public class Morse {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String user = null;
		char[] ch = null;
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.",
				"....","..",".---","-.-",".-..","--","-.","---",".--.",
				"--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		
		System.out.println("문장을 입력하세요");
		System.out.print("입력 : ");
		
		user = sc.nextLine();
		System.out.println(user);
		
		user = user.toUpperCase();//대문자로 변환
		ch = user.toCharArray();
//		System.out.println(Arrays.toString(ch));
		
		for(int i=0;i<ch.length;i++) {
			if(ch[i]!=' ') {
				System.out.print(morse[ch[i]-65]);
			}
			if(i!=ch.length-1)System.out.print(" ");
		}
		sc.close();
	}
}
