package service;
//¼ÆËãÀÛ¼Ó

public class autoAdd {
	
	private int result=0;
	
	public void cal(int number){
		for(int i = number;i>0;i--){
			result += i;
		}
	}
	
	public int getResult(){
		return result;
	}
	
}
