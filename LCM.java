class LCM{
	public static int lcm(int a,int b)
	{
	int g=Math.max(a,b);	
	int s=Math.min(a,b);
	for(int i=g;i<=a*b;i=i+g)
	{
	if(i%s==0)
	{
	return i;
	}
	}
	return a*b;
	}
      }