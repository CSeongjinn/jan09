package coll;

import java.util.LinkedList;
import java.util.Queue;

//p770
//카톡
class Message{
	public String command;
	public String to;
	public Message(String command, String to) {
		this.command = command;
		this.to = to;
	}
}
public class Queue01 {
	public static void main(String[] args) {
		Queue<Message> messagesQueue = new LinkedList<Message>();
		messagesQueue.offer(new Message("sendMail","홍길동"));
		messagesQueue.offer(new Message("sendSMS","신용권"));
		messagesQueue.offer(new Message("sendKakaotalk","홍두깨"));
		
		while(!messagesQueue.isEmpty()) {
			Message message = messagesQueue.poll();
			switch(message.command) {
			case "sendMail":
				System.out.println(message.to+"에게 메일을 보냅니다");
				break;
			case "sendSMS":
				System.out.println(message.to+"에게 문자를 보냅니다");
				break;
			case "sendKakaotalk":
				System.out.println(message.to+"에게 카카오톡을 보냅니다");
				break;
			default:
				break;
			}
		}
	}
}
