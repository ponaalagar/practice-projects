import java.util.Scanner;
class addition {
    public static void main(String [] args)
    {
        int[][] arr=new int[2][2];
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("value for ["+i+"]["+j+"] :");
                arr[i][j]=sc.nextInt();
            }
        }
        int[][] arr2=new int[2][2];

        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.println("value for ["+i+"]["+j+"] :");
                arr2[i][j]=sc.nextInt();
            }
        }
        for(int i=0;i<2;i++)
        {
            for(int j=0;j<2;j++)
            {
                System.out.print((arr[i][j]+arr2[i][j])+" ");
            }
            System.out.println();
        }
        
    }
    
}
