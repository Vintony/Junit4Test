package service;
//÷±Ω”≤Â»Î≈≈–Ú

public class insertSort {
	
	private static int[] result;
	
	public void insertSortFunction(int number[])
	{
		int temp = 0;
		result = number;
		for(int i = 1 ; i < result.length ; i++)
		{
			int j = i - 1;
			temp = result[i];
			for(;j>=0 && temp < result[j];j--)
			{
				result[j+1] = result[j];
			}
			result[j+1] =temp;
		}
	}
	
	public int[] getResult()
	{
		return result;
	}
	
}
