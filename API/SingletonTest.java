package API;

import org.junit.Before;
import org.junit.Test;

public class SingletonTest {
	@Before
	public void setUp() throws Exception {
		
	}

	@Test
	public void testGetInstance() {
		Singleton singleton2=Singleton.getInstance();
		System.out.println(singleton2);
	}
	
	@Test
	//单例类测试
	public void testSingleton() {
		Singleton singleton1=Singleton.getInstance();
		Singleton singleton2=Singleton.getInstance();
		if(singleton1==singleton2)
			System.out.println(singleton1);
	}
	
/*	@Test
	public void testNewSingleton() {
		Singleton singleton1=new Singleton();//无法通过new实例对象
		System.out.println(singleton1);
	}
	*/
}
