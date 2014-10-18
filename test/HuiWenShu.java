package test;

public class HuiWenShu {
	public boolean isHuiWenShu(String s){
		//判断一个字符串是否回文数
		int size=s.length();
		if(!s.isEmpty()){
			for(int i=0,j=size-1;i<j;i++,j--){
				if(s.charAt(i)!=s.charAt(j)){
					return false;
				}
			}
		}else return false;
		return true;
	}

	public int getMaxH(String s){
		//计算字符串回文数最大长度
		int temp=0;int max=0;
		for(int i=0;i<s.length();i++){
			for(int j=s.length();j-i>1;j--){
				//取所有子字符串组合
                 if(this.isHuiWenShu(s.substring(i, j))){  //第i个至j的前一个
                	 temp=j-i;
                	 break;
                 }        
			}
			max=max>temp?max:temp;
		}
		return max;
	}
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
      String s="dfjhejs";
      HuiWenShu hws=new HuiWenShu();
      System.out.println(hws.getMaxH(s));
	}

}
