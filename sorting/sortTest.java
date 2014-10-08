package sorting;

public class sortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] num={9,8,10,28,4,74,65,98,11,44,33,99,8};
       ISorting sortingImpl=new SortingImpl();
//       num= sortingImpl.b_sort(num);// 冒泡排序测试

       /*       num= sortingImpl.c_sort(num);  // 选择排序测试
        for(int i=0;i<num.length;i++){
        System.out.print(num[i]+" ");*/
       
/*        if( sortingImpl.a_sort(num, 17)!=-1) //2分查找测试
        	System.out.print("has this dest");
        else System.out.print("has not this deskt");*/
       sortingImpl.d_sort(num);
       for(int i:num)
    	   System.out.println(i);
       
       
    
	}

}
