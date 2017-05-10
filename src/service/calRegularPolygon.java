package service;
//计算正多边形的面积

public class calRegularPolygon {
	
	private double result;
	
	public void cal(int n ,double a){
		if(n<3 || a<0){
			throw new IllegalArgumentException();
		}
	    double pi = 3.14159265354; //定义π
	    double h =(a/2)/Math.tan(pi/n); //计算等腰三角形的高
	    double triangle =a*h/2; //计算三角形的面积
	    result = triangle*n; //返回正多边形面积
	}
	
	public double getResult(){
		return result;
	}
	
}
