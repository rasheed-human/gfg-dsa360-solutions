class CheckDivsibleBy_13{
	public static boolean divisible(String s)
	{
	int num=Integer.parseInt(s);
	return (num%13)==0;
	}
	}
     }
//another approach
	public static boolean divisble(String s)
	{
	int rem=0;
	for(int i=0;i<s.length();i++)
	{
	rem=(rem*10+(s.charAt(i)-'0'))%13;
	}
	return rem==0;
	}
      }
	
	