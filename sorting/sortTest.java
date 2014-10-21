package sorting;

public class sortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
       int[] num={9,8,10,28,4,74,65,98,11,8,33,99,8};
       ISorting iSorting=new SortingImpl();
       JDKProxy jdkProxy=new JDKProxy(iSorting);
       ISorting proxy=jdkProxy.createJDKProxy();//使用JDKProxy动态代理，增强advice：运行时间测试（纳秒）
       num=proxy.b_sort(num);// 冒泡排序测试    
/*        if( sortingImpl.a_sort(num, 17)!=-1) //2分查找测试
        	System.out.print("has this dest");
        else System.out.print("has not this deskt");*/
/*       sortingImpl.e_sort(num,0,num.length-1);*/
       for(int i:num)
    	   System.out.println(i);
       
       
    
	}

}
