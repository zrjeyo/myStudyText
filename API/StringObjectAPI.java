package API;

public class StringObjectAPI {
       public void StringAPI(){
    	   String s=new String("abcdefg");//栈中
    	   String ss=new String("abcdefg");
    	   String sss="abcdefg";//字符池
    	   String ssss="abcdefg";
    	   System.out.println(ss==s);// false;
    	   System.out.println(sss==ssss);// true;
    	   System.out.println(s.charAt(1));  //获取s中下标i的字符
    	   System.out.println(s.toCharArray());  //将s转化char[]数组
    	   System.out.println(s.compareTo("abcdefgh")); //若对应位全相同计算长度差，否则计算第i为不同字符的差
    	   System.out.println(s.compareToIgnoreCase("abcd")); // 同上，忽略大小写
    	   System.out.println(s.contains("as")); //返回boolean 是否包含字符串as
    	   System.out.println(s.endsWith("fg"));//返回boolean 是否结尾为字符串fg
    	   System.out.println(s.equals("abcdefg"));//比较2个对象内容是否相同,equals里调用hashCode()
    	   System.out.println(s.equalsIgnoreCase("abCdefG"));//忽略大小写比较2个对象内容是否相同
    	   System.out.println(s.hashCode());//得到对象的内容编码
    	   System.out.println(s.indexOf("cd"));//返回查找到字符串或字符首下标,无返回-1
    	   String[] m=s.split("c|e");//可以使用正则
    	   for(String i:m)
    		   System.out.println(i);
       }
      
       static public void main(String args[]){
    	   StringObjectAPI stringObjectAPI=new StringObjectAPI();
    	   stringObjectAPI.StringAPI();
       }
}
