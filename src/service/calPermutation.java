package service;
//¼ÆËãÅÅÁĞ

public class calPermutation {
	
	private int result;

	public void cal(int n,int r){
		int temp1=1;
		for(int i = n;i>0;i--){
			temp1 *= i;
		}
		int temp2=1;
		for(int i = (n-r);i>0;i--){
			temp2 *= i;
		}
		result = temp1 / temp2;
	}
	
	public int getResult(){
		return result;
	}
	
}
