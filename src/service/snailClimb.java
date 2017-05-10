package service;
//ÎÏÅ£ÅÀ¾®

public class snailClimb {

	private int result;
	
	public void cal(){
		int height = 0;
		for(int i = 0;;i++){
			height += 2;
			if (height == 10) {
				result = i;
				break;
			}else{
				height -= 1;
			}
		}
	}
	
	public int getResult(){
		return result;
	}
	
}
