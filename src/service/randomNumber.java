package service;

import java.util.Random;

//随机数生成器

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
