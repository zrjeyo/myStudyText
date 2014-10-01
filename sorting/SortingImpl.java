package sorting;

public class SortingImpl implements ISorting {

	@Override
	public int a_sort(int[] num, int dest) {
		/* TODO Auto-generated method stub
		 * 二分查找，前提是以排序的数组
		 * 查找到返回数组下标，否则返回-1
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
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int[] c_sort(int[] num) {
		// TODO Auto-generated method stub
		return null;
	}

}
