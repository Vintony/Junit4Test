package service;
//等差数列求和

public class calAP {
	
	private double result;

	public void cal(double a1,double d,double n){
		result = n * a1 + n*(n-1)*d/2;
	}
	
	public double getResult(){
		return result;
	}
	
}
