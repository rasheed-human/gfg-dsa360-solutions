class Calculate_nCr{
	public static int findnCr(int n,int r)
	{
	if(r>n) 
	return 0;
	if(r==0||n==r)
	return 1;
	double res=0;
	for(int i=0;i<n;i++)
	{
	res+=Math.log(n-i)-Math.log(i+1);
	}
	return (int)Math.round(Math.exp(res));
     }
   }