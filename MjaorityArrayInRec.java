import java.util.*;
class MjaorityArrayInRec{

public static boolean majority(int[] arr , int idx , int count ,int curr){

	if(curr == arr.length )
	{
		idx ++;
		curr = idx ;
		count = 0;
	}
		
	if(count > arr.length/2)
	{
		return true ;
	}

	if(idx == arr.length)
	{
		return false ;
	}

	if(arr[idx] == arr[curr])
	{
		count += 1 ;
	}
	
	return  majority(arr, idx, count, curr +1);
  }
    public static void main(String x[])
	{
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter the size of array ");
    int n = sc.nextInt();

	int[] arr = new int[n];
	for(int i =0;i< n;i++)
	{
		arr[i] = sc.nextInt();
	}

	if(majority(arr,0,0,0) )
	{
		System.out.println("It is majority arr ");
	}
	else
	{
	System.out.println("It is not majority ");
	}
	
	}
}



