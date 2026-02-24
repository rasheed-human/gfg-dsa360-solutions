//program to find the duplicates of an array

class Duplicates{
	public ArrayList<Integer> findDuplicates(int[] arr)
	{
	int n=arr.length;
	int[] freq=new int[n+1];
	for(int num:arr)
	{
	freq[num]++;
	if(freq[num]>1)
	{
	return num;
	}
      }
     return -1;
    }
}