package service;
//计算圆的面积

public class calCircle {
	
	private double result;

	public void cal(int r){
		result = r*r*3.14;
	}
	
	public double getResult(){
		return result;
	}
	
}
