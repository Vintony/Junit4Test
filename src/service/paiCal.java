package service;
//¼ÆËãÔ²ÖÜÂÊ

public class paiCal {

	private double result;

	public void pai() {
		double pi = 0;
		boolean flag = true;
		double temp = (double) 1 / 10000000;
		for (double i = 1, j = 1; flag; i = i + 2, j++) {
			if ((double) 1 / i > temp) {
				if (j % 2 == 1) {
					pi = pi + 1 / i;
				} else {
					pi = pi - 1 / i;
				}
			} else
				flag = false;
		}
		result = pi *4;
	}
	
	public double getResult(){
		return result;
	}
}