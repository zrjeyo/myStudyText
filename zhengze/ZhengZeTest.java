package zhengze;

import java.util.regex.Matcher;
import java.util.regex.Pattern;


public class ZhengZeTest {

	/**
	 * @param args
	 */
	final void limitBegin(){
		//查找以Java开头,任意结尾的字符串,返回Boolean
		Pattern pattern=Pattern.compile("^Java.*");
		Matcher matcher=pattern.matcher("Java不是人");
		boolean b=matcher.matches();
		System.out.println(b);
	}
	
	final void splitString(){
		//已多条件分割字符串,返回String[]数组
		Pattern pattern=Pattern.compile("[,|]+");
		String[] strs=pattern.split("Java,Hello World!|This is splitString||yse");
		for(String s:strs){
			System.out.println(s);
		}
	}
	
	final void replaceFirst(){
		//替换第一个符合正则的数据 ,返回String
		Pattern pattern=Pattern.compile("Java|HELLO");
		Matcher matcher=pattern.matcher("这是Java正则表达式HELLO WORLD,正则表达式HELLO WORLD");
		System.out.println(matcher.replaceFirst("PHP"));
	}
	
	final void replaceAll(){
		//替换全部符合正则的数据 ,返回String
		Pattern pattern=Pattern.compile("Java正则表达式|正则表达式");
		Matcher matcher=pattern.matcher("这是Java正则表达式HELLO WORLD,正则表达式HELLO WORLD");
		System.out.println(matcher.replaceAll("PHP:"));	
	}
	
	final void appendReplacement(){
		//文字替换(置换字符),返回StringBuffer
		Pattern pattern=Pattern.compile("Java正则表达式|正则表达式");
		Matcher matcher=pattern.matcher("这是Java正则表达式HELLO WORLD,正则表达式HELLO WORLD");
		StringBuffer sb=new StringBuffer();
		while(matcher.find()){
			matcher.appendReplacement(sb, "Java:");
		}
		matcher.appendTail(sb);
		System.out.println(sb.toString());
	}
	
	final void emailCheck(){
		//邮箱验证
		String str="490321165-zrjeyo-zrjeyo.zrjeyo@qq--qq.qq.com";
		Pattern pattern=Pattern.compile("^([a-z0-9A-Z]+[-|\\.]?)+[a-z0-9A-Z]+@([a-z0-9A-Z]+(-[a-z0-9A-Z]+)?\\.)+[a-zA-Z]{2,}$",Pattern.CASE_INSENSITIVE);
		Matcher matcher=pattern.matcher(str);
		System.out.println(matcher.matches());
	}
	
	final void findHtml(){
		//查找html中对应条件字符串
		//group()返回当前查找而获得的与组匹配的所有子串内容
		//group(int i)返回当前查找而获得的与指定的组匹配的子串内容
		Pattern pattern1=Pattern.compile("href=\"([zrjeto]+\\.)+([a-z]*)\"");
		Pattern pattern2=Pattern.compile("<a.*href=\".*\">(.+?)</a>");
		Matcher matcher1=pattern1.matcher("<a href=\"zrjeto.html\">zrjeyo</a>");
		Matcher matcher2=pattern2.matcher("<a sdh href=\"zrjeto.html\">zrjeyo</a>");
		if(matcher1.find()){
		System.out.println(matcher1.group());
		System.out.println(matcher1.group(1));	
		System.out.println(matcher1.group(2));	
		}
	   if(matcher2.find()){
		System.out.println(matcher2.group());
	    System.out.println(matcher2.group(1));		
	}
	}
	
	final void htmlUrl(){
		//截取http://地址
		Pattern pattern=Pattern.compile("(http://|https://){1}[\\w\\./:-]+");
		Matcher matcher=pattern.matcher("dssds<https://dsds:505/fsfsf/sfsf-tt.html>sdsd");
		StringBuffer sb=new StringBuffer();
		while(matcher.find()){
			sb.append(matcher.group());
			sb.append("\r\n");
			System.out.println(sb.toString()+"sb长度:"+sb.length());
		}
	}
		public  static String replace1(final String sourceString,Object[] object) { 
		//替换指定{}中文字
		String temp=sourceString; 
		for(int i=0;i<object.length;i++){ 
		String[] result=(String[])object[i]; 
		Pattern pattern = Pattern.compile(result[0]); 
		Matcher matcher = pattern.matcher(temp); 
		temp=matcher.replaceAll(result[1]); 
		} 
		return temp; 
		}
		
		final void replaceWhat(){
			//替换指定{}中文字
			String str = "Java目前的发展史是由{0}年-{1}年"; 
			String[][] object={new String[]{"\\{0\\}","1995"},new String[]{"\\{1\\}","2007"}}; 
			System.out.println(replace1(str,object)); 
		}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
     ZhengZeTest zhengZeTest=new ZhengZeTest();
   zhengZeTest.replaceWhat();
	}

}
