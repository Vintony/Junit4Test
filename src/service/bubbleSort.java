package service;
//ц╟ещеепР

public class bubbleSort {
	
	private static int[] result;
	
	public void bubbleSortFunction(int[] number)
	{
		result = number;
		int temp = 0;
		for(int i =0;i<result.length-1;i++)
		{
			for(int j =0;j<result.length-1-i;j++)
			{
				if(result[j]>result[j+1])
				{
					temp = result[j];
					result[j]=result[j+1];
					result[j+1]=temp;
				}
			}
		}
	}
	
	public int[] getResult()
	{
		return result;
	}
	
}
