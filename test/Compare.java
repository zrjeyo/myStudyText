package test;

public class Compare {
	public int compareString(String A,String B){
		char[] one=A.toCharArray();
		char[] two=B.toCharArray();
		int temp=0;
		if(one.length!=B.length())
		{
			return --temp;
		}
		for(int i=0;i<one.length&&temp==0;i++){
			if(one[i]!=two[i]&&(one[i]+32)!=two[i]&&(one[i]-32)!=two[i]){  
			 temp--;
			 break;
			}
		}
		return temp;
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     System.out.print("hello world");
	}

}