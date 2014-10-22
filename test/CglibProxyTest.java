package test;

import org.junit.Test;

public class CglibProxyTest {
  @Test
	public void demo1(){
	  Compare compare=new Compare();
	  CglibProxy cglibProxy=new CglibProxy(compare);//cglib动态代理 时间(毫秒)
	  Compare proxy=(Compare)cglibProxy.createCglib();
	  System.out.println(proxy.compareString("abc", "Abc"));  
  }
  
  @Test
  public void demo2(){
	  CglibProxy cglibProxy=new CglibProxy(new HuiWenShu());
	  HuiWenShu proxy=(HuiWenShu)cglibProxy.createCglib();
	  System.out.println(proxy.getMaxH("soorsoos"));
  }
  
  @Test
  public void demo3(){
	  CglibProxy cglibProxy=new CglibProxy(new NumberUtil());
	  NumberUtil numberUtil=(NumberUtil)cglibProxy.createCglib();
	  numberUtil.roundNumber(1.261);
  }
  
  @Test
  public void demo4(){
  	int[] array={1,1,1,1,1,1,1};
  	int size=array.length;
  	int sum=array[0];
  CglibProxy cglibProxy=new CglibProxy(new TaiJieProblem());
  TaiJieProblem taiJieProblem=(TaiJieProblem) cglibProxy.createCglib();
  if(taiJieProblem.getSum(array, sum, 0, size)){
	   System.out.println("true");
  }else
	   System.out.println("false");
  }
}
