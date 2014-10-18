package API;

public class Person extends Father{
 private String name="person";
  public static void main(String args[]){
	 Person person=new Person();
	 System.out.println(person.getName());
  }
}

class Father{
	private String name="father";
	public String getName(){
		return name;
	}
}
