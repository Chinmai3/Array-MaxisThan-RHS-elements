import java.util.*;
public class Main{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++)
        {
            arr[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++)
        {
            int curr=arr[i];
            int max=arr[i];
            for(int j=i+1;j<n;j++)
            {
                if(arr[j]>max)
                {
                    max=arr[j];
                }
            }
            if(max==curr)
            {
                System.out.println(curr);
            }
        }
    }
}
