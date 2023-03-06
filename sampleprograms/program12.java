class program13{
    public static void main(String[] args) {
        int two[][]=new int[4][5];
        int k=32;
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
                two[i][j]=k;
                k++;
            }
        }
        for(int i=0;i<4;i++)
        {
            for(int j=0;j<5;j++)
            {
            System.out.println( two[i][j]+" ");

            }
            System.out.println();
        }
    }
}
