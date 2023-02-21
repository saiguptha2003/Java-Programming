import java.util.Scanner;
class patternNumber{
	public static void main(String [] args)
	{
		Scanner s=new Scanner(System.in);
		int n=s.nextInt();
		int k=0;
		for(int i=0;i<n;i++)
		{
			for(int j=0;j<i;j++)
			{
				System.out.print(k++ + " ");
			} 
			System.out.println();
		}
	}
}
