package service;
//´úÂëÔËĞĞË³Ğò

public class codeTest {
	
	public static String result="";
	
	static codeTest test = new codeTest("3");

    static{
        System.out.println("1");
        result = result + "1";
    }
    
    {
        System.out.println("2");
        result = result + "2";
    }
    
    public codeTest(String s){
        System.out.println(s);
        result = result + s;
    }

    public static void staticFunction(){
        System.out.println("4");
        result = result + "4";
    }

    public static void run() {
        staticFunction();
    }
    
    public String getResult(){
    	return result;
    }
}
