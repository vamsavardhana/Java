package cointoss;

public class CoinToss {
	String sideUp;
	
// no args constructor that shows side of coin facing up
	
	void CoinToss(){
		toss();
		
	}
	
//tossing of the coin void method
	String toss(){
		double sideUpToss=Math.random();
		//System.out.println(sideUpToss);
		if (sideUpToss<0.5)
		sideUp="Tails";
		else
		sideUp="Heads";
		System.out.printf("This time the outcome is %s",sideUp);
		return sideUp;
	}

	String getSideUp()
	{
		return sideUp;
	}
}

