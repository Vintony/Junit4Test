package service;
//����ȱ�����֮��

public class calGS {
	
	private double result;
	
	public void cal(double a1,double q,double n){
		result = a1*(1-Math.pow(q, n))/(1-q);
	}
	
	public double getResult(){
		return result;
	}
}
