package test;
/*
台阶问题 
在一个数组内，从下标0开始，记录着每次最多能走多少阶台阶，判断是否可以走到顶阶
例如: 1,1,1,1,1     输出ture
          2,1,1,0,1     输出false
*/
public class TaiJieProblem {
   public boolean getSum(int array[],int sum,int m,int size){
	   boolean b=false;
      int i=(array[m]+m)>=size?(size-1):(array[m]+m);
      for(;i>m;i--){
    	  if((array[i]+sum)>=size){
    		  b=true;
    		  break;
    	  }
    	  else if(array[i]!=0){
    		  if(getSum(array,sum+array[i],i,size)){
    			  b=true;
    			  break;
    		  }
    	  }
      }
   return b;
   }
}

