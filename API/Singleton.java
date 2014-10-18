package API;
//单例类:一个类只能创建一个对象
public class Singleton {
	 private static Singleton instance;  //使用static修饰，因为它要在该类的静态方法中被访问，作用是一个引用变量指向对象。  
     
	    private Singleton(){};  //提供一个私有的构造器，使用方法来控制它不能使用new()实例化,使用静态类方法返回。  
	  
	    //方法必须是public的和static的，因为方法要公开被下面的类调用并且下面的s1引用变量获取方法的方式是通过类.方法来实现的。因为不能创建对象，所以只能用类。这样就约束了只能创建一个对象。  
	    public synchronized static Singleton getInstance() //加上事务锁防止并发
	    { 
	        if (instance == null) 
	        { 
	            instance = new Singleton(); 
	        } 
	        return instance; 
	    }  
}