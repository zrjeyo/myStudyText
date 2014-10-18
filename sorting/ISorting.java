package sorting;

public interface ISorting {
	public  int a_sort(int[] num,int dest);//2分查找
	
	public int[]  b_sort(int[] num);//冒泡排序
	
	public int[] c_sort(int[] num);//选择排序
	
	public int[] d_sort(int[] num);//直接插入排序
	
	public int[] e_sort(int[] num,int left,int right);//快速排序
}
