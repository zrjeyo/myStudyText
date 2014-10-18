package test;
import java.text.DecimalFormat;


public class NumberUtil {
 //小数做四舍五入
	/**
	 * @param args
	 */
	public void roundNumber(double numberToRound){
		DecimalFormat df=new DecimalFormat("0.00");
		System.out.println("Rounded number="+df.format(numberToRound));
		//下面java 1.5及以上才支持
		System.out.println(String.format("Rounder number=%.2f", numberToRound));
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
    NumberUtil util=new NumberUtil();
    util.roundNumber(1.238);
	}

}
