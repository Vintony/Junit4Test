package service;
//�������������ٶ�

public class calSpeed {

	private static double result;
	
	public void calS(double height){
		result = Math.sqrt(2*10*height);
	}
	
	public double getResult(){
		return result;
	}
	
}
