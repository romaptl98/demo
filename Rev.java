class Rev{
	public static void main(String [] args){
		int i=123456,r=0;
		while(i!=0){
			int rem=i%10;
			r=r*10+rem;
			i=i/10;
		}
		System.out.println("reverse of no"+r);
	}
}