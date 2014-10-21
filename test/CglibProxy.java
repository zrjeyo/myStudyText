package test;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;
/*
 Cglib面向类的动态代理(需要引cglib-nodep-2.2.jar)
*/
public class CglibProxy implements MethodInterceptor{
   private Object myObject;//目标对象
   
   public CglibProxy(Object myObject){
	   this.myObject=myObject;
   }
   
   public Object createCglib(){
	   //创建代理核心对象
	  Enhancer enhancer=new Enhancer();
	  //设置被代理类(为类创建子类);
	  enhancer.setSuperclass(myObject.getClass());
	  //设置回调函数
	  enhancer.setCallback(this);
	  //返回代理（返回代理子类对象）
	  return enhancer.create();
   }

@Override
//被代理对象所有方法执行，都会调用intercept方法
public Object intercept(Object proxy, Method method, Object[] args,
		MethodProxy methodProxy) throws Throwable {
	// TODO Auto-generated method stub
	if(method.getName().equals("isHuiWenShu"))
	 return methodProxy.invokeSuper(proxy, args);
	else{
	long begin=System.currentTimeMillis();
	Object result=methodProxy.invokeSuper(proxy, args);
	long end=System.currentTimeMillis();
	System.out.println("方法运行时间:"+(end-begin));
	return result;
    }
}
}
