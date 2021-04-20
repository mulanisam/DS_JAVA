public class SelectionSort
{
    void selectionSort(int arr[])
    {
        int l=arr.length;
        for(int i=0; i < l-1; i++)
        {
            int min = i;
            for(int j=i+1; j < l; j++)
                if(arr[j]<arr[min])
                    min = j;
                    
                int temp = arr[min];
                arr[min] = arr[i];
                arr[i] = temp;
                

        }
    }
    void display(int arr[])
    {
        int l=arr.length;
        for(int i=0; i<l;i++)
        System.out.println(arr[i]);
    }
	public static void main(String[] args) {
		int arr[] = {80,10,70,30,40,90};
		SelectionSort ss = new SelectionSort();
		ss.selectionSort(arr);
		ss.display(arr);
	}
}
