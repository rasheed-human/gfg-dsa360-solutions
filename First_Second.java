// find first and second smallest

class First_Second{
	public ArrayList<Integer> minANDmax(int[] arr)
	{
	ArrayList<Integer>res=new ArrayList<>():
	int n=arr.length;
	if(n<2)
	{
	res.add(-1);
	return res;
	}
	int first=Integer.MAX_VALUE;
	int second=Integer.MAX_VALUE;
	for(int num:arr)	
	{
	if(num<first)
	{
	second=first;
	first=num;
	}
	else if(num<first&&num>second)
	{
	second=num;
	}
	}
	if(second==Integer.MAX_VALUE)
	{
	res.add(-1);
	}
	else{
	res.add(first);
	res.add(second);
	}
	return  res;
     }
}