package service;
//��°ͺ�

public class calGC {

	private static int result1;
	private static int result2;
	
	public void cal(int n) {
		if (n <= 6 || n % 2 == 1) {
			System.out.println("��������!");
			System.exit(0);
		}

		System.out.println(n + "�ֽ�Ϊ��������֮��Ϊ:");
		for (int i = 2; i < n / 2; i++) {
			if (pd(i) && pd(n - i)) {
				result1 = i;
				result2 = n-i;
			}
		}
	}

	public boolean pd(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0)
				return false;
		}
		return true;
	}
	
	public int getResult1(){
		return result1;
	}
	
	public int getResult2(){
		return result2;
	}
}