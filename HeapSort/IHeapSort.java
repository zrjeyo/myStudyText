package HeapSort;
/*
升序建最大堆，降序建最小堆
*/
   public interface IHeapSort {
 
	public void swap(int[] A,int largest,int i);//交换堆顶元素   
	   
	public void heapify(int A[],int i);//维持最大堆性质，即a[i]>a[2*i]&&a[i]>a[2*i+1]
	
	public void buildHeap(int A[]);//构建堆
	
	public void heapSort(int A[]);//堆排序算法
	
}
