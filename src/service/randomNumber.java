package service;

import java.util.Random;

//�����������

public class randomNumber {
	
	private static int result;
	
	public void getRandom(){
		Random r = new Random((long) Math.random());
		result = r.nextInt();
	}
	
	public int getResult(){
		return result;
	}
	
}
