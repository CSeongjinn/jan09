package com.poseidon.jini;
//module-info.java를 삭제해야 작동함
import java.util.Scanner;

public class JiniMaker {
	//jar연동
	public static void main(String[] args) {
		JINI jini = new JINI();
		Scanner sc = new Scanner(System.in);
		System.out.println("명령을 입력하세요"
				+ "안녕,날짜,이름,시간,나가기");
		System.out.print("명령: ");
		
		while(jini.isQute) {
			 String user = sc.next();
			 jini.scheck(user);
		}
	}
}
