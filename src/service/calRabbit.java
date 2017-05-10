package service;
//计算兔子数量

public class calRabbit {
	
	private static int result;

	public void calR(int n){
		int f1 = 1;
		int f2 = 2;
		int temp;
		for(int i = 3;i<=n;i++){
			temp = f2;
			f2 = f1 + f2;
			f1 = temp;
		}
		result = f2;
	}
	
	public int getResult(){
		return result;
	}
}
