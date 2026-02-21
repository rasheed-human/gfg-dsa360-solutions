class Check_evenOdd{
	public static int evenOdd(int n)
{
//using bitwise operators
	
	if((n&1)==0)
	{
	return true;
	}
	else{
	return false;
	}
//using divisable approach
	
	if(n%2==0)
	{
	return true;
	}
	else
	{
	return false;
	}

//Time complexity:O(1)
/space complexity:O(1)
