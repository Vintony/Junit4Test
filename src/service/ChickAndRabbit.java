package service;
//ผฆอรอฌมý

public class ChickAndRabbit {

	private int rabbit;
	
	private int chick;

	public void cal(int head,int feet){
		int x,y;
		y = (feet - 2 * head) / 2;
		x = head - y;
		rabbit = y;
		chick = x;
	}
	
	public int getRabbit(){
		return rabbit;
	}
	
	public int getChick(){
		return chick;
	}
	
}
