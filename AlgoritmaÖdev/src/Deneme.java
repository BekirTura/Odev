import javax.xml.namespace.QName;


public class Deneme {
   public static int N;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x[]={9,5,8,3,1};
		//bublesort(x);
		//quickSort(x, 0, 4);
		//selectionSort(x, 4);
		//insertionSort(x);
		//mergesort(x,0,8);
		//heapsort(x);
		shellsort(x);
		for (int i = 0; i < x.length; i++) {
			System.out.println(x[i]);
		}

	}
	public static void shellsort(int []a){
		int n=a.length;
		int h=1;
		while((h*3+1<n)){
			h=3*h+1;
		}
		while(h>0){
			for (int i = 0; i < n; i++) {
				int b=a[i];int j=i;
				for(j=i;(j>=h)&&(a[j-h]>b);j-=h) {
					a[j]=a[j-h];
				}
				a[j]=b;
			}
			h=h/3;
		}
	}
	public static void heapsort(int arr[])
    {       
        heapify(arr);        
        for (int i = N; i > 0; i--)
        {
            swap(arr,0, i);
            N = N-1;
            maxheap(arr, 0);
        }
    }     
    /* Function to build a heap */   
    public static void heapify(int arr[])
    {
        N = arr.length-1;
        for (int i = N/2; i >= 0; i--)
            maxheap(arr, i);        
    }
    /* Function to swap largest element in heap */        
    public static void maxheap(int arr[], int i)
    { 
        int left = 2*i ;
        int right = 2*i + 1;
        int max = i;
        if (left <= N && arr[left] > arr[i])
            max = left;
        if (right <= N && arr[right] > arr[max])        
            max = right;
 
        if (max != i)
        {
            swap(arr, i, max);
            maxheap(arr, max);
        }
    }    
    /* Function to swap two numbers in an array */
    public static void swap(int arr[], int i, int j)
    {
        int tmp = arr[i];
        arr[i] = arr[j];
        arr[j] = tmp; 
    } 
	/* Merge Sort function */
    public static void mergesort(int[] a, int low, int high) 
    {
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
        // recursively sort 
        mergesort(a, low, mid); 
        mergesort(a, mid, high); 
        // merge two sorted subarrays
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
            a[low + k] = temp[k];         
    }
	public static void insertionSort(int array[]) {
        int n = array.length;
        for (int j = 1; j < n; j++) {
            int key = array[j];
            int i = j-1;
            while ( (i > -1) && ( array [i] > key ) ) {
                array [i+1] = array [i];
                i--;
            }
            array[i+1] = key;
        }
	}
	 
	public static void selectionSort(int []a,int n){
		int tmp,min;
		for (int i = 0; i <n; i++) {
			min=i;
			for (int j = i; j < n; j++) {
				if(a[i]<a[min]){
					min=j;
				}
			}
			tmp=a[i];
			a[i]=a[min];
			a[min]=tmp;
		}
		
	}
	public static void quickSort(int[] a, int altindis, int üstindis) {
		int i = altindis, j = üstindis, h;
		// x terimi,kıyaslamanın yapılacağı pivot dur
		int x = a[(altindis + üstindis) / 2];
		// Takasla diziyi ayrıştırma
		do {
		while (a[i] < x)
		i++;
		while (a[j] > x)
		j--;
		if (i <= j) {
		h = a[i];
		a[i] = a[j];
		a[j] = h;
		i++;
		j--;
		}
		} while (i <= j);
		// rekürsif
		if (altindis < j)
		quickSort(a, altindis, j);
		if (i < üstindis)
		quickSort(a, i, üstindis);
		}
	
	public static void bublesort(int [] x ){
		//enfazla(n-1)iterasyongerektirir.
		int uzunluk=x.length;
		int tut,j,i;
		for(i=0;i<uzunluk-1;i++){
			for(j=0;j<uzunluk-i-1;j++){
				if(x[j]>x[j+1]){
					tut=x[j];
					x[j]=x[j+1];
					x[j+1]=tut;
				}
			}
		}
				
	}
	

}
