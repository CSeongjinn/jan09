package coll;

import java.util.Stack;

//p 768
//동전 클래스
/*
 * LIFO Last In First Out
 * FIFO First In First Out
 */

class Coin{
	private int value;
	public Coin(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
}
public class Stack02 {
	public static void main(String[] args) {
		Stack<Coin> coinBox = new Stack<Coin>();
		coinBox.push(new Coin(100));
		coinBox.push(new Coin(50));
		coinBox.push(new Coin(500));
		coinBox.push(new Coin(10));
		
		while(!coinBox.isEmpty()) {
			Coin coin = coinBox.pop();
			System.out.println("꺼낸동전:"+coin.getValue());
		}
	}
}
