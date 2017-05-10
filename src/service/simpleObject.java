package service;
//类与对象实例

public class simpleObject {
	
	static public int result;
	
	public simpleObject(int count){
		count = count + 1;
		result = count;
	}
	
	public int getCount(){
		return result;
	}
}
