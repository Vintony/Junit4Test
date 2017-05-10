package service;
//∂—≈≈–Ú

public class heapSort {
	
	private static int[] result;
	
	public void heapSortFunction(int[] number)
	{
		result = number;
		int len = result.length;
		for(int i = 0; i < len-1;i++)
		{
			buildMaxHeap(result, len - 1 -i);
			swap(result, 0, len - 1- i);
		}
	}
	
	private void swap(int[] data, int i, int j)
	{
		int temp = data[i];
		data[i] = data[j];
		data[j] = temp;
	}
	
	private void  buildMaxHeap(int[] data, int lastindex)
	{
		for(int i =(lastindex -1)/2;i>=0;i--)
		{
			int k = i;
			while(k*2+1<=lastindex)
			{
				int biggerindex = 2*k + 1;
				if (biggerindex<lastindex) {
					if (data[biggerindex]<data[biggerindex+1]) {
						biggerindex++;
					}
				}
				if (data[k]<data[biggerindex]) {
					swap(data, k, biggerindex);
					k = biggerindex;
				}else
				{
					break;
				}
			}
		}
	}
	
	public int[] getResult()
	{
		return result;
	}
}
