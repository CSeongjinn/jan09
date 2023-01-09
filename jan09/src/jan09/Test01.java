package jan09;

import java.util.Arrays;

public class Test01 {
	public static void main(String[] args) {
		String code = ".... .  ... .-.. . . .--. ...  . .- .-. .-.. -.--";
		String[] morse = {".-","-...","-.-.","-..",".","..-.","--.",
				"....","..",".---","-.-",".-..","--","-.","---",".--.",
				"--.-",".-.","...","-","..-","...-",".--","-..-","-.--","--.."};
		StringBuffer sb = new StringBuffer();
		String[] re = code.split("  "); //공백 기준으로
		
		for(int i=0;i<re.length;i++) {
			String[] sp = re[i].split(" ");
			for(int k=0;k<sp.length;k++) {
				for(int j=0;j<morse.length;j++) {
					if(sp[k].equals(morse[j])) {
						sb.append((char)(j+65));
					}
				}
			}sb.append(" ");
		}
		System.out.println(sb);
	}
}
