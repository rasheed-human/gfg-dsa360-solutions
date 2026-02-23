// program to rotate the array in clock wise directions


class RotateArray{
public static int rotation(int[] arr,k)
{
int n=arr.length;
if(n==0)
{
return ;
}
int i,j;
for(i=n-k,j=n-1;i<j;i++,j--)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
for(i=n-k-1,j=n-1;i<j;i++,j--)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
for(i=0,j=n-1;i<j;i++,j--)
{
int temp=arr[i];
arr[i]=arr[j];
arr[j]=temp;
}
}
}