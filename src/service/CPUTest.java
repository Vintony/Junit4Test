package service;

import java.io.IOException;
import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
  
public class CPUTest {  
	
	public static double time;
	
    public static void main(String[] args) {  
          
        CPUTestThread cpuTestThread = new CPUTestThread();  
        for (int i = 0; i < 15; i++) {  
            Thread cpuTest = new Thread(cpuTestThread);  
            cpuTest.start();
            time += CPUTest.time;
        }  
          
        //Windows Task Manager shows  
        try {  
            Runtime.getRuntime().exec("taskmgr");  
        } catch (IOException e1) {  
            e1.printStackTrace();  
        }  
    }  
}  
  
class CPUTestThread implements Runnable {  
  
	public static double time;
	
    @Override  
    public void run() {
    	
    	OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
    	  for (Method method : operatingSystemMXBean.getClass().getDeclaredMethods()) {
    	    method.setAccessible(true);
    	    if (method.getName().startsWith("get") 
    	        && Modifier.isPublic(method.getModifiers())) {
    	            Object value;
    	        try {
    	            value = method.invoke(operatingSystemMXBean);
    	        } catch (Exception e) {
    	            value = e;
    	        } // try
    	        System.out.println(method.getName() + " = " + value);
    	    } // if
    	  } // for

    	
        int busyTime = 10;  
        int idleTime = busyTime;  
        long startTime = 0;
        while (true) {  
            startTime = System.currentTimeMillis();
            time = System.currentTimeMillis() - startTime;
            System.out.println(System.currentTimeMillis()+","+startTime+","+(System.currentTimeMillis() - startTime));
            // busy loop  
            while ((System.currentTimeMillis() - startTime) <= busyTime)  
                ;  
            // idle loop  
            try {  
                Thread.sleep(idleTime);  
            } catch (InterruptedException e) {  
                System.out.println(e);  
            }  
        }  
  
    }  
  
}  