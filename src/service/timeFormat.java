package service;

import java.text.SimpleDateFormat;
import java.util.Date;

//时间格式化

public class timeFormat {
	
	private static String result;
	
	public void format(){ 
			Date date = new Date();
	        String strDateFormat = "yyyy-MM-dd HH:mm:ss";
	        SimpleDateFormat sdf = new SimpleDateFormat(strDateFormat);
	        result = sdf.format(date);
	}
	
	public String getResult(){
		return result;
	}
}
