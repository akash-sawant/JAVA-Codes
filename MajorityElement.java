import java.util.*;
public class MajorityElement
{
    public static void main(String x[])
    {
	Scanner sc=new Scanner(System.in);
	int a[]=new int[5];
	System.out.println("Enter elements of the array:");
        for (int i = 0; i<a.length; i++)
	   {
	       a[i]=sc.nextInt();
	   } 
	int majorityElement = findMajorityElement(a);
	if(majorityElement)
	  {
	      System.out.println("the majority element is :"+majorityElement);
	  }
	else
	  {
	      System.out.println("There are no majority element in array");
	  }
    }
		public static int findMajorityElement(int nums[])
	{
	      int candidate=0; 
	      int count=0;
              for (int num : nums) {
            if (count == 0) {
                candidate = num;
            }
            count += (num == candidate) ? 1 : -1;
        }

        // Step 2: Verify that the candidate is actually the majority element
        count = 0;
        for (int num : nums) {
            if (num == candidate) {
                count++;
            }
        }

        // Check if the candidate occurs more than n/2 times
        if (count > nums.length / 2)
          {
            return candidate;
          }
	 else 
         {
            return -1;  // No majority element found
         }
    
	}
	
}