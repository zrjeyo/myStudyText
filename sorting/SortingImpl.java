package sorting;

public class SortingImpl implements ISorting {

	@Override
	public int a_sort(int[] num, int dest) {
		/* TODO Auto-generated method stub
		 * 2分查找，前提已排序
*/		
		int low=0;
		int high=num.length;
		int xiabiao=-1;
		while(low<=high){
			int middle=(low+high)/2;
			//找到
			if(num[middle]==dest){
			  xiabiao=middle;
			  break;
			}
			//在左边
			if(num[middle]>dest){
	          high=middle-1;
	          continue;
			}
			//在右边
			if(num[middle]<dest){
				low=middle+1;
				continue;
			}
		}
		return xiabiao;
	}

	@Override
	public int[] b_sort(int[] num) {
      /*	  TODO Auto-generated method stub
       *冒泡排序
       */		
		for(int i=1;i<num.length;i++){
			boolean flag=true;
			for(int j=0;j<num.length-i;j++){
				if(num[j]>num[j+1]){
					flag=false;
					int temp=num[j];
					num[j]=num[j+1];
					num[j+1]=temp;
				}
			}
		   if(flag){
			   break;
		   }
		}
		return num;
	}

	@Override
	public int[] c_sort(int[] num) {
		/* TODO Auto-generated method stub
		 * 选择排序
*/		
		int minIndex=0;
		int temp=0;
		for(int i=0;i<num.length-1;i++){
			minIndex=i;
			for(int j=i+1;j<num.length;j++){
				if(num[minIndex]>num[j]){
					minIndex=j;
				}
			}
				if(minIndex!=i){
					temp=num[minIndex];
					num[minIndex]=num[i];
					num[i]=temp;
				}
			}
		return num;
	}

}
