package sorting;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/*
  JDKProxy 面向接口的动态代理
*/
public class JDKProxy implements InvocationHandler{
	private ISorting iSorting;//目标接口
    
	public JDKProxy(ISorting iSorting){
	 this.iSorting=iSorting;//构造传入目标接口
     }
 
	public ISorting createJDKProxy(){
		return (ISorting)Proxy.newProxyInstance(iSorting.getClass().getClassLoader(), iSorting.getClass().getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable {
		// TODO Auto-generated method stub
		long begin=System.nanoTime();
		Object result=method.invoke(iSorting, args);
		long end=System.nanoTime();
		System.out.println("方法运行时间:"+(end-begin));
		return result;
	}
}
