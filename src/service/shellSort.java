package service;
//希尔排序（最小增量排序）

public class shellSort 
{	
	private static int[] result;
	
	public void shellSortFunction(int number[])
	{	
		double d1 = number.length;
		int temp = 0;
		result = number;
		while(true)
		{
			d1 =Math.ceil(d1/2);
			int d = (int)d1;
			for(int x=0;x<d;x++)
			{
				for(int i = x + d;i<result.length;i += d)
				{
					int j = i - d;
					temp = result[i];
					for(;j >= 0 &&temp < result[j];j-=d)
					{
						result[j+d]=result[j];
					}
					result[j+d]=temp;
				}
			}
			if(d==1){
				break;
			}
			
		}
	}
	
	public int[] getResult()
	{
		return result;
	}
}
