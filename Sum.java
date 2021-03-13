class Sum{
	public static void main(String [] args){
		int i,sum;
		scanner sc=new Scanner(System.in);
		System.out.println("enter no");
		i=sc.nextInt();
		for(sum=0;i!=0;i/=10)
		{
			sum+=i%10;
		}
		System.out.print("sum of digit"+sum);
	}
}

		
		
		
