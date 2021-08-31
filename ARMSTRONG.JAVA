class ARMSTRONG {
    
	public static void main (String[] args) {
		//code
		int N=8;
		System.out.println("\n  PROGRAM TO CHECK WHEATER A NUMBER " + N + " IS ARMSTRING OR NOT ");
        int sum=0,num=N;
        while(N!=0)
        {
            int rem=N%10;
            N=N/10;
            sum=sum+rem*rem*rem;
        }

        if(num==sum)
        {
            System.out.println(" It  Is Armstrong ");
        }
        else
        {
            System.out.println(" It  Is NOT Armstrong ");
        }
	}
}
