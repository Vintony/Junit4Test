package service;
//����������ε����

public class calRegularPolygon {
	
	private double result;
	
	public void cal(int n ,double a){
		if(n<3 || a<0){
			throw new IllegalArgumentException();
		}
	    double pi = 3.14159265354; //�����
	    double h =(a/2)/Math.tan(pi/n); //������������εĸ�
	    double triangle =a*h/2; //���������ε����
	    result = triangle*n; //��������������
	}
	
	public double getResult(){
		return result;
	}
	
}
