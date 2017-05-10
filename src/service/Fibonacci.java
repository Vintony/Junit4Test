package service;

public class Fibonacci {
	
	private static int result;
	
	public void cal(int n){
		int n1 = 1;
		int n2 = 1;
		int sum = 0;
		if (n<=2) {
			throw new IllegalArgumentException("n²»ºÏ·¨");
		}else{
			for(int i =3;i<=n;i++){
				sum = n1 + n2;
				n1 = n2;
				n2 = sum;
			}
			result = sum;
		}
	}
	
	public int getResult(){
		return result;
	}
}
