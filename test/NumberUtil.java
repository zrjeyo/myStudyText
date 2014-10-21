package test;
import java.text.DecimalFormat;
public class NumberUtil {

	/**
	 * @param args
	 */
	public void roundNumber(double numberToRound){
		DecimalFormat df=new DecimalFormat("0.00");
		System.out.println("Rounded number="+df.format(numberToRound));

		System.out.println(String.format("Rounder number=%.2f", numberToRound));
	}


}
