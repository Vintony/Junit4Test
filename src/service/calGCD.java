package service;
//计算最大公约数

public class calGCD {
	
	private static int result;
	
	public void calG(int a,int b){
		while(a!=b){
			if(a>b){
				a=a-b;
			}else{
				b=b-a;
			}
		}
		result = a;
	}
	
	public int getResult(){
		return result;
	}
}
