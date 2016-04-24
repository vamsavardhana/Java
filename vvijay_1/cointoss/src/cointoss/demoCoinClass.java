package cointoss;

class demoCoinClass{
	public static void main(String[] args)
	{
		int head=1,tail=0;
		CoinToss CoinTossObj=new CoinToss();
		System.out.println("Tossing coin 20 times \n");
		for(int i=0;i<20;i++)
		{
			String result=CoinTossObj.toss();
			//System.out.println("the result is"+result+"\n");
			if(result=="Heads")
			{
				head= head+1;
				System.out.printf("Current number of Heads: %d \n",head);
			}
			else
			{
				tail= tail+1;
				System.out.printf("Current number of tails: %d \n",tail);
			}
			
		}
	}
}
	