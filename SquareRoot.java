class SquareRoot{
	public static int square(int n)
	{
	int res=1;
	while(res*res<=n)
	{
	res++;
	}
	return res-1;
      }
}


//using builtin function
//return (int)Math.sqrt(n);