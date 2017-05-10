package service;
//ÀºÇò·´µ¯

public class basketballBounce {
	
	private double height;
	
	public void cal(double first){
		height = first * 0.8;
	}
	
	public double getResult(){
		return height;
	}
	
}
