package service;
//ºÚµ•—°‘Ò≈≈–Ú

public class selectSort 
{
	private static int[] result;
	
	public void selectSortFunction(int[] number)
	{
		result = number;
		int position = 0;
		for(int i = 0  ; i < result.length ; i++ )
		{	
			int j = i + 1;
			position = i;
			int temp = result[i];
			for(;j<result.length;j++)
			{
				if(result[j] < temp)
				{
					temp = result[j];
					position = j;
				}
			}
			result[position] = result[i];
			result[i] =temp;
		}
	}
	
	public int[] getResult()
	{
		return result;
	}
}
