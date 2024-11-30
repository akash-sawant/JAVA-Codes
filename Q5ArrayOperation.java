import java.util.Scanner;

interface ArrayOperation {
    void performOperation(int x[]);
}

class Sorting implements ArrayOperation {
    public void performOperation(int x[]) {
        for (int i = 0; i < x.length; i++) {
            for (int j = i + 1; j < x.length; j++) {
                if (x[i] > x[j]) {
                    int temp = x[i];
                    x[i] = x[j];
                    x[j] = temp;
                }
            }
        }
        System.out.println("After Sorting:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}

class Inseration implements ArrayOperation {
    int no, ind;

    void setValue(int value, int index) {
        no = value;
        ind = index;
    }

    public void performOperation(int x[]) {
         for(int i=0;i<x.length;i++){
			 if(i==ind){
				x[i]= no;
			 }
		 }
		 System.out.println("After Insertion:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
    
}

class Deletion implements ArrayOperation {
    int ind;
    void setIndex(int index) {
        ind = index;
    }
	   public void performOperation(int x[]) {
		   int Del_index;
		   int count=0;
		  for(int i=0;i<x.length;i++){
			if(i==ind){
				count++;
				for(int j=i;j<x.length;j++){
					x[j]=x[j+1];
					i--;
				}
			}
		  }
		  System.out.println("After position delete");
		 for(int i=0; i<x.length-1; i++){
		    System.out.println(x[i]+" ");
		}
		
	 }
}
	
class Rev implements ArrayOperation {
    public void performOperation(int x[]) {
        int left = 0, right = x.length - 1;

        while (left < right) {
            int temp = x[left];
            x[left] = x[right];
            x[right] = temp;
            left++;
            right--;
        }

        System.out.println("Reversed Array:");
        for (int i = 0; i < x.length; i++) {
            System.out.print(x[i] + " ");
        }
        System.out.println();
    }
}

public class Q5ArrayOperation {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);

        System.out.println("Enter the size of the array:");
        int size = scn.nextInt();
        int[] arr = new int[size];

        System.out.println("Enter the elements of the array:");
        for (int i = 0; i < size; i++) {
            arr[i] = scn.nextInt();
        }

        // Create objects for all operations
        Sorting sorting = new Sorting();
        Inseration insertion = new Inseration();
        Deletion deletion = new Deletion();
        Rev reverse = new Rev();

        while (true) {
            System.out.println("\nChoose an operation:");
            System.out.println("1. Sort");
            System.out.println("2. Insert");
            System.out.println("3. Delete");
            System.out.println("4. Reverse");
            System.out.println("5. Exit");
            int choice = scn.nextInt();

            switch (choice) {
                case 1:
                    sorting.performOperation(arr);
                    break;
                case 2:
                    System.out.println("Enter the value and index to insert:");
                    int value = scn.nextInt();
                    int index = scn.nextInt();
                    insertion.setValue(value, index);
                    insertion.performOperation(arr);
                    break;
                case 3:
                    System.out.println("Enter the index to delete:");
                    int delIndex = scn.nextInt();
                    deletion.setIndex(delIndex);
                    deletion.performOperation(arr);
                    break;
                case 4:
                    reverse.performOperation(arr);
                    break;
                case 5:
                    System.out.println("Exiting program.");
                 
                    return;
                default:
                    System.out.println("Invalid choice. Try again.");
			    
            }
        }
    }
}
