package Process;

import java.util.Random;

public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int Max=90;
		int Min=20;
		Random rand = new Random();
		
			for(int i=0;i<1000;i++) {
			
				System.out.println(20+(int) rand.nextInt(Max - Min + 1));
			}
	}

}
