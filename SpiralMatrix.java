import java.util.*;

class SpiralMatrix {
    public static int Task(int arr[]) {
        int sum=0;
        int count = 0;
        int n=arr.length;
        for(int i=0;i<n;i++)
        {
            if(arr[i]==1)
            {
                count++;
            }else if(arr[i]==0)
            {
                sum=sum+count;
            }
        }
        return sum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements:");
        int n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter array elements:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int result = Task(arr);
        System.out.println("Total zeroes after 1s: " + result);
    }
}