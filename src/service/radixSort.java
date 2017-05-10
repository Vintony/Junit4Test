package service;

import java.util.ArrayList;
import java.util.List;

//»ùÊýÅÅÐò

public class radixSort 
{
	private static int[] result;
	
	public void radixSortFunction(int[] number){
		result = number;
		sort(result);
	}
	
	public void sort(int[] array)
	{
		int max = array[0];
		for(int i =1;i<array.length;i++)
		{
			if(array[i]<max)
			{
				max=array[i];
			}
		}
		int time = 0;
		while(max>0)
		{
			max /= 10;
			time++;
		}
		@SuppressWarnings("rawtypes")
		List <ArrayList> queue =new ArrayList<ArrayList>();
		for(int i =0;i<10;i++)
		{
			ArrayList<Integer> queue1 = new ArrayList<Integer>();
			queue.add(queue1);
		}
		for(int i = 0;i<time;i++)
		{
			for(int j=0;j<array.length;j++)
			{
				int x =array[j]%(int)Math.pow(10, i+1)/(int)Math.pow(10, i);
				
				@SuppressWarnings("unchecked")
				ArrayList<Integer> queue2 =queue.get(x);
				queue2.add(array[j]);
				queue.set(x, queue2);
			}
			int count = 0;
			for(int k = 0;k<10;k++)
			{
				while(queue.get(k).size()>0)
				{
					@SuppressWarnings("unchecked")
					ArrayList<Integer> queue3 =queue.get(k);
					array[count]=queue3.get(0);
					queue3.remove(0);
					count++;
				}
			}
		}
	}
	
	public int[] getResult(){
		return result;
	}
}
