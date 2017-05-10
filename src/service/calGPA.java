package service;
//º∆À„GPA

public class calGPA {
	
	private static double result;

	public void calG(double[] grade){
		double temp = 0;
		int len = grade.length;
		for(int i = 0;i<len;i++){
			if (grade[i] <60) {
				temp += 0;
			}else if (grade[i]<=63&&grade[i]>=60) {
				temp += 1.0;
			}else if (grade[i]<=67&&grade[i]>=64) {
				temp += 1.5;
			}else if (grade[i]<=71&&grade[i]>=68) {
				temp += 2.0;
			}else if (grade[i]<=74&&grade[i]>=72) {
				temp += 2.3;
			}else if (grade[i]<=77&&grade[i]>=75) {
				temp += 2.7;
			}else if (grade[i]<=81&&grade[i]>=78) {
				temp += 3.0;
			}else if (grade[i]<=84&&grade[i]>=82) {
				temp += 3.3;
			}else if (grade[i]<=89&&grade[i]>=85) {
				temp += 3.7;
			}else if (grade[i]<=100&&grade[i]>=90){
				temp += 4.0;
			}
		}
		temp = temp / len;
		result = temp;
	}
	
	public double getResult(){
		return result;
	}

}

