package sorting;

public class SortingImpl implements ISorting {

	@Override
	public int a_sort(int[] num, int dest) {
		/* TODO Auto-generated method stub
		 * ���ֲ��ң�ǰ���������������
		 * ���ҵ����������±꣬���򷵻�-1
*/		
		int low=0;
		int high=num.length;
		int xiabiao=-1;
		while(low<=high){
			int middle=(low+high)/2;
			//�ҵ�
			if(num[middle]==dest){
			  xiabiao=middle;
			  break;
			}
			//�����
			if(num[middle]>dest){
	          high=middle-1;
	          continue;
			}
			//���ұ�
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
