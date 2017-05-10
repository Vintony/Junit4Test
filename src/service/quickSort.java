package service;
//¿ìËÙÅÅÐò

public class quickSort {
	
	private static int[] result;
	
	public void quickSortFunction(int[] number)
	{
		result = number;
		if(result.length>0)
		{
			_quickSort(result, 0, result.length-1);
		}
	}
	
	public void _quickSort(int[] list,int low, int high)
	{
		if(low < high)
		{
			int middle = getMiddle(list, low, high);
			
			_quickSort(list, low, middle-1);
			
			_quickSort(list, middle+1, high);
		}
	}
	
	public int getMiddle(int[] list, int low, int high)
	{
		int temp = list[low];
		while(low<high)
		{
			while(low < high && list[high]>=temp)
			{
				high--;
			}
			list[low]=list[high];
			while(low<high&&list[low]<=temp)
			{
				low++;
			}
			list[high]=list[low];
		}
		list[low]=temp;
		return low;
	}
	
	public int[] getResult(){
		return result;
	}
}
