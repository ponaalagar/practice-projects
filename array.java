import java.util.Scanner;
public class array {
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        
        int[] arr= new int[10];
        int i=0;
        int sum=0;
        for(i=0;i<10;i++)
        {
            arr[i]=sc.nextInt();
            sum+=arr[i];
        }
        for(i=0;i<10;i++)
        {
            System.out.println("arr["+(i+1)+"] = "+arr[i]);
        }
        System.out.println("average ="+(sum/10));
        sc.close();
    }
}
