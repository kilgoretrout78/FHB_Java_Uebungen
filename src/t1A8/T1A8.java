package t1A8;

import java.util.Random;

public class T1A8 {

	public static void main(String[] args) {
		Random random = new Random();
		int[] lotto = new int[7];
		
		for(int i = 0; i < lotto.length; i++) {
			lotto[i] = random.nextInt(45) + 1;
			for(int j = 0; j < i; j++) {
				if(lotto[i] == lotto[j]) {
					i--;
					break;
				}
			}
		}
		for(int eineZahl : lotto) {
			System.out.println(eineZahl);
		}
	}

}
