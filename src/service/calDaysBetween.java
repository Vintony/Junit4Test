package service;
//查看日期之间相隔的天数

import java.util.Calendar;
import java.util.Date;

public class calDaysBetween {
	
	private static int result;
	
	public void daysBetween(Date date1,Date date2)  
    {  
        Calendar cal = Calendar.getInstance();  
        cal.setTime(date1);  
        long time1 = cal.getTimeInMillis();               
        cal.setTime(date2);  
        long time2 = cal.getTimeInMillis();       
        long between_days=(time2-time1)/(1000*3600*24);  
        result=Integer.parseInt(String.valueOf(between_days));         
    }
	
	public int getResult(){
		return result;
	}
}
