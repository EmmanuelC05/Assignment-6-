
public class MergeSort {public static void main(String args[])
	{
		int sortArray[] = { 20, 5, 99, 14, 23, 7 };

		System.out.println("My Array");
		printArray(sortArray);

		MergeSort ob = new MergeSort();
		ob.sort(sortArray, 0, sortArray.length - 1);

		System.out.println("Merge Sorted array");
		printArray(sortArray);
	}

   
	void merge(int mergeArr[], int l, int m, int a)
	{
		
		int n1 = m - l + 1;
		int n2 = a - m;

		
		int L[] = new int[n1];
		int A[] = new int[n2];

		
		for (int i = 0; i < n1; ++i)
			L[i] = mergeArr[l + i];
		for (int j = 0; j < n2; ++j)
			A[j] = mergeArr[m + 1 + j];

		
		
		int i = 0, j = 0;

		
		int k = l;
		while (i < n1 && j < n2) {
			if (L[i] <= A[j]) {
				mergeArr[k] = L[i];
				i++;
			}
			else {
				mergeArr[k] = A[j];
				j++;
			}
			k++;
		}

		
		while (i < n1) {
			mergeArr[k] = L[i];
                        k++;
			i++;
			
		}

		
		while (j < n2) {
			mergeArr[k] = A[j];
                        k++;
			j++;
			
		}
	}

	
	void sort(int sortArray[], int l, int a)
	{
		if (l < a) {
			
			int m=l + (a - l) / 2;

			
			sort(sortArray, l, m);
			sort(sortArray, m + 1, a);

			
			merge(sortArray, l, m, a);
		}
	}

	
	static void printArray(int sortArray[])
	{
		int n = sortArray.length;
		for (int i = 0; i < n; ++i)
			System.out.print(sortArray[i] + " ");
		System.out.println();
	}
}

	
	


    

