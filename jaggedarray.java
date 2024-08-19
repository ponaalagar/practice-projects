public class jaggedarray {
    public static void main(String[] args) {
        int[][] jaggedArray = new int[3][];
        jaggedArray[0]=new int[10];
        jaggedArray[1]=new int[20];
        jaggedArray[2]=new int[30];
        //filling the array with value
        int val=0;
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<jaggedArray[i].length;j++)
            {
                jaggedArray[i][j]=val++;
            }
        }
        for(int i=0;i<3;i++)
        {
            for(int j=0;j<jaggedArray[i].length;j++)
            {
                System.out.print(jaggedArray[i][j]+" ");
            }
            System.out.println();
        }
        
    }
}
