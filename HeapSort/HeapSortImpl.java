package HeapSort;

public class HeapSortImpl implements IHeapSort {
    int heapSize;
	@Override
	public void swap(int[] A, int largest, int i) {
		// TODO Auto-generated method stub
		int temp=A[largest];
		A[largest]=A[i];
		A[i]=temp;
	}

	@Override
	public void heapify(int[] A, int i) {
		// TODO Auto-generated method stub
      int left=2*i;
      int right=2*i+1;
      int largest=i;
      if(left<=heapSize) largest=A[left-1]>A[i-1]?left:i;
      if(right<=heapSize) largest=A[right-1]>A[largest-1]?right:largest;
      if(largest!=i){
    	 swap(A,largest-1,i-1);
    	 heapify(A,largest);  
      }      
	}

	@Override
	public void buildHeap(int[] A) {
		// TODO Auto-generated method stub
		heapSize=A.length;
        for(int i=heapSize/2;i>=1;i--){
        	heapify(A,i);
        }
	}

	@Override
	public void heapSort(int[] A) {
		// TODO Auto-generated method stub
           buildHeap(A);
           for(int i=A.length-1;i>0;i--){
        	   swap(A,i,0);
        	   heapSize=heapSize-1;
        	   heapify(A,1);
           }
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
          int[] a=new int[100];
          for(int i=100,j=0;i>0;i--,j++)
        	  a[j]=i;
//          long pre=System.currentTimeMillis();
          IHeapSort heapSorImpl=new HeapSortImpl();
          heapSorImpl.heapSort(a);
//          long post=System.currentTimeMillis();
        	for(int i:a)	 
          System.out.println(i);
          }
}
