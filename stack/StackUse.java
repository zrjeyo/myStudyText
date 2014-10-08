package stack;

import java.util.Stack;

public class StackUse {

	/**
	 * @param args
	 */
	public boolean isMatch(String s){
        //符号成对匹配
		Stack<Character> sk=new Stack<Character>();
        for(int i=0;i<s.length();i++){
        	if(s.charAt(i)=='('){
        		sk.push('(');
        	}
        	if(s.charAt(i)==')'){
        		if(!sk.isEmpty()&&sk.pop()=='(')
        			continue;
        		else 
        			return false;
        	}
        	if(s.charAt(i)=='['){
        		sk.push('[');
        	}
        	if(s.charAt(i)==']'){
        		if(!sk.isEmpty()&&sk.pop()=='[')
        			continue;
        		else 
        			return false;
        	}
        }
        if(sk.isEmpty())
        	return true;
        else
		    return false;
	}
	
	public String conversion(int num,int n){
	  //进制转换
		Stack<Integer> stack=new Stack<Integer>();
		Integer result=num;
		while(true){
			stack.push(result%n);
		   result=result/n;
		   if(result==0){
			   break;
		   }
		}
		StringBuilder sb=new StringBuilder();//非安全线程通常推荐
		while(!stack.isEmpty()){
			sb.append(stack.pop());
		}
		return sb.toString();		
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s="[()]([])";
		StackUse stackUse=new StackUse();
        System.out.println("字符串s是否为匹配符号:"+ stackUse.isMatch(s));
		System.out.println("6的二进制数是"+stackUse.conversion(6, 2));
	}

}
