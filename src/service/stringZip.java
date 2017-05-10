package service;
//×Ö·û´®Ñ¹ËõËã·¨

public class stringZip {
	
	private String str;
	private String result="";
	private int size;
	
	public void zip(String string)
	{
		str = string;
		check(str);
		if (size > str.length()) {
			result = str;
		}else{
			int count =1;
			char current= str.charAt(0);
			for(int i=1;i<str.length();i++)
			{
				if (str.charAt(i)==current) 
				{
					count+=1;
				}else
				{
					result += current;
					result += count;
					count = 1;
					current = str.charAt(i);
				}
			}
			result += current;
			result += count;
		}
	}
	
	public boolean check(String string)
	{
		if(string.length()>100){
			return false;
		}else{
			size = 2;
			char current = string.charAt(0);
			int count =1;
			for(int i=1;i<string.length();i++)
			{
				if(string.charAt(i)!=current){
					size += 2;
					current = string.charAt(i);
					count = 1;
				}
				if(string.charAt(i)==current){
					count+=1;
					if(count>=10){
						size += 1;
					}
				}
			}
			return true;
		}
	}
	
	public String getResult(){
		return result;
	}
}

