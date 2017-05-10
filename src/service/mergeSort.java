package service;
//πÈ≤¢≈≈–Ú

public class mergeSort {
	
	public int[] sort(int[] number) {  
        if (number.length <= 1) return number;  
        if (number.length == 2) {  
            if (number[0] > number[1]) {  
                int temp = number[0];  
                number[0] = number[1];  
                number[1] = temp;  
            }  
            return number;  
        }  
        int mid = number.length / 2;  
        int[] firstHalf = sort(getPart(number, 0, mid));  
        int[] secondHalf = sort(getPart(number, mid + 1, number.length - 1));  
        return mergePart(firstHalf, secondHalf);  
    }  
  
    private int[] mergePart(int[] firstHalf, int[] secondHalf) {  
        int[] result = new int[firstHalf.length + secondHalf.length];  
        int firstIndex = 0, secondIndex = 0, resultIndex = 0;  
        while (resultIndex < result.length) {  
            if (chooseFirstHalf(firstHalf, firstIndex, secondHalf, secondIndex))  
                result[resultIndex++] = firstHalf[firstIndex++];  
            else  
                result[resultIndex++] = secondHalf[secondIndex++];  
        }  
        return result;  
    }  
  
    private boolean chooseFirstHalf(int[] firstHalf, int firstIndex, int[] secondHalf, int secondIndex) {  
        if (firstIndex == firstHalf.length) return false;  
        if (secondIndex == secondHalf.length) return true;  
        return firstHalf[firstIndex] < secondHalf[secondIndex];  
    }  
  
    private int[] getPart(int[] input, int begin, int end) {  
        int[] result = new int[end - begin + 1];  
        for (int i = begin; i <= end; i++) result[i - begin] = input[i];  
        return result;  
    }
	
}
