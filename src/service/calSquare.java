package service;
//计算三角形面积

public class calSquare {
	
	private double result;
	
	public boolean isValidate(int a, int b, int c) {
		boolean flag = false;
		if ((a < b + c) && (a > Math.abs(b - c))) {
			flag = true;
		} else {
		}
		return flag;
	}
	
	public void cal(int a,int b,int c) {
		if (isValidate(a, b, c)) {
			double s = (a+b+c)/2;
			s =  Math.sqrt(s * (s - a) * (s - b) * (s - c));
			result = s;
		}else{
			throw new IllegalArgumentException();
		}
	}
	
	public double getResult(){
		return result;
	}
	
}
