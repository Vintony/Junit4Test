package service;
//¼ÆËã×éºÏ

public class calCombination {
	
	private int result;

	public void cal(int n,int m){
		int temp1=1;
		int temp2=1;
		int temp3=1;
		for(int i=n;i>0;i--){
			temp1 *= i;
		}
		for(int i=m;i>0;i--){
			temp2 *= i;
		}
		for(int i=(n-m);i>0;i--){
			temp3 *= i;
		}
		result = temp1 / (temp2*temp3);
	}
	
	public int getResult(){
		return result;
	}
	
}
