package service;
//ÈòÄêÅĞ¶Ï

public class leapYear {
	
	private static boolean flag;
	
	public void isLeapYear(int year)
	{
		if((year%4==0&&year%100!=0)||year%400==0)
		{
			flag = true;
		}else{
			flag = false;
		}
	}
	
	public boolean getResult()
	{
		return flag;
	}
}
